package translator;

import parser.*;
import semantics.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


/**
 * Classe que genera els circuits.
 * 
 * A partir de l'arbre obtingut per l'analitzador sintàctic i la informació 
 * proporcionada per l'analitzador semàntic, es genera un arxiu que descriu 
 * en Verilog un circuit lògic equivalent al programa que s'està traduint.
 */
public class Translator {
    
    /** Sortida on s'escriu el circuit resultant. */
    private BufferedWriter output;
    /** Arbre sintàctic del programa a traduir. */
    private HWCompilationTree root;
    /** Mida de tots els busos i registres del circuit. */
    private int size;
    /** Subarbres on es defineixen les funcions. */
    private HashMap<String, HWCompilationTree> functions;
    /** Noms de les funcions que realment s'han de traduir. */
    private TreeSet<String> used_functions;
    /** Nombre de crides a cada funció. */
    HashMap<String, Integer> number_of_calls;
    /** Nombre d'assignacions a cada variable de cada funció. */
    HashMap<String, HashMap<String, Integer> > number_of_assignments;
    /** Nombre de variables auxiliars usades. */
    private int aux_vars;
    /** Nombre de senyals <tt>enable</tt> auxiliars usats. */
    private int aux_enbls;
    
    
    /** Constructor principal. */
    public Translator(String output_path, HWCompilationTree tree, HashMap<String, HWCompilationTree> funcs, TreeSet<String> used, HashMap<String, Integer> calls, HashMap<String, HashMap<String, Integer> > assigns) throws IOException { 
        root = tree;
        functions = funcs;
        used_functions = used;
        number_of_calls = calls;
        number_of_assignments = assigns;
        String aux_size = root.getChild(0).getText();
        // Aquí s'assumeix que 'aux_size' conté un nombre positiu.
        if (aux_size.charAt(0) == '0' && aux_size.charAt(1) == 'b') {  // Binari.
            size = Integer.parseInt(aux_size.substring(2), 2);
        }
        else if (aux_size.charAt(0) == '0' && aux_size.charAt(1) == 'x') {  // Hexadecimal.
            size = Integer.parseInt(aux_size.substring(2), 16);
        }
        else {  // Decimal.
            size = Integer.parseInt(aux_size);
        }
        aux_vars = 0;
        aux_enbls = 0;
        output = new BufferedWriter(new FileWriter(output_path));
    }
    
    
    /** Generació del codi corresponent al programa a traduir.
     * 
     * Aquest mètode genera el circuit corresponent al control de 
     * l'activació de les diverses funcions i dels registres utilitzats i 
     * utilitza la resta de mètodes per generar el circuit que executa 
     * pròpiament les funcions.
     */
    public void translate_program() throws IOException {
        output.write("module program(clk, reset, main_exec_in_enable, main_exec_out_enable, main_main_out);"); output.newLine(); output.newLine();
        output.write("input clk, reset, main_exec_in_enable;"); output.newLine();
        output.write("wire clk, reset;"); output.newLine(); output.newLine();
        output.write("output main_exec_out_enable;"); output.newLine();
        output.write("output signed [" + Integer.toString(size - 1) + ":0] main_main_out;"); output.newLine(); output.newLine(); 
        int n_funcs = root.getChildCount();
        for (int f = 1; f < n_funcs; ++f) {
            HWCompilationTree func = root.getChild(f);
            String func_name = func.getChild(0).getText();
            if (used_functions.contains(func_name)) {
                translate_function(func);
            }
        }
        output.newLine(); output.newLine();
        output.write("endmodule"); output.newLine();
        output.close();
    }
    
    
    /** Generació del codi corresponent a una funció. 
     * 
     * Aquest mètode genera el circuit corresponent al control de 
     * l'activació de les diverses parts d'una funció: assignacions pel pas 
     * de paràmetres, crida per a l'execució de la funció, etc. 
     * Utilitza la resta de mètodes per generar el circuit que executa 
     * pròpiament les funcions.
     *
     * @param func és l'arrel del subarbre corresponent a la funció.
     */
    private void translate_function(HWCompilationTree func) throws IOException {
        assert func.getType() == hw_compilationLexer.FUNC;
        output.newLine(); output.newLine(); output.newLine();
        String func_name = func.getChild(0).getText(); 
        output.write("// Function translation : " + func_name); output.newLine();
        output.write("// ============================================================"); output.newLine(); output.newLine(); output.newLine();
        // Circuit per al tractament de paràmetres i variables.
        output.write("// Function parameters and variables (definition)"); output.newLine(); 
        output.write("// ------------------------------------------------------------"); output.newLine(); output.newLine();
        int n_childs_1 = func.getChildCount() - 1;
        for (int h = 1; h < n_childs_1; ++h) {
            HWCompilationTree vars = func.getChild(h);
            int type = vars.getType();
            assert type == hw_compilationLexer.ARG || type == hw_compilationLexer.VAR;
            int n_vars = vars.getChildCount();
            for (int i = 0; i < n_vars; ++i) {
                String var_name = vars.getChild(i).getText();
                translate_function_variable(var_name, func_name, type);
                output.newLine();
            }
            output.newLine();
        }  
        translate_function_variable(func_name, func_name, hw_compilationLexer.VAR);  // Variable de retorn.
        output.newLine(); output.newLine(); output.newLine();
        // Circuit del control d'execució de la funció. 
        output.write("// Control structure for the function execution (calls)"); output.newLine(); 
        output.write("// ------------------------------------------------------------"); output.newLine(); output.newLine();
        String enable_in = func_name + "_exec_in_enable";
        define_enable(enable_in);
        String enable_out = func_name + "_exec_out_enable";
        define_enable(enable_out);
        int n_calls = number_of_calls.get(func_name);
        if (n_calls > 0) {
            String enb_build = "1'b0";
            for (int j = 0; j < n_calls; ++j) { 
                String enb_in = func_name + "_" + Integer.toString(j) + "_exec_in_enable";
                define_enable(enb_in);
                String enb_out = func_name + "_" + Integer.toString(j) + "_exec_out_enable";
                define_enable(enb_out);
                String tmp1 = define_aux_enable(func_name);
                String tmp2 = define_aux_enable(func_name);
                String enb_reg = func_name + "_" + Integer.toString(j) + "_exec_reg_enable";
                define_flipflop(enb_reg, tmp1, tmp2);
                output.write("assign " + tmp1 + " = (" + enable_in + " & " + enb_in + ") | ((~" + enable_in + ") & " + tmp2 + ");");
                output.newLine();
                output.write("assign " + enb_out + " = " + enable_out + " & " + tmp2 + ";");
                output.newLine();
                enb_build += " | " + enb_in;
            }
            output.write("assign " + enable_in + " = " + enb_build + ";");
            output.newLine(); 
        }
        output.newLine(); output.newLine();
        // Traducció del cos de la funció.
        output.write("// Function body"); output.newLine(); 
        output.write("// ------------------------------------------------------------"); output.newLine(); output.newLine();
        translate_instructions(func.getChild(n_childs_1), enable_in, enable_out); 
        output.newLine(); output.newLine(); output.newLine();
    }
    
    
    /** Generació del codi corresponent a una variable (d'una funció). 
     * 
     * Aquest mètode genera el circuit corresponent al control de 
     * l'activació de les assignacions a una variable d'una funció (ja sigui 
     * una variable pròpiament o bé un argument de la funció).
     *
     * @param var_name és el nom de la variable considerada.
     * @param func_name és el nom de la funció on està definida la variable.
     * @param type indica el tipus de variable (variable o argument).
     */
    private void translate_function_variable(String var_name, String func_name, int type) throws IOException {
        String d_name = func_name + "_" + var_name + "_in";
        define_variable(d_name);
        String q_name = func_name + "_" + var_name + "_out";
        define_variable(q_name);
        String e_name = func_name + "_" + var_name + "_assign_enable";
        define_enable(e_name);
        String reg_name = func_name + "_" + var_name + "_reg";
        define_register(reg_name, d_name, q_name, e_name);
        StringBuilder in_build = new StringBuilder("{" + Integer.toString(size) + "{1'b0}}");
        StringBuilder enb_build = new StringBuilder("1'b0");
        if (type == hw_compilationLexer.ARG) {
            int n_calls = number_of_calls.get(func_name);
            for (int j = 0; j < n_calls; ++j) {  
                String label_name = func_name + "_" + Integer.toString(j) + "_" + var_name + "_call";
                translate_function_variable_helper(label_name, func_name, in_build, enb_build);
            }
        }
        int n_assigs = number_of_assignments.get(func_name).get(var_name);
        for (int j = 0; j < n_assigs; ++j) {  
            String label_name = func_name + "_" + Integer.toString(j) + "_" + var_name + "_assign";
            translate_function_variable_helper(label_name, func_name, in_build, enb_build);
        }
        output.write("assign " + d_name + " = " + in_build.toString() + ";");
        output.newLine();
        output.write("assign " + e_name + " = " + enb_build.toString() + ";");
        output.newLine();
    }
    
    
    /** Generació d'una part del codi corresponent a una variable. 
     * 
     * Aquest mètode defineix els elements del circuit corresponent al 
     * control de l'activació de les assignacions a una variable d'una funció 
     * (ja sigui una variable pròpiament o bé un argument de la funció).
     *
     * @param label_name és el prefix dels noms dels senyals auxiliars que 
     *            s'utilitzen.
     * @param func_name és el nom de la funció on està definida la variable.
     * @param in_build acumula el codi que servirà per crear el senyal 
     *            d'entrada al registre.
     * @param enb_build acumula el codi que servirà per crear el senyal 
     *            <tt>enable</tt> del registre.
     */
    private void translate_function_variable_helper(String label_name, String func_name, StringBuilder in_build, StringBuilder enb_build) throws IOException {
        String var = label_name + "_in";
        define_variable(var);
        String enb_in = label_name + "_in_enable";
        define_enable(enb_in);
        String enb_out = label_name + "_out_enable";
        define_enable(enb_out);
        String enb_reg = label_name + "_reg_enable"; 
        define_flipflop(enb_reg, enb_in, enb_out);
        String tmp = define_aux_variable(func_name);
        output.write("assign " + tmp + " = {" + Integer.toString(size) + "{" + enb_in + "}} & " + var + ";");
        output.newLine();
        in_build.append(" | " + tmp);
        enb_build.append(" | " + enb_in);
    }
    
    
    /** Generació del codi corresponent a una expressió. 
     * 
     * @param instr és l'arrel del subarbre corresponent a l'expressió.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     * @return el nom de la variable on s'emmagatzema el resultat de 
     *         l'expressió traduïda.
     */
    private String translate_expression(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr != null;
        output.newLine();
        int n_childs = instr.getChildCount();
        int type = instr.getType();
        String func_name = instr.getFuncName(); 
        if (n_childs == 0) {
            output.write("// Literal or access to variable"); output.newLine(); 
            output.write("assign " + enable_out + " = " + enable_in + ";");
            output.newLine();
            String val = "";
            String name = "";
            switch (type) {
                case hw_compilationLexer.ID:  // Variable.
                    name = func_name + "_" + instr.getText() + "_out";
                    output.newLine();
                    return name;
                case hw_compilationLexer.BINARY:
                    val = Integer.toString(size) + "'b" + instr.getText().substring(2);
                    name = define_aux_variable(func_name);
                    break;
                case hw_compilationLexer.HEX:
                    val = Integer.toString(size) + "'h" + instr.getText().substring(2);
                    name = define_aux_variable(func_name);
                    break;
                case hw_compilationLexer.DEC:
                    val = Integer.toString(size) + "'d" + instr.getText();
                    name = define_aux_variable(func_name);
                    break;
                default:
                    assert false;  // No s'hauria d'arribar aquí.
            }
            output.write("assign " + name + " = " + val + ";");
            output.newLine(); output.newLine();
            return name;
        }
        else if (n_childs == 1 && type != hw_compilationLexer.FUNC_CALL) {  // Operadors unaris.
            output.write("// Unary operator"); output.newLine();
            String val = translate_expression(instr.getChild(0), enable_in, enable_out);
            String name = define_aux_variable(func_name);
            switch (type) {
                case hw_compilationLexer.BWNOT:
                    output.write("assign " + name + " = ~" + val + ";");
                    break;
                case hw_compilationLexer.LNOT:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (!" + val + ")};");
                    break;
                case hw_compilationLexer.PLUS:
                    output.write("assign " + name + " = +" + val + ";");
                    break;
                case hw_compilationLexer.MINUS:
                    output.write("assign " + name + " = -" + val + ";");
                    break;
                default:
                    assert false;  // No s'hauria d'arribar aquí.
            }
            output.newLine(); output.newLine();
            return name;
        }
        else if (n_childs == 2 && type != hw_compilationLexer.FUNC_CALL) {  // Operadors binaris.
            output.write("// Binary operator"); output.newLine();
            String enable_mid = define_aux_enable(func_name);
            String val1 = translate_expression(instr.getChild(0), enable_in, enable_mid);
            String val2 = translate_expression(instr.getChild(1), enable_mid, enable_out);
            String name = define_aux_variable(func_name);
            switch (type) {
                case hw_compilationLexer.OR:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " || " + val2 + ")};");
                    break;
                case hw_compilationLexer.AND:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " && " + val2 + ")};");
                    break;
                case hw_compilationLexer.BWOR:
                    output.write("assign " + name + " = " + val1 + " | " + val2 + ";");
                    break;
                case hw_compilationLexer.BWAND:
                    output.write("assign " + name + " = " + val1 + " & " + val2 + ";");
                    break;
                case hw_compilationLexer.BWXOR:
                    output.write("assign " + name + " = " + val1 + " ^ " + val2 + ";");
                    break;
                case hw_compilationLexer.LEQ:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " == " + val2 + ")};");
                    break;
                case hw_compilationLexer.NEQ:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " != " + val2 + ")};");
                    break;
                case hw_compilationLexer.LT:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " < " + val2 + ")};");
                    break;
                case hw_compilationLexer.LTE:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " <= " + val2 + ")};");
                    break;
                case hw_compilationLexer.GT:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " > " + val2 + ")};");
                    break;
                case hw_compilationLexer.GTE:
                    output.write("assign " + name + " = {{" + Integer.toString(size - 1) + "{1'b0}}, (" + val1 + " >= " + val2 + ")};");
                    break;
                case hw_compilationLexer.SHIFT_LEFT:
                    output.write("assign " + name + " = " + val1 + " << " + val2 + ";");
                    break;
                case hw_compilationLexer.SHIFT_RIGHT:
                    output.write("assign " + name + " = " + val1 + " >> " + val2 + ";");
                    break;
                case hw_compilationLexer.PLUS:
                    output.write("assign " + name + " = " + val1 + " + " + val2 + ";");
                    break;
                case hw_compilationLexer.MINUS:
                    output.write("assign " + name + " = " + val1 + " - " + val2 + ";");
                    break;
                default:
                    assert false;  // No s'hauria d'arribar aquí.    
            }
            output.newLine(); output.newLine();
            return name;
        }
        else {  // Crida a funció.
            return translate_function_call(instr, enable_in, enable_out);
        }
    }
    
    
    /** Generació del codi corresponent a una crida a una funció. 
     * 
     * @param instr és l'arrel del subarbre corresponent a la crida.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     * @return el nom de la variable on s'emmagatzema el resultat de la 
     *         crida.
     */
    private String translate_function_call(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr.getType() == hw_compilationLexer.FUNC_CALL; 
        String func_name = instr.getFuncName();  
        String func_call_name = instr.getChild(0).getText();
        output.write("// Function call : " + func_call_name); output.newLine(); 
        int id_call = instr.getFuncCallId();
        String enable_before;
        String enable_after = enable_in;
        if (instr.getChildCount() > 1) {  // Pas de paràmetres.
            output.write("// Pass of arguments."); output.newLine();
            HWCompilationTree params = instr.getChild(1);
            int n_params = params.getChildCount();
            HWCompilationTree args = functions.get(func_call_name).getChild(1);
            assert args.getType() == hw_compilationLexer.ARG;
            for (int j = 0; j < n_params; ++j) {
                enable_before = enable_after;
                String enable_mid = define_aux_enable(func_name);
                String param = translate_expression(params.getChild(j), enable_before, enable_mid);
                enable_after = define_aux_enable(func_name);
                String arg_name = args.getChild(j).getText(); 
                String label_name = func_call_name + "_" + Integer.toString(id_call) + "_" + arg_name + "_call";
                translate_assignment_helper(label_name, param, enable_mid, enable_after);
            }
        }
        String label_name = func_call_name + "_" + Integer.toString(id_call) + "_exec"; 
        translate_assignment_enable_helper(label_name, enable_after, enable_out);
        output.newLine();
        return func_call_name + "_" + func_call_name + "_out"; 
    }
    
    
    /** Generació del codi corresponent a una llista d'instruccions. 
     * 
     * @param instr és l'arrel del subarbre corresponent a la llista.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la primera instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            l'última instrucció.
     */
    private void translate_instructions(HWCompilationTree list, String enable_in, String enable_out) throws IOException {
        assert list.getType() == hw_compilationLexer.INSTR_LIST;
        String func_name = list.getFuncName(); 
        String enable_before;
        String enable_after = enable_in;
        int n_instrs_1 = list.getChildCount() - 1;
        for (int i = 0; i < n_instrs_1; ++i) {
            enable_before = enable_after;
            enable_after = define_aux_enable(func_name);
            translate_instruction(list.getChild(i), enable_before, enable_after);
        }
        translate_instruction(list.getChild(n_instrs_1), enable_after, enable_out);
    }
    
    
    /** Generació del codi corresponent a una instrucció (en general). 
     * 
     * @param instr és l'arrel del subarbre corresponent a la instrucció.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_instruction(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr != null;
        output.newLine(); output.newLine();
        int type = instr.getType();
        switch (type) {
            case hw_compilationLexer.EQ:
                translate_assignment(instr, enable_in, enable_out);
                break;
            case hw_compilationLexer.IF:
                translate_conditional(instr, enable_in, enable_out);
                break;
            case hw_compilationLexer.WHILE:
                translate_loop(instr, enable_in, enable_out);
                break;
            default:
                assert false;  // No s'hauria d'arribar mai aquí.
        }
        output.newLine(); output.newLine();
    }
    
    
    /** Generació del codi corresponent a una assignació. 
     * 
     * @param instr és l'arrel del subarbre corresponent a l'assignació.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_assignment(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr.getType() == hw_compilationLexer.EQ;
        String func_name = instr.getFuncName(); 
        int id_assig = instr.getAssigId(); 
        String var_name = instr.getChild(0).getText();
        output.write("// Assignment : " + var_name); output.newLine(); output.newLine();
        output.write("// Right-hand-side"); output.newLine();
        String enable_mid = define_aux_enable(func_name);
        String val = translate_expression(instr.getChild(1), enable_in, enable_mid);
        output.write("// Left-hand-side"); output.newLine();
        String label_name = func_name + "_" + Integer.toString(id_assig) + "_" + var_name + "_assign";
        translate_assignment_helper(label_name, val, enable_mid, enable_out);
    }
    
    
    /** Generació del codi corresponent a una part d'una assignació. 
     * 
     * Aquest mètode s'utilitza tant en les pròpies assignacions com en les 
     * crides a funcions (que, per al pas de paràmetres, essencialment fan 
     * servir assignacions).
     * 
     * @param label_name és el prefix dels noms dels senyals auxiliars que 
     *            s'utilitzen.
     * @param val_name és el nom del senyal que s'està assignant.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_assignment_helper(String label_name, String val_name, String enable_in, String enable_out) throws IOException {
        output.write("assign " + label_name + "_in = " + val_name + ";");
        output.newLine();
        translate_assignment_enable_helper(label_name, enable_in, enable_out);
    }
    
    
    /** Generació del codi corresponent a una part d'una assignació. 
     * 
     * Aquest mètode s'utilitza tant en les pròpies assignacions com en les 
     * crides a funcions (que, per al pas de paràmetres, essencialment fan 
     * servir assignacions).
     * 
     * @param label_name és el prefix dels noms dels senyals auxiliars que 
     *            s'utilitzen.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_assignment_enable_helper(String label_name, String enable_in, String enable_out) throws IOException {
        output.write("assign " + label_name + "_in_enable = " + enable_in + ";");
        output.newLine();
        output.write("assign " + enable_out + " = " + label_name + "_out_enable;");
        output.newLine();
    }
    
    
    /** Generació del codi corresponent a una sentència condicional. 
     * 
     * @param instr és l'arrel del subarbre corresponent al condicional.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_conditional(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr.getType() == hw_compilationLexer.IF;
        output.write("// Conditional"); output.newLine(); output.newLine();
        String func_name = instr.getFuncName(); 
        output.write("// Condition test (conditional)"); output.newLine(); 
        String enable_mid = define_aux_enable(func_name);
        String cond = translate_expression(instr.getChild(0), enable_in, enable_mid);  // Avaluació de la condició.
        String red_cond = define_aux_enable(func_name);
        output.write("assign " + red_cond + " = (|" + cond + ");");  // Conversió a un únic bit.
        output.newLine();
        output.write("// Body (conditional)"); output.newLine();
        String enable_if = define_aux_enable(func_name);
        output.write("assign " + enable_if + " = " + red_cond + " & " + enable_mid + ";");
        output.newLine();
        String enable_else = define_aux_enable(func_name);
        output.write("assign " + enable_else + " = (~" + red_cond + ") & " + enable_mid + ";");
        output.newLine();
        String enable_if_end = define_aux_enable(func_name);
        String enable_else_end = define_aux_enable(func_name);
        int n_child = instr.getChildCount();
        if (n_child == 2) {  // No hi ha 'else'.
            output.write("// If branch"); output.newLine();
            translate_instructions(instr.getChild(1), enable_if, enable_if_end);  // Codi de la branca 'if'.
            output.write("assign " + enable_else_end + " = " + enable_else + ";");
            output.newLine();
        }
        else if (n_child == 3) {  // Hi ha 'else'.
            output.write("// If branch"); output.newLine();
            translate_instructions(instr.getChild(1), enable_if, enable_if_end);  // Codi de la branca 'if'.
            output.write("// Else branch"); output.newLine();
            translate_instructions(instr.getChild(2), enable_else, enable_else_end);  // Codi de la branca 'else'.
        }
        else {
            assert false;  // No s'hauria d'arribar mai aquí.
        }
        output.write("assign " + enable_out + " = " + enable_if_end + " | " + enable_else_end + ";");
        output.newLine();
    }
    
    
    /** Generació del codi corresponent a un bucle. 
     * 
     * @param instr és l'arrel del subarbre corresponent al bucle.
     * @param enable_in és el nom del senyal <tt>enable</tt> a l'entrada de 
     *            la instrucció.
     * @param enable_out és el nom del senyal <tt>enable</tt> a la sortida de 
     *            la instrucció.
     */
    private void translate_loop(HWCompilationTree instr, String enable_in, String enable_out) throws IOException {
        assert instr.getType() == hw_compilationLexer.WHILE;
        output.write("// Loop"); output.newLine(); output.newLine();
        String func_name = instr.getFuncName(); 
        output.write("// Condition test (loop)"); output.newLine();
        String enable_cond = define_aux_enable(func_name);
        String enable_mid = define_aux_enable(func_name);
        String cond = translate_expression(instr.getChild(0), enable_cond, enable_mid);  // Avaluació de la condició.
        String red_cond = define_aux_enable(func_name);
        output.write("assign " + red_cond + " = (|" + cond + ");");  // Conversió a un únic bit.
        output.newLine();
        output.write("// Body (loop)"); output.newLine();
        String enable_while = define_aux_enable(func_name);
        output.write("assign " + enable_while + " = " + red_cond + " & " + enable_mid + ";");
        output.newLine();
        String enable_while_end = define_aux_enable(func_name);
        translate_instructions(instr.getChild(1), enable_while, enable_while_end);  // Codi del bucle 'while'.
        output.write("assign " + enable_cond + " = " + enable_in + " | " + enable_while_end + ";");
        output.newLine();
        output.write("assign " + enable_out + " = (~" + red_cond + ") & " + enable_mid + ";");
        output.newLine();
    }
    
    
    /** Defineix una variable de Verilog ("un bus").
     * 
     * La variable creada és un vector de bits amb el nombre de bits usat 
     * en tot el programa a traduir i s'interpreta com un enter amb signe.
     *
     * @param name és el nom del senyal que es defineix.
     */
    private void define_variable(String name) throws IOException {
        output.write("wire signed [" + Integer.toString(size - 1) + ":0] " + name + ";");
        output.newLine();
    }
    
    
    /** Defineix un senyal <tt>enable</tt> a Verilog ("un cable").
     * 
     * La variable creada és un únic bit.
     *
     * @param name és el nom del senyal que es defineix.
     */
    private void define_enable(String name) throws IOException {
        output.write("wire " + name + ";");
        output.newLine();
    }
    
    
    /** Defineix un registre a Verilog per emmagatzemar una variable.
     * 
     * La variable creada és un vector de bits amb el nombre de bits usat 
     * en tot el programa a traduir i s'interpreta com un enter amb signe.
     * A la sortida del registre hi ha sempre el valor que hi havia en el 
     * cicle anterior. El valor del registre només s'actualitza quan hi ha 
     * un flanc ascendent del rellotge i el senyal <tt>enable</tt> és actiu.
     *
     * @param reg_name és el nom del registre que es defineix.
     * @param d_name és el nom del senyal d'entrada del registre.
     * @param q_name és el nom del senyal de sortida del registre.
     * @param e_name és el nom del senyal <tt>enable</tt> del registre.
     */
    private void define_register(String reg_name, String d_name, String q_name, String e_name) throws IOException {
        output.write("d_ff_en #(" + Integer.toString(size) + ") " + reg_name + "(" + d_name + ", " + e_name + ", clk, reset, " + q_name + ");");
        output.newLine();
    }
    
    
    /** Defineix un <it>flipflop</it> a Verilog..
     * 
     * La variable creada és un sol bit. 
     * A la sortida del <it>flipflop</it> hi ha sempre el valor que hi havia 
     * a l'entrada en el cicle anterior. El valor del registre només 
     * s'actualitza quan hi ha un flanc ascendent del rellotge.
     *
     * @param reg_name és el nom del registre que es defineix.
     * @param d_name és el nom del senyal d'entrada del registre.
     * @param q_name és el nom del senyal de sortida del registre.
     */
    private void define_flipflop(String reg_name, String d_name, String q_name) throws IOException {
        output.write("d_ff " + reg_name + "(" + d_name + ", clk, reset, " + q_name + ");");
        output.newLine();
    }
    
    
    /** Defineix una variable auxiliar.
     * 
     * @param func_name és el nom de la funció on s'utilitzarà aquesta 
     *            variable (s'utilitza per decidir el nom de la variable).
     * @return el nom de la variable auxiliar generada.
     */
    private String define_aux_variable(String func_name) throws IOException {
        String var_name = func_name + "_" + Integer.toString(aux_vars++) + "_aux";
        define_variable(var_name);
        return var_name;
    }
    
    
    /** Defineix un senyal <tt>enable</tt> auxiliar.
     * 
     * @param func_name és el nom de la funció on s'utilitzarà aquest 
     *            senyal (s'utilitza per decidir el nom del senyal).
     * @return el nom del senyal auxiliar generat.
     */
    private String define_aux_enable(String func_name) throws IOException {
        String enb_name = func_name + "_" + Integer.toString(aux_enbls++) + "_aux_enbl";
        define_enable(enb_name);
        return enb_name;
    }
    
}

