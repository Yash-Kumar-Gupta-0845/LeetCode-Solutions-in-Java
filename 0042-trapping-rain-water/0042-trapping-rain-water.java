class Solution {
    public int trap(int[] height) {
        int size = height.length ;
        if (height == null || size == 0)
            return 0;
        int leftMax[] = new int[size];
        leftMax[0] = height[0];
        int rightMax[] = new int[size];
        rightMax[size-1] = height[size-1];
        for(int i= 1 ; i < size ; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for(int i = size-2 ; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trapWater = 0;
        for (int i =0; i < size ; i++){
            trapWater+=Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return trapWater;
    }
}