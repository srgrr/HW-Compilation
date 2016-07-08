module program(clk, reset, main_exec_in_enable, main_exec_out_enable, main_main_out);

input clk, reset, main_exec_in_enable;
wire clk, reset;

output main_exec_out_enable;
output signed [63:0] main_main_out;




// Function translation : mod_int64
// ============================================================


// Function parameters and variables (definition)
// ------------------------------------------------------------

wire signed [63:0] mod_int64_a_in;
wire signed [63:0] mod_int64_a_out;
wire mod_int64_a_assign_enable;
d_ff_en #(64) mod_int64_a_reg(mod_int64_a_in, mod_int64_a_assign_enable, clk, reset, mod_int64_a_out);
wire signed [63:0] mod_int64_0_a_call_in;
wire mod_int64_0_a_call_in_enable;
wire mod_int64_0_a_call_out_enable;
d_ff mod_int64_0_a_call_reg_enable(mod_int64_0_a_call_in_enable, clk, reset, mod_int64_0_a_call_out_enable);
wire signed [63:0] mod_int64_0_aux;
assign mod_int64_0_aux = {64{mod_int64_0_a_call_in_enable}} & mod_int64_0_a_call_in;
wire signed [63:0] mod_int64_1_a_call_in;
wire mod_int64_1_a_call_in_enable;
wire mod_int64_1_a_call_out_enable;
d_ff mod_int64_1_a_call_reg_enable(mod_int64_1_a_call_in_enable, clk, reset, mod_int64_1_a_call_out_enable);
wire signed [63:0] mod_int64_1_aux;
assign mod_int64_1_aux = {64{mod_int64_1_a_call_in_enable}} & mod_int64_1_a_call_in;
wire signed [63:0] mod_int64_0_a_assign_in;
wire mod_int64_0_a_assign_in_enable;
wire mod_int64_0_a_assign_out_enable;
d_ff mod_int64_0_a_assign_reg_enable(mod_int64_0_a_assign_in_enable, clk, reset, mod_int64_0_a_assign_out_enable);
wire signed [63:0] mod_int64_2_aux;
assign mod_int64_2_aux = {64{mod_int64_0_a_assign_in_enable}} & mod_int64_0_a_assign_in;
wire signed [63:0] mod_int64_1_a_assign_in;
wire mod_int64_1_a_assign_in_enable;
wire mod_int64_1_a_assign_out_enable;
d_ff mod_int64_1_a_assign_reg_enable(mod_int64_1_a_assign_in_enable, clk, reset, mod_int64_1_a_assign_out_enable);
wire signed [63:0] mod_int64_3_aux;
assign mod_int64_3_aux = {64{mod_int64_1_a_assign_in_enable}} & mod_int64_1_a_assign_in;
assign mod_int64_a_in = {64{1'b0}} | mod_int64_0_aux | mod_int64_1_aux | mod_int64_2_aux | mod_int64_3_aux;
assign mod_int64_a_assign_enable = 1'b0 | mod_int64_0_a_call_in_enable | mod_int64_1_a_call_in_enable | mod_int64_0_a_assign_in_enable | mod_int64_1_a_assign_in_enable;

wire signed [63:0] mod_int64_b_in;
wire signed [63:0] mod_int64_b_out;
wire mod_int64_b_assign_enable;
d_ff_en #(64) mod_int64_b_reg(mod_int64_b_in, mod_int64_b_assign_enable, clk, reset, mod_int64_b_out);
wire signed [63:0] mod_int64_0_b_call_in;
wire mod_int64_0_b_call_in_enable;
wire mod_int64_0_b_call_out_enable;
d_ff mod_int64_0_b_call_reg_enable(mod_int64_0_b_call_in_enable, clk, reset, mod_int64_0_b_call_out_enable);
wire signed [63:0] mod_int64_4_aux;
assign mod_int64_4_aux = {64{mod_int64_0_b_call_in_enable}} & mod_int64_0_b_call_in;
wire signed [63:0] mod_int64_1_b_call_in;
wire mod_int64_1_b_call_in_enable;
wire mod_int64_1_b_call_out_enable;
d_ff mod_int64_1_b_call_reg_enable(mod_int64_1_b_call_in_enable, clk, reset, mod_int64_1_b_call_out_enable);
wire signed [63:0] mod_int64_5_aux;
assign mod_int64_5_aux = {64{mod_int64_1_b_call_in_enable}} & mod_int64_1_b_call_in;
wire signed [63:0] mod_int64_0_b_assign_in;
wire mod_int64_0_b_assign_in_enable;
wire mod_int64_0_b_assign_out_enable;
d_ff mod_int64_0_b_assign_reg_enable(mod_int64_0_b_assign_in_enable, clk, reset, mod_int64_0_b_assign_out_enable);
wire signed [63:0] mod_int64_6_aux;
assign mod_int64_6_aux = {64{mod_int64_0_b_assign_in_enable}} & mod_int64_0_b_assign_in;
assign mod_int64_b_in = {64{1'b0}} | mod_int64_4_aux | mod_int64_5_aux | mod_int64_6_aux;
assign mod_int64_b_assign_enable = 1'b0 | mod_int64_0_b_call_in_enable | mod_int64_1_b_call_in_enable | mod_int64_0_b_assign_in_enable;


wire signed [63:0] mod_int64_mod_int64_in;
wire signed [63:0] mod_int64_mod_int64_out;
wire mod_int64_mod_int64_assign_enable;
d_ff_en #(64) mod_int64_mod_int64_reg(mod_int64_mod_int64_in, mod_int64_mod_int64_assign_enable, clk, reset, mod_int64_mod_int64_out);
wire signed [63:0] mod_int64_0_mod_int64_assign_in;
wire mod_int64_0_mod_int64_assign_in_enable;
wire mod_int64_0_mod_int64_assign_out_enable;
d_ff mod_int64_0_mod_int64_assign_reg_enable(mod_int64_0_mod_int64_assign_in_enable, clk, reset, mod_int64_0_mod_int64_assign_out_enable);
wire signed [63:0] mod_int64_7_aux;
assign mod_int64_7_aux = {64{mod_int64_0_mod_int64_assign_in_enable}} & mod_int64_0_mod_int64_assign_in;
assign mod_int64_mod_int64_in = {64{1'b0}} | mod_int64_7_aux;
assign mod_int64_mod_int64_assign_enable = 1'b0 | mod_int64_0_mod_int64_assign_in_enable;



// Control structure for the function execution (calls)
// ------------------------------------------------------------

wire mod_int64_exec_in_enable;
wire mod_int64_exec_out_enable;
wire mod_int64_0_exec_in_enable;
wire mod_int64_0_exec_out_enable;
wire mod_int64_0_aux_enbl;
wire mod_int64_1_aux_enbl;
d_ff mod_int64_0_exec_reg_enable(mod_int64_0_aux_enbl, clk, reset, mod_int64_1_aux_enbl);
assign mod_int64_0_aux_enbl = (mod_int64_exec_in_enable & mod_int64_0_exec_in_enable) | ((~mod_int64_exec_in_enable) & mod_int64_1_aux_enbl);
assign mod_int64_0_exec_out_enable = mod_int64_exec_out_enable & mod_int64_1_aux_enbl;
wire mod_int64_1_exec_in_enable;
wire mod_int64_1_exec_out_enable;
wire mod_int64_2_aux_enbl;
wire mod_int64_3_aux_enbl;
d_ff mod_int64_1_exec_reg_enable(mod_int64_2_aux_enbl, clk, reset, mod_int64_3_aux_enbl);
assign mod_int64_2_aux_enbl = (mod_int64_exec_in_enable & mod_int64_1_exec_in_enable) | ((~mod_int64_exec_in_enable) & mod_int64_3_aux_enbl);
assign mod_int64_1_exec_out_enable = mod_int64_exec_out_enable & mod_int64_3_aux_enbl;
assign mod_int64_exec_in_enable = 1'b0 | mod_int64_0_exec_in_enable | mod_int64_1_exec_in_enable;


// Function body
// ------------------------------------------------------------

wire mod_int64_4_aux_enbl;


// Conditional

// Condition test (conditional)
wire mod_int64_5_aux_enbl;

// Binary operator
wire mod_int64_6_aux_enbl;

// Literal or access to variable
assign mod_int64_6_aux_enbl = mod_int64_exec_in_enable;


// Literal or access to variable
assign mod_int64_5_aux_enbl = mod_int64_6_aux_enbl;
wire signed [63:0] mod_int64_8_aux;
assign mod_int64_8_aux = 64'd0;

wire signed [63:0] mod_int64_9_aux;
assign mod_int64_9_aux = {{63{1'b0}}, (mod_int64_b_out < mod_int64_8_aux)};

wire mod_int64_7_aux_enbl;
assign mod_int64_7_aux_enbl = (|mod_int64_9_aux);
// Body (conditional)
wire mod_int64_8_aux_enbl;
assign mod_int64_8_aux_enbl = mod_int64_7_aux_enbl & mod_int64_5_aux_enbl;
wire mod_int64_9_aux_enbl;
assign mod_int64_9_aux_enbl = (~mod_int64_7_aux_enbl) & mod_int64_5_aux_enbl;
wire mod_int64_10_aux_enbl;
wire mod_int64_11_aux_enbl;
// If branch


// Assignment : b

// Right-hand-side
wire mod_int64_12_aux_enbl;

// Unary operator

// Literal or access to variable
assign mod_int64_12_aux_enbl = mod_int64_8_aux_enbl;

wire signed [63:0] mod_int64_10_aux;
assign mod_int64_10_aux = -mod_int64_b_out;

// Left-hand-side
assign mod_int64_0_b_assign_in = mod_int64_10_aux;
assign mod_int64_0_b_assign_in_enable = mod_int64_12_aux_enbl;
assign mod_int64_10_aux_enbl = mod_int64_0_b_assign_out_enable;


assign mod_int64_11_aux_enbl = mod_int64_9_aux_enbl;
assign mod_int64_4_aux_enbl = mod_int64_10_aux_enbl | mod_int64_11_aux_enbl;


wire mod_int64_13_aux_enbl;


// Loop

// Condition test (loop)
wire mod_int64_14_aux_enbl;
wire mod_int64_15_aux_enbl;

// Binary operator
wire mod_int64_16_aux_enbl;

// Literal or access to variable
assign mod_int64_16_aux_enbl = mod_int64_14_aux_enbl;


// Literal or access to variable
assign mod_int64_15_aux_enbl = mod_int64_16_aux_enbl;
wire signed [63:0] mod_int64_11_aux;
assign mod_int64_11_aux = 64'd0;

wire signed [63:0] mod_int64_12_aux;
assign mod_int64_12_aux = {{63{1'b0}}, (mod_int64_a_out < mod_int64_11_aux)};

wire mod_int64_17_aux_enbl;
assign mod_int64_17_aux_enbl = (|mod_int64_12_aux);
// Body (loop)
wire mod_int64_18_aux_enbl;
assign mod_int64_18_aux_enbl = mod_int64_17_aux_enbl & mod_int64_15_aux_enbl;
wire mod_int64_19_aux_enbl;


// Assignment : a

// Right-hand-side
wire mod_int64_20_aux_enbl;

// Binary operator
wire mod_int64_21_aux_enbl;

// Literal or access to variable
assign mod_int64_21_aux_enbl = mod_int64_18_aux_enbl;


// Literal or access to variable
assign mod_int64_20_aux_enbl = mod_int64_21_aux_enbl;

wire signed [63:0] mod_int64_13_aux;
assign mod_int64_13_aux = mod_int64_a_out + mod_int64_b_out;

// Left-hand-side
assign mod_int64_0_a_assign_in = mod_int64_13_aux;
assign mod_int64_0_a_assign_in_enable = mod_int64_20_aux_enbl;
assign mod_int64_19_aux_enbl = mod_int64_0_a_assign_out_enable;


assign mod_int64_14_aux_enbl = mod_int64_4_aux_enbl | mod_int64_19_aux_enbl;
assign mod_int64_13_aux_enbl = (~mod_int64_17_aux_enbl) & mod_int64_15_aux_enbl;


wire mod_int64_22_aux_enbl;


// Loop

// Condition test (loop)
wire mod_int64_23_aux_enbl;
wire mod_int64_24_aux_enbl;

// Binary operator
wire mod_int64_25_aux_enbl;

// Literal or access to variable
assign mod_int64_25_aux_enbl = mod_int64_23_aux_enbl;


// Literal or access to variable
assign mod_int64_24_aux_enbl = mod_int64_25_aux_enbl;

wire signed [63:0] mod_int64_14_aux;
assign mod_int64_14_aux = {{63{1'b0}}, (mod_int64_a_out >= mod_int64_b_out)};

wire mod_int64_26_aux_enbl;
assign mod_int64_26_aux_enbl = (|mod_int64_14_aux);
// Body (loop)
wire mod_int64_27_aux_enbl;
assign mod_int64_27_aux_enbl = mod_int64_26_aux_enbl & mod_int64_24_aux_enbl;
wire mod_int64_28_aux_enbl;


// Assignment : a

// Right-hand-side
wire mod_int64_29_aux_enbl;

// Binary operator
wire mod_int64_30_aux_enbl;

// Literal or access to variable
assign mod_int64_30_aux_enbl = mod_int64_27_aux_enbl;


// Literal or access to variable
assign mod_int64_29_aux_enbl = mod_int64_30_aux_enbl;

wire signed [63:0] mod_int64_15_aux;
assign mod_int64_15_aux = mod_int64_a_out - mod_int64_b_out;

// Left-hand-side
assign mod_int64_1_a_assign_in = mod_int64_15_aux;
assign mod_int64_1_a_assign_in_enable = mod_int64_29_aux_enbl;
assign mod_int64_28_aux_enbl = mod_int64_1_a_assign_out_enable;


assign mod_int64_23_aux_enbl = mod_int64_13_aux_enbl | mod_int64_28_aux_enbl;
assign mod_int64_22_aux_enbl = (~mod_int64_26_aux_enbl) & mod_int64_24_aux_enbl;




// Assignment : mod_int64

// Right-hand-side
wire mod_int64_31_aux_enbl;

// Literal or access to variable
assign mod_int64_31_aux_enbl = mod_int64_22_aux_enbl;

// Left-hand-side
assign mod_int64_0_mod_int64_assign_in = mod_int64_a_out;
assign mod_int64_0_mod_int64_assign_in_enable = mod_int64_31_aux_enbl;
assign mod_int64_exec_out_enable = mod_int64_0_mod_int64_assign_out_enable;








// Function translation : gcd_int64
// ============================================================


// Function parameters and variables (definition)
// ------------------------------------------------------------

wire signed [63:0] gcd_int64_a_in;
wire signed [63:0] gcd_int64_a_out;
wire gcd_int64_a_assign_enable;
d_ff_en #(64) gcd_int64_a_reg(gcd_int64_a_in, gcd_int64_a_assign_enable, clk, reset, gcd_int64_a_out);
wire signed [63:0] gcd_int64_0_a_call_in;
wire gcd_int64_0_a_call_in_enable;
wire gcd_int64_0_a_call_out_enable;
d_ff gcd_int64_0_a_call_reg_enable(gcd_int64_0_a_call_in_enable, clk, reset, gcd_int64_0_a_call_out_enable);
wire signed [63:0] gcd_int64_16_aux;
assign gcd_int64_16_aux = {64{gcd_int64_0_a_call_in_enable}} & gcd_int64_0_a_call_in;
wire signed [63:0] gcd_int64_1_a_call_in;
wire gcd_int64_1_a_call_in_enable;
wire gcd_int64_1_a_call_out_enable;
d_ff gcd_int64_1_a_call_reg_enable(gcd_int64_1_a_call_in_enable, clk, reset, gcd_int64_1_a_call_out_enable);
wire signed [63:0] gcd_int64_17_aux;
assign gcd_int64_17_aux = {64{gcd_int64_1_a_call_in_enable}} & gcd_int64_1_a_call_in;
wire signed [63:0] gcd_int64_0_a_assign_in;
wire gcd_int64_0_a_assign_in_enable;
wire gcd_int64_0_a_assign_out_enable;
d_ff gcd_int64_0_a_assign_reg_enable(gcd_int64_0_a_assign_in_enable, clk, reset, gcd_int64_0_a_assign_out_enable);
wire signed [63:0] gcd_int64_18_aux;
assign gcd_int64_18_aux = {64{gcd_int64_0_a_assign_in_enable}} & gcd_int64_0_a_assign_in;
assign gcd_int64_a_in = {64{1'b0}} | gcd_int64_16_aux | gcd_int64_17_aux | gcd_int64_18_aux;
assign gcd_int64_a_assign_enable = 1'b0 | gcd_int64_0_a_call_in_enable | gcd_int64_1_a_call_in_enable | gcd_int64_0_a_assign_in_enable;

wire signed [63:0] gcd_int64_b_in;
wire signed [63:0] gcd_int64_b_out;
wire gcd_int64_b_assign_enable;
d_ff_en #(64) gcd_int64_b_reg(gcd_int64_b_in, gcd_int64_b_assign_enable, clk, reset, gcd_int64_b_out);
wire signed [63:0] gcd_int64_0_b_call_in;
wire gcd_int64_0_b_call_in_enable;
wire gcd_int64_0_b_call_out_enable;
d_ff gcd_int64_0_b_call_reg_enable(gcd_int64_0_b_call_in_enable, clk, reset, gcd_int64_0_b_call_out_enable);
wire signed [63:0] gcd_int64_19_aux;
assign gcd_int64_19_aux = {64{gcd_int64_0_b_call_in_enable}} & gcd_int64_0_b_call_in;
wire signed [63:0] gcd_int64_1_b_call_in;
wire gcd_int64_1_b_call_in_enable;
wire gcd_int64_1_b_call_out_enable;
d_ff gcd_int64_1_b_call_reg_enable(gcd_int64_1_b_call_in_enable, clk, reset, gcd_int64_1_b_call_out_enable);
wire signed [63:0] gcd_int64_20_aux;
assign gcd_int64_20_aux = {64{gcd_int64_1_b_call_in_enable}} & gcd_int64_1_b_call_in;
wire signed [63:0] gcd_int64_0_b_assign_in;
wire gcd_int64_0_b_assign_in_enable;
wire gcd_int64_0_b_assign_out_enable;
d_ff gcd_int64_0_b_assign_reg_enable(gcd_int64_0_b_assign_in_enable, clk, reset, gcd_int64_0_b_assign_out_enable);
wire signed [63:0] gcd_int64_21_aux;
assign gcd_int64_21_aux = {64{gcd_int64_0_b_assign_in_enable}} & gcd_int64_0_b_assign_in;
assign gcd_int64_b_in = {64{1'b0}} | gcd_int64_19_aux | gcd_int64_20_aux | gcd_int64_21_aux;
assign gcd_int64_b_assign_enable = 1'b0 | gcd_int64_0_b_call_in_enable | gcd_int64_1_b_call_in_enable | gcd_int64_0_b_assign_in_enable;


wire signed [63:0] gcd_int64_tmp_in;
wire signed [63:0] gcd_int64_tmp_out;
wire gcd_int64_tmp_assign_enable;
d_ff_en #(64) gcd_int64_tmp_reg(gcd_int64_tmp_in, gcd_int64_tmp_assign_enable, clk, reset, gcd_int64_tmp_out);
wire signed [63:0] gcd_int64_0_tmp_assign_in;
wire gcd_int64_0_tmp_assign_in_enable;
wire gcd_int64_0_tmp_assign_out_enable;
d_ff gcd_int64_0_tmp_assign_reg_enable(gcd_int64_0_tmp_assign_in_enable, clk, reset, gcd_int64_0_tmp_assign_out_enable);
wire signed [63:0] gcd_int64_22_aux;
assign gcd_int64_22_aux = {64{gcd_int64_0_tmp_assign_in_enable}} & gcd_int64_0_tmp_assign_in;
assign gcd_int64_tmp_in = {64{1'b0}} | gcd_int64_22_aux;
assign gcd_int64_tmp_assign_enable = 1'b0 | gcd_int64_0_tmp_assign_in_enable;


wire signed [63:0] gcd_int64_gcd_int64_in;
wire signed [63:0] gcd_int64_gcd_int64_out;
wire gcd_int64_gcd_int64_assign_enable;
d_ff_en #(64) gcd_int64_gcd_int64_reg(gcd_int64_gcd_int64_in, gcd_int64_gcd_int64_assign_enable, clk, reset, gcd_int64_gcd_int64_out);
wire signed [63:0] gcd_int64_0_gcd_int64_assign_in;
wire gcd_int64_0_gcd_int64_assign_in_enable;
wire gcd_int64_0_gcd_int64_assign_out_enable;
d_ff gcd_int64_0_gcd_int64_assign_reg_enable(gcd_int64_0_gcd_int64_assign_in_enable, clk, reset, gcd_int64_0_gcd_int64_assign_out_enable);
wire signed [63:0] gcd_int64_23_aux;
assign gcd_int64_23_aux = {64{gcd_int64_0_gcd_int64_assign_in_enable}} & gcd_int64_0_gcd_int64_assign_in;
assign gcd_int64_gcd_int64_in = {64{1'b0}} | gcd_int64_23_aux;
assign gcd_int64_gcd_int64_assign_enable = 1'b0 | gcd_int64_0_gcd_int64_assign_in_enable;



// Control structure for the function execution (calls)
// ------------------------------------------------------------

wire gcd_int64_exec_in_enable;
wire gcd_int64_exec_out_enable;
wire gcd_int64_0_exec_in_enable;
wire gcd_int64_0_exec_out_enable;
wire gcd_int64_32_aux_enbl;
wire gcd_int64_33_aux_enbl;
d_ff gcd_int64_0_exec_reg_enable(gcd_int64_32_aux_enbl, clk, reset, gcd_int64_33_aux_enbl);
assign gcd_int64_32_aux_enbl = (gcd_int64_exec_in_enable & gcd_int64_0_exec_in_enable) | ((~gcd_int64_exec_in_enable) & gcd_int64_33_aux_enbl);
assign gcd_int64_0_exec_out_enable = gcd_int64_exec_out_enable & gcd_int64_33_aux_enbl;
wire gcd_int64_1_exec_in_enable;
wire gcd_int64_1_exec_out_enable;
wire gcd_int64_34_aux_enbl;
wire gcd_int64_35_aux_enbl;
d_ff gcd_int64_1_exec_reg_enable(gcd_int64_34_aux_enbl, clk, reset, gcd_int64_35_aux_enbl);
assign gcd_int64_34_aux_enbl = (gcd_int64_exec_in_enable & gcd_int64_1_exec_in_enable) | ((~gcd_int64_exec_in_enable) & gcd_int64_35_aux_enbl);
assign gcd_int64_1_exec_out_enable = gcd_int64_exec_out_enable & gcd_int64_35_aux_enbl;
assign gcd_int64_exec_in_enable = 1'b0 | gcd_int64_0_exec_in_enable | gcd_int64_1_exec_in_enable;


// Function body
// ------------------------------------------------------------

wire gcd_int64_36_aux_enbl;


// Loop

// Condition test (loop)
wire gcd_int64_37_aux_enbl;
wire gcd_int64_38_aux_enbl;

// Binary operator
wire gcd_int64_39_aux_enbl;

// Literal or access to variable
assign gcd_int64_39_aux_enbl = gcd_int64_37_aux_enbl;


// Literal or access to variable
assign gcd_int64_38_aux_enbl = gcd_int64_39_aux_enbl;
wire signed [63:0] gcd_int64_24_aux;
assign gcd_int64_24_aux = 64'd0;

wire signed [63:0] gcd_int64_25_aux;
assign gcd_int64_25_aux = {{63{1'b0}}, (gcd_int64_b_out != gcd_int64_24_aux)};

wire gcd_int64_40_aux_enbl;
assign gcd_int64_40_aux_enbl = (|gcd_int64_25_aux);
// Body (loop)
wire gcd_int64_41_aux_enbl;
assign gcd_int64_41_aux_enbl = gcd_int64_40_aux_enbl & gcd_int64_38_aux_enbl;
wire gcd_int64_42_aux_enbl;
wire gcd_int64_43_aux_enbl;


// Assignment : tmp

// Right-hand-side
wire gcd_int64_44_aux_enbl;

// Literal or access to variable
assign gcd_int64_44_aux_enbl = gcd_int64_41_aux_enbl;

// Left-hand-side
assign gcd_int64_0_tmp_assign_in = gcd_int64_b_out;
assign gcd_int64_0_tmp_assign_in_enable = gcd_int64_44_aux_enbl;
assign gcd_int64_43_aux_enbl = gcd_int64_0_tmp_assign_out_enable;


wire gcd_int64_45_aux_enbl;


// Assignment : b

// Right-hand-side
wire gcd_int64_46_aux_enbl;

// Function call : mod_int64
// Pass of arguments.
wire gcd_int64_47_aux_enbl;

// Literal or access to variable
assign gcd_int64_47_aux_enbl = gcd_int64_43_aux_enbl;

wire gcd_int64_48_aux_enbl;
assign mod_int64_1_a_call_in = gcd_int64_a_out;
assign mod_int64_1_a_call_in_enable = gcd_int64_47_aux_enbl;
assign gcd_int64_48_aux_enbl = mod_int64_1_a_call_out_enable;
wire gcd_int64_49_aux_enbl;

// Literal or access to variable
assign gcd_int64_49_aux_enbl = gcd_int64_48_aux_enbl;

wire gcd_int64_50_aux_enbl;
assign mod_int64_1_b_call_in = gcd_int64_b_out;
assign mod_int64_1_b_call_in_enable = gcd_int64_49_aux_enbl;
assign gcd_int64_50_aux_enbl = mod_int64_1_b_call_out_enable;
assign mod_int64_1_exec_in_enable = gcd_int64_50_aux_enbl;
assign gcd_int64_46_aux_enbl = mod_int64_1_exec_out_enable;

// Left-hand-side
assign gcd_int64_0_b_assign_in = mod_int64_mod_int64_out;
assign gcd_int64_0_b_assign_in_enable = gcd_int64_46_aux_enbl;
assign gcd_int64_45_aux_enbl = gcd_int64_0_b_assign_out_enable;




// Assignment : a

// Right-hand-side
wire gcd_int64_51_aux_enbl;

// Literal or access to variable
assign gcd_int64_51_aux_enbl = gcd_int64_45_aux_enbl;

// Left-hand-side
assign gcd_int64_0_a_assign_in = gcd_int64_tmp_out;
assign gcd_int64_0_a_assign_in_enable = gcd_int64_51_aux_enbl;
assign gcd_int64_42_aux_enbl = gcd_int64_0_a_assign_out_enable;


assign gcd_int64_37_aux_enbl = gcd_int64_exec_in_enable | gcd_int64_42_aux_enbl;
assign gcd_int64_36_aux_enbl = (~gcd_int64_40_aux_enbl) & gcd_int64_38_aux_enbl;




// Assignment : gcd_int64

// Right-hand-side
wire gcd_int64_52_aux_enbl;

// Literal or access to variable
assign gcd_int64_52_aux_enbl = gcd_int64_36_aux_enbl;

// Left-hand-side
assign gcd_int64_0_gcd_int64_assign_in = gcd_int64_a_out;
assign gcd_int64_0_gcd_int64_assign_in_enable = gcd_int64_52_aux_enbl;
assign gcd_int64_exec_out_enable = gcd_int64_0_gcd_int64_assign_out_enable;








// Function translation : gcd_positive_int64
// ============================================================


// Function parameters and variables (definition)
// ------------------------------------------------------------

wire signed [63:0] gcd_positive_int64_a_in;
wire signed [63:0] gcd_positive_int64_a_out;
wire gcd_positive_int64_a_assign_enable;
d_ff_en #(64) gcd_positive_int64_a_reg(gcd_positive_int64_a_in, gcd_positive_int64_a_assign_enable, clk, reset, gcd_positive_int64_a_out);
wire signed [63:0] gcd_positive_int64_0_a_call_in;
wire gcd_positive_int64_0_a_call_in_enable;
wire gcd_positive_int64_0_a_call_out_enable;
d_ff gcd_positive_int64_0_a_call_reg_enable(gcd_positive_int64_0_a_call_in_enable, clk, reset, gcd_positive_int64_0_a_call_out_enable);
wire signed [63:0] gcd_positive_int64_26_aux;
assign gcd_positive_int64_26_aux = {64{gcd_positive_int64_0_a_call_in_enable}} & gcd_positive_int64_0_a_call_in;
wire signed [63:0] gcd_positive_int64_0_a_assign_in;
wire gcd_positive_int64_0_a_assign_in_enable;
wire gcd_positive_int64_0_a_assign_out_enable;
d_ff gcd_positive_int64_0_a_assign_reg_enable(gcd_positive_int64_0_a_assign_in_enable, clk, reset, gcd_positive_int64_0_a_assign_out_enable);
wire signed [63:0] gcd_positive_int64_27_aux;
assign gcd_positive_int64_27_aux = {64{gcd_positive_int64_0_a_assign_in_enable}} & gcd_positive_int64_0_a_assign_in;
assign gcd_positive_int64_a_in = {64{1'b0}} | gcd_positive_int64_26_aux | gcd_positive_int64_27_aux;
assign gcd_positive_int64_a_assign_enable = 1'b0 | gcd_positive_int64_0_a_call_in_enable | gcd_positive_int64_0_a_assign_in_enable;

wire signed [63:0] gcd_positive_int64_b_in;
wire signed [63:0] gcd_positive_int64_b_out;
wire gcd_positive_int64_b_assign_enable;
d_ff_en #(64) gcd_positive_int64_b_reg(gcd_positive_int64_b_in, gcd_positive_int64_b_assign_enable, clk, reset, gcd_positive_int64_b_out);
wire signed [63:0] gcd_positive_int64_0_b_call_in;
wire gcd_positive_int64_0_b_call_in_enable;
wire gcd_positive_int64_0_b_call_out_enable;
d_ff gcd_positive_int64_0_b_call_reg_enable(gcd_positive_int64_0_b_call_in_enable, clk, reset, gcd_positive_int64_0_b_call_out_enable);
wire signed [63:0] gcd_positive_int64_28_aux;
assign gcd_positive_int64_28_aux = {64{gcd_positive_int64_0_b_call_in_enable}} & gcd_positive_int64_0_b_call_in;
wire signed [63:0] gcd_positive_int64_0_b_assign_in;
wire gcd_positive_int64_0_b_assign_in_enable;
wire gcd_positive_int64_0_b_assign_out_enable;
d_ff gcd_positive_int64_0_b_assign_reg_enable(gcd_positive_int64_0_b_assign_in_enable, clk, reset, gcd_positive_int64_0_b_assign_out_enable);
wire signed [63:0] gcd_positive_int64_29_aux;
assign gcd_positive_int64_29_aux = {64{gcd_positive_int64_0_b_assign_in_enable}} & gcd_positive_int64_0_b_assign_in;
assign gcd_positive_int64_b_in = {64{1'b0}} | gcd_positive_int64_28_aux | gcd_positive_int64_29_aux;
assign gcd_positive_int64_b_assign_enable = 1'b0 | gcd_positive_int64_0_b_call_in_enable | gcd_positive_int64_0_b_assign_in_enable;


wire signed [63:0] gcd_positive_int64_gcd_positive_int64_in;
wire signed [63:0] gcd_positive_int64_gcd_positive_int64_out;
wire gcd_positive_int64_gcd_positive_int64_assign_enable;
d_ff_en #(64) gcd_positive_int64_gcd_positive_int64_reg(gcd_positive_int64_gcd_positive_int64_in, gcd_positive_int64_gcd_positive_int64_assign_enable, clk, reset, gcd_positive_int64_gcd_positive_int64_out);
wire signed [63:0] gcd_positive_int64_0_gcd_positive_int64_assign_in;
wire gcd_positive_int64_0_gcd_positive_int64_assign_in_enable;
wire gcd_positive_int64_0_gcd_positive_int64_assign_out_enable;
d_ff gcd_positive_int64_0_gcd_positive_int64_assign_reg_enable(gcd_positive_int64_0_gcd_positive_int64_assign_in_enable, clk, reset, gcd_positive_int64_0_gcd_positive_int64_assign_out_enable);
wire signed [63:0] gcd_positive_int64_30_aux;
assign gcd_positive_int64_30_aux = {64{gcd_positive_int64_0_gcd_positive_int64_assign_in_enable}} & gcd_positive_int64_0_gcd_positive_int64_assign_in;
assign gcd_positive_int64_gcd_positive_int64_in = {64{1'b0}} | gcd_positive_int64_30_aux;
assign gcd_positive_int64_gcd_positive_int64_assign_enable = 1'b0 | gcd_positive_int64_0_gcd_positive_int64_assign_in_enable;



// Control structure for the function execution (calls)
// ------------------------------------------------------------

wire gcd_positive_int64_exec_in_enable;
wire gcd_positive_int64_exec_out_enable;
wire gcd_positive_int64_0_exec_in_enable;
wire gcd_positive_int64_0_exec_out_enable;
wire gcd_positive_int64_53_aux_enbl;
wire gcd_positive_int64_54_aux_enbl;
d_ff gcd_positive_int64_0_exec_reg_enable(gcd_positive_int64_53_aux_enbl, clk, reset, gcd_positive_int64_54_aux_enbl);
assign gcd_positive_int64_53_aux_enbl = (gcd_positive_int64_exec_in_enable & gcd_positive_int64_0_exec_in_enable) | ((~gcd_positive_int64_exec_in_enable) & gcd_positive_int64_54_aux_enbl);
assign gcd_positive_int64_0_exec_out_enable = gcd_positive_int64_exec_out_enable & gcd_positive_int64_54_aux_enbl;
assign gcd_positive_int64_exec_in_enable = 1'b0 | gcd_positive_int64_0_exec_in_enable;


// Function body
// ------------------------------------------------------------

wire gcd_positive_int64_55_aux_enbl;


// Loop

// Condition test (loop)
wire gcd_positive_int64_56_aux_enbl;
wire gcd_positive_int64_57_aux_enbl;

// Binary operator
wire gcd_positive_int64_58_aux_enbl;

// Literal or access to variable
assign gcd_positive_int64_58_aux_enbl = gcd_positive_int64_56_aux_enbl;


// Literal or access to variable
assign gcd_positive_int64_57_aux_enbl = gcd_positive_int64_58_aux_enbl;

wire signed [63:0] gcd_positive_int64_31_aux;
assign gcd_positive_int64_31_aux = {{63{1'b0}}, (gcd_positive_int64_a_out != gcd_positive_int64_b_out)};

wire gcd_positive_int64_59_aux_enbl;
assign gcd_positive_int64_59_aux_enbl = (|gcd_positive_int64_31_aux);
// Body (loop)
wire gcd_positive_int64_60_aux_enbl;
assign gcd_positive_int64_60_aux_enbl = gcd_positive_int64_59_aux_enbl & gcd_positive_int64_57_aux_enbl;
wire gcd_positive_int64_61_aux_enbl;


// Conditional

// Condition test (conditional)
wire gcd_positive_int64_62_aux_enbl;

// Binary operator
wire gcd_positive_int64_63_aux_enbl;

// Literal or access to variable
assign gcd_positive_int64_63_aux_enbl = gcd_positive_int64_60_aux_enbl;


// Literal or access to variable
assign gcd_positive_int64_62_aux_enbl = gcd_positive_int64_63_aux_enbl;

wire signed [63:0] gcd_positive_int64_32_aux;
assign gcd_positive_int64_32_aux = {{63{1'b0}}, (gcd_positive_int64_a_out > gcd_positive_int64_b_out)};

wire gcd_positive_int64_64_aux_enbl;
assign gcd_positive_int64_64_aux_enbl = (|gcd_positive_int64_32_aux);
// Body (conditional)
wire gcd_positive_int64_65_aux_enbl;
assign gcd_positive_int64_65_aux_enbl = gcd_positive_int64_64_aux_enbl & gcd_positive_int64_62_aux_enbl;
wire gcd_positive_int64_66_aux_enbl;
assign gcd_positive_int64_66_aux_enbl = (~gcd_positive_int64_64_aux_enbl) & gcd_positive_int64_62_aux_enbl;
wire gcd_positive_int64_67_aux_enbl;
wire gcd_positive_int64_68_aux_enbl;
// If branch


// Assignment : a

// Right-hand-side
wire gcd_positive_int64_69_aux_enbl;

// Binary operator
wire gcd_positive_int64_70_aux_enbl;

// Literal or access to variable
assign gcd_positive_int64_70_aux_enbl = gcd_positive_int64_65_aux_enbl;


// Literal or access to variable
assign gcd_positive_int64_69_aux_enbl = gcd_positive_int64_70_aux_enbl;

wire signed [63:0] gcd_positive_int64_33_aux;
assign gcd_positive_int64_33_aux = gcd_positive_int64_a_out - gcd_positive_int64_b_out;

// Left-hand-side
assign gcd_positive_int64_0_a_assign_in = gcd_positive_int64_33_aux;
assign gcd_positive_int64_0_a_assign_in_enable = gcd_positive_int64_69_aux_enbl;
assign gcd_positive_int64_67_aux_enbl = gcd_positive_int64_0_a_assign_out_enable;


// Else branch


// Assignment : b

// Right-hand-side
wire gcd_positive_int64_71_aux_enbl;

// Binary operator
wire gcd_positive_int64_72_aux_enbl;

// Literal or access to variable
assign gcd_positive_int64_72_aux_enbl = gcd_positive_int64_66_aux_enbl;


// Literal or access to variable
assign gcd_positive_int64_71_aux_enbl = gcd_positive_int64_72_aux_enbl;

wire signed [63:0] gcd_positive_int64_34_aux;
assign gcd_positive_int64_34_aux = gcd_positive_int64_b_out - gcd_positive_int64_a_out;

// Left-hand-side
assign gcd_positive_int64_0_b_assign_in = gcd_positive_int64_34_aux;
assign gcd_positive_int64_0_b_assign_in_enable = gcd_positive_int64_71_aux_enbl;
assign gcd_positive_int64_68_aux_enbl = gcd_positive_int64_0_b_assign_out_enable;


assign gcd_positive_int64_61_aux_enbl = gcd_positive_int64_67_aux_enbl | gcd_positive_int64_68_aux_enbl;


assign gcd_positive_int64_56_aux_enbl = gcd_positive_int64_exec_in_enable | gcd_positive_int64_61_aux_enbl;
assign gcd_positive_int64_55_aux_enbl = (~gcd_positive_int64_59_aux_enbl) & gcd_positive_int64_57_aux_enbl;




// Assignment : gcd_positive_int64

// Right-hand-side
wire gcd_positive_int64_73_aux_enbl;

// Literal or access to variable
assign gcd_positive_int64_73_aux_enbl = gcd_positive_int64_55_aux_enbl;

// Left-hand-side
assign gcd_positive_int64_0_gcd_positive_int64_assign_in = gcd_positive_int64_a_out;
assign gcd_positive_int64_0_gcd_positive_int64_assign_in_enable = gcd_positive_int64_73_aux_enbl;
assign gcd_positive_int64_exec_out_enable = gcd_positive_int64_0_gcd_positive_int64_assign_out_enable;








// Function translation : main
// ============================================================


// Function parameters and variables (definition)
// ------------------------------------------------------------

wire signed [63:0] main_x_in;
wire signed [63:0] main_x_out;
wire main_x_assign_enable;
d_ff_en #(64) main_x_reg(main_x_in, main_x_assign_enable, clk, reset, main_x_out);
wire signed [63:0] main_0_x_assign_in;
wire main_0_x_assign_in_enable;
wire main_0_x_assign_out_enable;
d_ff main_0_x_assign_reg_enable(main_0_x_assign_in_enable, clk, reset, main_0_x_assign_out_enable);
wire signed [63:0] main_35_aux;
assign main_35_aux = {64{main_0_x_assign_in_enable}} & main_0_x_assign_in;
assign main_x_in = {64{1'b0}} | main_35_aux;
assign main_x_assign_enable = 1'b0 | main_0_x_assign_in_enable;

wire signed [63:0] main_y_in;
wire signed [63:0] main_y_out;
wire main_y_assign_enable;
d_ff_en #(64) main_y_reg(main_y_in, main_y_assign_enable, clk, reset, main_y_out);
wire signed [63:0] main_0_y_assign_in;
wire main_0_y_assign_in_enable;
wire main_0_y_assign_out_enable;
d_ff main_0_y_assign_reg_enable(main_0_y_assign_in_enable, clk, reset, main_0_y_assign_out_enable);
wire signed [63:0] main_36_aux;
assign main_36_aux = {64{main_0_y_assign_in_enable}} & main_0_y_assign_in;
assign main_y_in = {64{1'b0}} | main_36_aux;
assign main_y_assign_enable = 1'b0 | main_0_y_assign_in_enable;


wire signed [63:0] main_main_in;
wire signed [63:0] main_main_out;
wire main_main_assign_enable;
d_ff_en #(64) main_main_reg(main_main_in, main_main_assign_enable, clk, reset, main_main_out);
wire signed [63:0] main_0_main_assign_in;
wire main_0_main_assign_in_enable;
wire main_0_main_assign_out_enable;
d_ff main_0_main_assign_reg_enable(main_0_main_assign_in_enable, clk, reset, main_0_main_assign_out_enable);
wire signed [63:0] main_37_aux;
assign main_37_aux = {64{main_0_main_assign_in_enable}} & main_0_main_assign_in;
wire signed [63:0] main_1_main_assign_in;
wire main_1_main_assign_in_enable;
wire main_1_main_assign_out_enable;
d_ff main_1_main_assign_reg_enable(main_1_main_assign_in_enable, clk, reset, main_1_main_assign_out_enable);
wire signed [63:0] main_38_aux;
assign main_38_aux = {64{main_1_main_assign_in_enable}} & main_1_main_assign_in;
wire signed [63:0] main_2_main_assign_in;
wire main_2_main_assign_in_enable;
wire main_2_main_assign_out_enable;
d_ff main_2_main_assign_reg_enable(main_2_main_assign_in_enable, clk, reset, main_2_main_assign_out_enable);
wire signed [63:0] main_39_aux;
assign main_39_aux = {64{main_2_main_assign_in_enable}} & main_2_main_assign_in;
wire signed [63:0] main_3_main_assign_in;
wire main_3_main_assign_in_enable;
wire main_3_main_assign_out_enable;
d_ff main_3_main_assign_reg_enable(main_3_main_assign_in_enable, clk, reset, main_3_main_assign_out_enable);
wire signed [63:0] main_40_aux;
assign main_40_aux = {64{main_3_main_assign_in_enable}} & main_3_main_assign_in;
assign main_main_in = {64{1'b0}} | main_37_aux | main_38_aux | main_39_aux | main_40_aux;
assign main_main_assign_enable = 1'b0 | main_0_main_assign_in_enable | main_1_main_assign_in_enable | main_2_main_assign_in_enable | main_3_main_assign_in_enable;



// Control structure for the function execution (calls)
// ------------------------------------------------------------

wire main_exec_in_enable;
wire main_exec_out_enable;


// Function body
// ------------------------------------------------------------

wire main_74_aux_enbl;


// Assignment : x

// Right-hand-side
wire main_75_aux_enbl;

// Function call : mod_int64
// Pass of arguments.
wire main_76_aux_enbl;

// Unary operator

// Literal or access to variable
assign main_76_aux_enbl = main_exec_in_enable;
wire signed [63:0] main_41_aux;
assign main_41_aux = 64'd154;

wire signed [63:0] main_42_aux;
assign main_42_aux = -main_41_aux;

wire main_77_aux_enbl;
assign mod_int64_0_a_call_in = main_42_aux;
assign mod_int64_0_a_call_in_enable = main_76_aux_enbl;
assign main_77_aux_enbl = mod_int64_0_a_call_out_enable;
wire main_78_aux_enbl;

// Unary operator

// Literal or access to variable
assign main_78_aux_enbl = main_77_aux_enbl;
wire signed [63:0] main_43_aux;
assign main_43_aux = 64'd25;

wire signed [63:0] main_44_aux;
assign main_44_aux = -main_43_aux;

wire main_79_aux_enbl;
assign mod_int64_0_b_call_in = main_44_aux;
assign mod_int64_0_b_call_in_enable = main_78_aux_enbl;
assign main_79_aux_enbl = mod_int64_0_b_call_out_enable;
assign mod_int64_0_exec_in_enable = main_79_aux_enbl;
assign main_75_aux_enbl = mod_int64_0_exec_out_enable;

// Left-hand-side
assign main_0_x_assign_in = mod_int64_mod_int64_out;
assign main_0_x_assign_in_enable = main_75_aux_enbl;
assign main_74_aux_enbl = main_0_x_assign_out_enable;


wire main_80_aux_enbl;


// Assignment : main

// Right-hand-side
wire main_81_aux_enbl;

// Literal or access to variable
assign main_81_aux_enbl = main_74_aux_enbl;

// Left-hand-side
assign main_0_main_assign_in = main_x_out;
assign main_0_main_assign_in_enable = main_81_aux_enbl;
assign main_80_aux_enbl = main_0_main_assign_out_enable;


wire main_82_aux_enbl;


// Assignment : y

// Right-hand-side
wire main_83_aux_enbl;

// Function call : gcd_int64
// Pass of arguments.
wire main_84_aux_enbl;

// Literal or access to variable
assign main_84_aux_enbl = main_80_aux_enbl;
wire signed [63:0] main_45_aux;
assign main_45_aux = 64'd30;

wire main_85_aux_enbl;
assign gcd_int64_0_a_call_in = main_45_aux;
assign gcd_int64_0_a_call_in_enable = main_84_aux_enbl;
assign main_85_aux_enbl = gcd_int64_0_a_call_out_enable;
wire main_86_aux_enbl;

// Literal or access to variable
assign main_86_aux_enbl = main_85_aux_enbl;

wire main_87_aux_enbl;
assign gcd_int64_0_b_call_in = main_x_out;
assign gcd_int64_0_b_call_in_enable = main_86_aux_enbl;
assign main_87_aux_enbl = gcd_int64_0_b_call_out_enable;
assign gcd_int64_0_exec_in_enable = main_87_aux_enbl;
assign main_83_aux_enbl = gcd_int64_0_exec_out_enable;

// Left-hand-side
assign main_0_y_assign_in = gcd_int64_gcd_int64_out;
assign main_0_y_assign_in_enable = main_83_aux_enbl;
assign main_82_aux_enbl = main_0_y_assign_out_enable;


wire main_88_aux_enbl;


// Assignment : main

// Right-hand-side
wire main_89_aux_enbl;

// Literal or access to variable
assign main_89_aux_enbl = main_82_aux_enbl;

// Left-hand-side
assign main_1_main_assign_in = main_y_out;
assign main_1_main_assign_in_enable = main_89_aux_enbl;
assign main_88_aux_enbl = main_1_main_assign_out_enable;


wire main_90_aux_enbl;


// Assignment : main

// Right-hand-side
wire main_91_aux_enbl;

// Function call : gcd_positive_int64
// Pass of arguments.
wire main_92_aux_enbl;

// Literal or access to variable
assign main_92_aux_enbl = main_88_aux_enbl;
wire signed [63:0] main_46_aux;
assign main_46_aux = 64'd16;

wire main_93_aux_enbl;
assign gcd_positive_int64_0_a_call_in = main_46_aux;
assign gcd_positive_int64_0_a_call_in_enable = main_92_aux_enbl;
assign main_93_aux_enbl = gcd_positive_int64_0_a_call_out_enable;
wire main_94_aux_enbl;

// Literal or access to variable
assign main_94_aux_enbl = main_93_aux_enbl;

wire main_95_aux_enbl;
assign gcd_positive_int64_0_b_call_in = main_x_out;
assign gcd_positive_int64_0_b_call_in_enable = main_94_aux_enbl;
assign main_95_aux_enbl = gcd_positive_int64_0_b_call_out_enable;
assign gcd_positive_int64_0_exec_in_enable = main_95_aux_enbl;
assign main_91_aux_enbl = gcd_positive_int64_0_exec_out_enable;

// Left-hand-side
assign main_2_main_assign_in = gcd_positive_int64_gcd_positive_int64_out;
assign main_2_main_assign_in_enable = main_91_aux_enbl;
assign main_90_aux_enbl = main_2_main_assign_out_enable;




// Assignment : main

// Right-hand-side
wire main_96_aux_enbl;

// Function call : gcd_int64
// Pass of arguments.
wire main_97_aux_enbl;

// Unary operator

// Literal or access to variable
assign main_97_aux_enbl = main_90_aux_enbl;
wire signed [63:0] main_47_aux;
assign main_47_aux = 64'd8;

wire signed [63:0] main_48_aux;
assign main_48_aux = -main_47_aux;

wire main_98_aux_enbl;
assign gcd_int64_1_a_call_in = main_48_aux;
assign gcd_int64_1_a_call_in_enable = main_97_aux_enbl;
assign main_98_aux_enbl = gcd_int64_1_a_call_out_enable;
wire main_99_aux_enbl;

// Literal or access to variable
assign main_99_aux_enbl = main_98_aux_enbl;
wire signed [63:0] main_49_aux;
assign main_49_aux = 64'd30;

wire main_100_aux_enbl;
assign gcd_int64_1_b_call_in = main_49_aux;
assign gcd_int64_1_b_call_in_enable = main_99_aux_enbl;
assign main_100_aux_enbl = gcd_int64_1_b_call_out_enable;
assign gcd_int64_1_exec_in_enable = main_100_aux_enbl;
assign main_96_aux_enbl = gcd_int64_1_exec_out_enable;

// Left-hand-side
assign main_3_main_assign_in = gcd_int64_gcd_int64_out;
assign main_3_main_assign_in_enable = main_96_aux_enbl;
assign main_exec_out_enable = main_3_main_assign_out_enable;







endmodule
