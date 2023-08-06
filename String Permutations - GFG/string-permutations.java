//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    ArrayList<String> list=new ArrayList<>();
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        permu(S,"");
        Collections.sort(list);
        return list;
    }
    public void permu(String str,String permutation){
        if(str.length()==0)
        list.add(permutation);
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permu(newStr,permutation+currchar);
        }
        
    } 
}
