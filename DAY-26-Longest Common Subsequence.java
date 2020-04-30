class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
      if(text1.length()>=text2.length()){
          return helper(text1,text2);
      }
        else{
            return helper(text2,text1);
        }
    }
    public int helper(String text1, String text2) {
         int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<dp[0].length; i++){
            dp[0][i]=0;
        }
         for(int i=0; i<dp[0].length; i++){
            dp[i][0]=0;
        }
        
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[i].length; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}
