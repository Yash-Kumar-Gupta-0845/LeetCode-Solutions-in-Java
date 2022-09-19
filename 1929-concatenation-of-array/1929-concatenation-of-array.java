class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int arr[] = new int[2*len];
        for ( int i = 0; i<nums.length ; i++){
            arr[i] = nums[i];
        }
        for (int i = len;i<2*nums.length ; i++){
            arr[i] = nums[i-len];
        }
        return arr;
    }
}