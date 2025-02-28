class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        int[][] dp = new int[m+1][n+1];
        //first let us construct lcs table 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];//if match found
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);//else update max lcs
                }
            }
        }
        //logic for scs goes in this way
        //if the elements of lcs present in the scs move diagonally
        //move up or left if the characters dont match , and append them to the result
        StringBuilder scs = new StringBuilder();
        int i=m,j=n;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                scs.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                scs.append(str1.charAt(i-1));
                i--;
            }
            else{
                scs.append(str2.charAt(j-1));
                j--;
            }
        }
        while(i>0) scs.append(str1.charAt(--i));
        while(j>0) scs.append(str2.charAt(--j));
        return scs.reverse().toString();
    }
}
