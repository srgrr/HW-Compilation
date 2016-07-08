module test;

reg reset = 0;
initial begin
    #17 reset = 1;
    #11 reset = 0;
    #29 reset = 1;
    #11 reset = 0;
    #100 $stop;
end

reg clk = 0;
always
    #5 clk = !clk;

wire [31:0] val;
counter c1(val, clk, reset);

initial 
    $monitor("At time %t, value = %h (%0d)", $time, val, val);

endmodule

