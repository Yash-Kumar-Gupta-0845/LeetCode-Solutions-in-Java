class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        
        
        // Created TLE :(
        
        
        // for ( int i = 0 ; i< nums.length ; i++){
        //     int temp = target - nums[i];
        //     for(int j = i+1 ; j< nums.length ; j++){
        //         if (temp == nums[j]){
        //             arr[1] = j+1;
        //             arr[0] = i+1;
        //             break;
        //         }
        //     }
        // }
        
        
        // use two pointer approach..
        
        
        int left = 0;
        int right = nums.length -1;
        while(left<right){
            if ((nums[left] + nums[right])< target)
                left++;
            else if ((nums[left]+nums[right]) > target)
                right--;
            else{
                arr[0] = left +1;
                arr[1] = right +1;
                break;
            }
        }
        return arr;
    }
}