class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int ans = 0;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int  j =i; j<arr.length; j++){
                sum += arr[j];
                count +=1;
                if(count % 2 != 0){
                    ans +=sum;
                }
            }
            sum = 0;
            count = 0;
        }
        return ans;
    }
}