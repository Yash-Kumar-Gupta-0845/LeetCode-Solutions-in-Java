//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        int dp[] = new int[n+1];
        dp[n] = 0;
        
        for(int i = n-1; i>=0; i--){
            
            int minCost = Integer.MAX_VALUE;
            for(int j = i; j<n; j++){
                if(isPalindrome(i, j, str)){
                    int cost = 1 + dp[j+1];
                    minCost = Math.min(cost, minCost);
                }
            }
            
            dp[i] = minCost;
        }
        
        return dp[0]-1;
    }
    static boolean isPalindrome(int i, int j, String str){
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}