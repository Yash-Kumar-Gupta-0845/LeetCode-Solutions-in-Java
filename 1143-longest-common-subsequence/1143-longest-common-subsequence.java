class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        /*char[] st1 = text1.toCharArray();
        char[] st2 = text2.toCharArray();
        int dp[][] = new int[st1.length+1][st2.length+1A
];
        dp[0][0] = 0;
        for ( int i =1; i< st1.length+1 ; i++){
            for (int j=1; j< st2.length+1 ;j++){
                dp[0][i] = 0;
                dp[0][j] = 0;
                if (st1[i-1] == st2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[st1.length][st2.length];*/
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();
        int temp[][] = new int[str1.length+1][str2.length+1];
        int max=0;
        for(int i=1;i<temp.length;i++)
        {
            for(int j=1; j<temp[i].length;j++)
            {
                if(str1[i-1]==str2[j-1])
                {
                    temp[i][j] = temp[i-1][j-1]+1;
                }
                else
                {
                    temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j]> max)
                    max= temp[i][j];
            }
        }
        return max;
    }
}