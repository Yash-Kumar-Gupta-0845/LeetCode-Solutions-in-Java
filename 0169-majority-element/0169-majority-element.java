class Solution {
    public int majorityElement(int[] nums) {
    int count = 0, majority = 0;
    for (int index = 0; index < nums.length; index++) {
        count += nums[index] == nums[majority] ? 1: -1;
        if(count==0){
            majority=++index;
            count++;
            }
        }
    return nums[majority];
        // int arr[] = new int[nums.length];
        // for(int i = 0; i < nums.length ; i++){
        //     int count = 1;
        //     int temp = nums[i];
        //     arr[i] = check(nums, temp);
        // }
        // Arrays.sort(arr);
        // return arr[arr.length-1];
    }
    // public int check(int arr[], int num){
    //     int count = 0;
    //     for (int i = 0; i < arr.length ; i++){
    //         if (arr[i] == num)
    //             count++;
    //     }
    //     return count;
    // }
}