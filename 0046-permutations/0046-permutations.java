class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(list,sublist,nums,visited);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> sublist, int nums[], boolean[] visited){
        if (sublist.size() == nums.length){
            list.add(new ArrayList<>(sublist));
            return;
        }
        for (int i = 0; i < nums.length ; i++){
            if (visited[i] == true)
                continue;
            sublist.add(nums[i]);
            visited[i] = true;
            backtrack(list,sublist,nums,visited);
            sublist.remove(sublist.size()-1);
            visited[i] = false;
        }
    }
}