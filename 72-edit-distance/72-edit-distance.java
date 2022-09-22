/*class Solution {
    public int minDistance(String word1, String word2) {
        char str1[] = word1.toCharArray();
        char str2[] = word2.toCharArray();
        // how to convert blank to a word; deleting the char to make 
        int temp[][] = new int [str1.length+1][str2.length+1];
        temp[0][0] = 0;
        for ( int i=1; i<str1.length ;i++){
            temp[i][0] = i;
            for ( int j =1; j< str2.length ; j++){
                temp[0][j] = j;
                if (str1[i-1] == str2[j]){
                    temp[i][j] = temp[i-1][j-1];
                }
                else{
                    int min  = Math.min(temp[i-1][j],temp[i][j-1]);
                    temp[i][j] = Math.min(temp[i-1][j-1],min)+1;
                }
                
            }
        }
        return temp[str1.length][str2.length];
    }
}*/
class Solution {
    public int minDistance(String word1, String word2) {
        char[] str1 = word1.toCharArray();
         char[] str2 = word2.toCharArray();
        int temp[][] = new int[str1.length+1][str2.length+1];
        for(int i=0;i<temp[0].length;i++)
        {
            temp[0][i]=i;
        }
         for(int i=0;i<temp.length;i++)
         {
             temp[i][0]=i;
         }
        for(int i=1;i<str1.length+1;i++)
        {
            for(int j=1; j<str2.length+1;j++)
            {
                if(str1[i-1]==str2[j-1])
                {
                    temp[i][j]=temp[i-1][j-1];
                }
                else
                {
                    temp[i][j]=min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1])+1;
                }
            }
        }
        return temp[str1.length][str2.length];
    }
    private int min(int a, int b,int c)
    {
        int l = Math.min(a,b);
        return Math.min(l,c);
    }
}


