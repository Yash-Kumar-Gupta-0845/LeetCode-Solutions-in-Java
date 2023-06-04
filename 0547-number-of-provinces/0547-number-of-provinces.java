class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n + 1];
        
        for(int i=1;i<=n;i++) {
            if(!visited[i]) {
                dfs(isConnected, visited, i, n);
                ans++;
            }
        }
        return ans;
    }
    static void dfs(int[][] isConnected, boolean[] visited, int source, int n) {
        visited[source] = true;
        for(int j=0;j<n;j++) {
            if(source - 1 != j) {
                if(isConnected[source - 1][j] == 1 && !visited[j + 1]) {
                    dfs(isConnected, visited, j + 1, n);
                }
            }
        }
    }
}