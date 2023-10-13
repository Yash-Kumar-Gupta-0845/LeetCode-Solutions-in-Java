class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int dp[] = new int[len+1];
        Arrays.fill(dp,-1);
        if (len <= 1)
            return 0;
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len ; i++){
            dp[i] = Math.min(cost[i-1]+dp[i-1],cost[i-2]+dp[i-2]);
        }
        return dp[len];
    }
}
