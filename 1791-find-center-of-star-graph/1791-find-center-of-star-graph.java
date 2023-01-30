import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> out = new HashSet<>();
        for (int [] edge: edges){
            if (out.contains(edge[0]))
                return edge[0];
            out.add(edge[0]);
            if (out.contains(edge[1]))
                return edge[1];
            out.add(edge[1]);
        }
        return -1;
    }
}