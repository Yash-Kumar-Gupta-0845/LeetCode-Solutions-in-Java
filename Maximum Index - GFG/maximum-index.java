//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int[] lmin = new int[n];
        int[] rmax = new int[n];
        int maxd = 0;
        lmin[0] = arr[0];
        for( int i =1; i < n ; i++){
            lmin[i] = Math.min(arr[i], lmin[i-1]);
        }
        rmax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0 ; i--){
            rmax[i] = Math.max(arr[i],rmax[i+1]);
        }
        int minindex = 0, maxindex = 0;
        while(minindex < n && maxindex < n){
            if(lmin[minindex] <= rmax[maxindex]){
                maxd = Math.max(maxd, maxindex-minindex);
                maxindex++;
            }
            else
            minindex++;
        }
        return maxd;
    }
}