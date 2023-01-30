class Solution {
    public int findCenter(int[][] edges) {
        int edge = edges.length + 1;
        int arr[] = new int[edge+1];
        for (int[] n : edges){
            int x = n[0];
            int y = n[1];
            arr[x]++;
            arr[y]++;
            if (arr[x] > 1){
                return x;
            }
            if (arr[y]>1){
                return y;
            }
        }
        return 0;
    }
}