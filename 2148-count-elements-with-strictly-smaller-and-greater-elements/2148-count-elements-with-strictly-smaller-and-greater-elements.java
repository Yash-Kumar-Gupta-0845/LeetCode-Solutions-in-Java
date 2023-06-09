class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 3)
            return 0;
        int count = 0;
        for (int i = 1; i < len-1; i++){
            if (nums[0] < nums[i] && nums[i] < nums[len-1])
                count++;
        }
        return count;
    }
}