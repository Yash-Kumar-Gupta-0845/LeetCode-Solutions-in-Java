class Solution {
    public int findMiddleIndex(int[] nums) {
        int TotalSum =0 ;
        int LeftSum =0;
        for(int i = 0; i< nums.length ; i++)
            TotalSum+=nums[i];
        for(int i =0 ;i< nums.length;i++){
            int RightSum = TotalSum - nums[i] - LeftSum;
            if (RightSum == LeftSum)
                return i;
            LeftSum+=nums[i];
        }
        return -1;
    }
}