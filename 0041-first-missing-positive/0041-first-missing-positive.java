class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return len+1;
        for (int i = 0; i < len ;){
            if (nums[i]> len || nums[i] <= 0)
                i++;
            else if(nums[nums[i] - 1] == nums[i])
                i++;
            else{
                int temp = nums[nums[i]- 1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        int i = 0;
        for (i = 0; i < len ; i++){
            if (nums[i] != i+1)
                return i+1;
        }
        return nums[i-1]+1;
    }
}