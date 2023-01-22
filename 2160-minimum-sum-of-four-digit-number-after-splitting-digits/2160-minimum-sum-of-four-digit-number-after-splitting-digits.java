class Solution {
    public int minimumSum(int num) {
        int arr[] = new int[4];
        for(int i =0; i < 4 ; i++){
            arr[i] = num%10;
            num/=10;
        }
        Arrays.sort(arr);
        return (arr[3]+10*arr[0]+arr[2]+10*arr[1]);
    }
    // private int helper(int nums){
    //     int arr[] = new int[4];
    //     while(nums !=0){
    //         int i =0;
    //         arr[i] = nums%10;
    //         i+=1;
    //         nums/=10;
    //     }
    // }
}