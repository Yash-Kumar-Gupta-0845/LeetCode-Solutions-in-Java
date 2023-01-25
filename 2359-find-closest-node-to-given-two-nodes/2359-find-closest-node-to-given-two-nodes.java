class Solution {
    static List<List<Integer>> adj;
    static boolean visit[];
    void dfs(int n,int l,int d[]){
        if(visit[n]) return;
        d[n] = l;
        visit[n] = true;
        for(var c:adj.get(n)){
            dfs(c,l + 1,d);
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        adj = new ArrayList<>();
        visit = new boolean[edges.length]; 
        int d_1[] = new int[edges.length];
        int d_2[] = new int[edges.length];
        Arrays.fill(d_1,-1);
        Arrays.fill(d_2,-1);
        for(int i = 0;i < edges.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i < edges.length;i++){
            if(edges[i] != -1) adj.get(i).add(edges[i]);
        }
        dfs(node1,0,d_1);
        Arrays.fill(visit,false);
        dfs(node2,0,d_2);
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0;i < edges.length;i++){
            if(d_1[i] != -1 && d_2[i] != -1){
                if(min > Math.max(d_1[i],d_2[i])){
                    min = Math.max(d_1[i],d_2[i]);
                    idx = i;
                }
            }
        }
        return idx;
    }
}