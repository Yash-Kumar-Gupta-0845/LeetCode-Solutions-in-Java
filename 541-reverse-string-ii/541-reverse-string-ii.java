class Solution {
    public String reverseStr(String s, int k) {
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k)
        {
            int st=i;
            int right=Math.min(i+k-1,s.length()-1);
        while(st<right)
        {
            char temp=a[right];
            a[right--]=a[st];
            a[st++]=temp;
           
        }
        }
        
        return String.valueOf(a);
        
    }
}