class Solution {
       public  int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] ret =new int[n];
        ArrayList[] re = new ArrayList[n];
        ArrayList[] be = new ArrayList[n];
        for(int i =0;i<n;i++)
        {
            re[i]=new ArrayList();
            be[i]=new ArrayList();
        }
        for(int[] edge:redEdges)
        {
            re[edge[0]].add(edge[1]);
        }
        for(int[] edge:blueEdges)
        {
            be[edge[0]].add(edge[1]);
        }

        for(int i=0;i<n;i++)
        {
            int n1 =bfs(n,i,re,be);
            int n2 =bfs(n,i,be,re);
            if(n1!=-1 && n2!=-1)
                ret[i]=Math.min(n1,n2);
            else
            {
                if(n1==-1) ret[i]=n2;
                else
                    if(n2==-1) ret[i]=n1;
            }
        }
        return ret;
    }

    public  int bfs(int n,int target,ArrayList[] first, ArrayList[] second)
    {
        boolean[] v  = new boolean[n];
        boolean[] v2  = new boolean[n];
        Queue<int[]> q = new LinkedList();
        q.add(new int[]{0,1,0});
        v[0]=true;
        v2[0]=true;
        while(!q.isEmpty())
        {
            int[] curr =q.poll();
            int val=curr[0];
            int col = curr[1];
            int newCol = col==1? 2:1;
            boolean[] visited = col==1? v:v2 ;
            int height = curr[2];
            if(val==target)
                return height;
            ArrayList[] arr = col==1 ?first:second;
            ArrayList<Integer> edges = arr[val];

            for(int node:edges)
            {
                if(!visited[node])
                {
                    visited[node]=true;
                    q.add(new int[]{node,newCol,height+1});
                }
            }
        }

        return -1;
    }
}