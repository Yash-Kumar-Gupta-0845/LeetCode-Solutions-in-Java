class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        int max = -1;
        for (int i = 0; i < nums1.length ; i++){
            int temp = nums1[i];
            int index = 0;
            for (int j = 0; j < nums2.length ; j++){
                if (nums2[j] == temp){
                    index = j;
                    break;
                }
            }
            for (int j = index; j < nums2.length ; j++){
                if (nums2[j] > temp){
                    max = nums2[j];
                    break;
                }
                else
                    max = -1;
            }
            result[i] = max;
        }
        return result;
    }
}