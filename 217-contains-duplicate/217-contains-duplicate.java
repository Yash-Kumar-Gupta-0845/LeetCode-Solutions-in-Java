class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1){
            if(nums[i+1]== nums[i])
                return true; 
            i++;
        }
        return false;
    }
}