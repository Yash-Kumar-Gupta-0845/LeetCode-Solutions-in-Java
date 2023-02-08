class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return 0;
        int top_Down[] = new int [len];
        Arrays.fill(top_Down,Integer.MAX_VALUE);
        top_Down[len - 1] = 0;
        for (int i = len -2; i>= 0 ;i--){
            int min = Integer.MAX_VALUE;
            for ( int j = i+1;j<= Math.min(len-1,i+nums[i]);j++){
                min = Math.min(min,top_Down[j]);
            }
            if (min != Integer.MAX_VALUE)
                top_Down[i] = min+1;
        }
        return top_Down[0];
    }
}