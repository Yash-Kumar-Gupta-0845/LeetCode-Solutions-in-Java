class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int [][] dp = new int[k+2][n];
        for(int i = 0; i<=k+1 ; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for(int i = 0; i<=k+1 ; i++){
            dp[i][src] = 0;
        }
        for(int i = 1; i<= k+1 ;i++){
            for(int[] flight : flights){
                if(dp[i-1][flight[0]] != Integer.MAX_VALUE){
                    dp[i][flight[1]] = Math.min(dp[i][flight[1]], dp[i-1][flight[0]]+flight[2]);
                }
            }
        }
        return dp[k+1][dst] == Integer.MAX_VALUE?-1:dp[k+1][dst];
    }
}
    