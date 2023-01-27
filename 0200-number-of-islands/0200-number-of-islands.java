class Solution {
    public int numIslands(char[][] g) {
        if (g == null || g.length == 0 || g[0].length == 0)
            return 0;
        int c=0;
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]=='1')
                {
                    dfs(g,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    static void dfs(char[][] g , int i, int j)
    {
        if(i<0||j<0||i>=g.length||j>=g[i].length||g[i][j]!='1')
            return;
        g[i][j]='0';
        dfs(g,i+1,j);
        dfs(g,i-1,j);
        dfs(g,i,j+1);
        dfs(g,i,j-1);
    }
}