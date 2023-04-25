class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n-1){
            return -1;
        }
        int [] trustedBy = new int[n+1];
        int [] trusts = new int[n+1];
        for(int[] rel : trust){
            trusts[rel[0]]++;
            trustedBy[rel[1]]++;
        }
        for (int i = 1; i < n+1; i++){
            if(trusts[i] == 0 && trustedBy [i] == n-1)
                return i;
        }
        return -1;
    }
}