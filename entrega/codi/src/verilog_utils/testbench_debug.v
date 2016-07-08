module test;

reg clk;
reg reset;
reg enb_in;
wire enb_out;
wire signed [63:0] result;

program prog(clk, reset, enb_in, enb_out, result);

always
    #10 clk = ~clk;

initial begin
    $monitor("%t -- %h -- %h -- %h -- %h -- %h (%0d)", $time, clk, reset, enb_in, enb_out, result, result);
    clk = 0;
    reset = 1;
    enb_in = 0;
    #21 reset = 0;
    enb_in = 1;
    @(negedge clk);
    enb_in = 0;

    // Quan l'execució del circuit acaba, es mostra el resultat i finalitza la
    // simulació.
    @(negedge enb_out);
    $display($time, " -- Output : %h (%0d)", result, result);
    $stop;
   
end

endmodule

