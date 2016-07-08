module d_ff_en(d, e, clk, reset, q);

parameter SIZE = 64;

input signed [SIZE-1:0] d;
input e, clk, reset;
output signed [SIZE-1:0] q;
wire signed [SIZE-1:0] d;
wire e, clk, reset;
reg signed [SIZE-1:0] q;

always @(posedge clk)
begin
    if (reset) q <= {SIZE{1'b0}};
    else begin
        if (e) q <= d;
        else q <= q;
    end
end

endmodule
