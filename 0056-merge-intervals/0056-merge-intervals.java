import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[][] merge(int[][] intervals) {
    java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
    });

        List<int[]> list = new ArrayList<>();
        int[] curr = intervals[0];
        list.add(curr);
        for(int[] next : intervals){
            if(curr[1] >= next[0]) curr[1] = Math.max(curr[1],next[1]);
            else{
                curr = next;
                list.add(curr);
            }
        }
        
       return list.toArray(new int[list.size()][]); 
    }
}