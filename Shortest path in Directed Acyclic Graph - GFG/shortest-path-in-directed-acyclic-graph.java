//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public int[] shortestPath(int N,int M, int[][] edges) {
        int arr[][] = new int[N][N];
           
        for(int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                arr[i][j] = 1000000007;
            }
        }
        
        for(int edge[]: edges){
            arr[edge[0]][edge[1]] = edge[2];
        }
        
        arr[0][0] = 0;
        
        for(int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                arr[0][j] = Math.min(arr[0][i] + arr[i][j], arr[0][j]);
            }
        }
        
        for(int i=0;i<N;++i){
            for(int j=0;j<N;++j){
                arr[0][j] = Math.min(arr[0][i] + arr[i][j], arr[0][j]);
            }
        }
        
        for(int i=0;i<N;++i){
            if(arr[0][i] == 1000000007) arr[0][i] = -1;
        }
        
        arr[0][0] = 0;
        
        return arr[0];
    }
}