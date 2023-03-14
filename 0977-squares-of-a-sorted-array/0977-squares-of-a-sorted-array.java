class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0;
        int p2 = nums.length -1;
        int out[] = new int[ nums.length];
        int curr = nums.length -1;
        while (p1 <= p2){
            if ((Math.abs(nums[p1])) > (Math.abs(nums[p2]))){
                out[curr] = nums[p1] * nums[p1];
                curr--;
                p1++;
            }
            else{
                out[curr] = nums[p2] * nums[p2];
                curr--;
                p2--;
            }
        }
        return out;
    }
}