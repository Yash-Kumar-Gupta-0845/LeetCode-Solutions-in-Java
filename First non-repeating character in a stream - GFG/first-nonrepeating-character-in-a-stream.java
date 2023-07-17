//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        StringBuilder ans = new StringBuilder();
        int arr[] = new int[26];
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < A.length() ; i++){
            char ch = A.charAt(i);
            if(arr[ch - 'a'] == 0){
                list.add(ch);
            }
            arr[ch - 'a']++;
            int flag = 0;
            int m = list.size();
            for(int j = 0; j < m ; j++){
                char chs = list.get(j);
                if(arr[chs - 'a'] == 1){
                    ans.append(chs);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                ans.append("#");
            }
        }
        return ans.toString();
    }
}