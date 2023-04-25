class Solution {
    public boolean isMatch(String s1, String p1){ 
    char[] s = s1.toCharArray();
    char[] p  = p1.toCharArray();
    boolean T[][] = new boolean[s1.length()+1][p1.length()+1];
    T[0][0] = true;
    for(int i=1;i<T[0].length;i++)
    {
        if(p[i-1] == '*'){
            T[0][i] = T[0][i-2];
        }
    }
    for(int i=1;i<T.length;i++)
    {
        for(int j=1;j<T[0].length;j++)
        {
            if(p[j-1] == '.' || p[j-1] == s[i-1]){
                T[i][j] = T[i-1][j-1];
            }
            else if(p[j-1] == '*'){
                T[i][j] = T[i][j-2];
                if(p[j-2] == '.'|| p[j-2]==s[i-1]){
                    T[i][j] = T[i][j] || T[i-1][j];
                }
            }
            else{
                T[i][j] = false;
            }
        }
    }
       return T[s.length][p.length];
    
}
}