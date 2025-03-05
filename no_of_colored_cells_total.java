class Solution {
    public long coloredCells(int n) {
        return 1L+2L*(n-1)*n;
    }
}
//here if you see tbe representation of the series goes like 
//this increases in this way 
//let us take n=3 
//so then at first 1 then 4 then 8 = 13
//if n=4
//1 + 4 + 2(4) + 3(4) = 25
//1+4(1+2...+n) = 1+2(n-1)n
//yes then we can get the result
