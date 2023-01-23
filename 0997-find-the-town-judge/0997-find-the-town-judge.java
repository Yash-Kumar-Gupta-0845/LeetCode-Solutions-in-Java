class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int[] trustCount = new int[n];
        for(int i=0; i < trust.length; i++) {
            ++trustCount[trust[i][1] - 1];
            --trustCount[trust[i][0] - 1];
        }
        for(int i=0; i < n; i++) {
            if(trustCount[i] == n - 1) return i + 1;
        }
        return -1;
    }
}