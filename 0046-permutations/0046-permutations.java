class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(new ArrayList<>(), list, nums);
        return list;
    }
    public void helper(List<Integer> curr, List<List<Integer>> list, int[] num){
        if (curr.size() == num.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int nums:num){
            if (!curr.contains(nums)){
                curr.add(nums);
                helper(curr,list,num);
                curr.remove(curr.size() - 1);
            }
        }
    }
}