//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int x)
    {
        // code here
       boolean visit[] = new boolean[V];
       Queue<Integer> q = new LinkedList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       
       q.add(0);
       visit[0] = true;
       map.put(0,0);
       while(!q.isEmpty()){
           int s = q.poll();
           ArrayList<Integer> val = adj.get(s);
           for(int i=0;i<val.size();i++){
               if(!visit[val.get(i)]){
                   q.add(val.get(i));
                   visit[val.get(i)] = true;
                   map.put(val.get(i),map.get(s)+1);
               }
           }
       }
       if(map.containsKey(x)){
           return map.get(x);
       }else{
           return -1;
       }
    }
}