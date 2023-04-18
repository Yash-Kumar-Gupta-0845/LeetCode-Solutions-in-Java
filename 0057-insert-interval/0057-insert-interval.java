class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length+1][2];
        if(intervals.length<1){
            arr[0][0] = newInterval[0];
            arr[0][1]= newInterval[1];
            return arr;
        }
        
        for(int i = 0;i<intervals.length;i++){
            for(int  j = 0;j<intervals[i].length;j++){
                arr[i][j] = intervals[i][j];
            }
        }
        arr[arr.length-1][0]= newInterval[0];
        arr[arr.length-1][1]=newInterval[1];
        java.util.Arrays.sort(arr, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});

        List<int[]> list = new ArrayList<>();
        int[] curr = arr[0];
        list.add(curr);
        for(int[] next : arr){
            if(curr[1] >= next[0]) curr[1] = Math.max(curr[1],next[1]);
            else{
                curr = next;
                list.add(curr);
            }
        }
        
       return list.toArray(new int[list.size()][]);
    }
}