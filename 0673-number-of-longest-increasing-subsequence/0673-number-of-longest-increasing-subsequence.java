class Solution {
    public int findNumberOfLIS(int[] nums) {
        int len = nums.length ; 
        int DPlength[] = new int[len];
        int DPcount[] = new int[len];
        Arrays.fill(DPlength,1);
        Arrays.fill(DPcount,1);
        for(int i = 0; i < len ; i++){
            for(int j = 0; j < i  ; j++){
                 if(nums[j] < nums[i]){
                     if(DPlength[j] + 1 > DPlength[i]){
                         DPlength[i] = DPlength[j] + 1;
                         DPcount[i] = 0;
                     }
                     if(DPlength[j] + 1 == DPlength[i]){
                         DPcount[i] += DPcount[j];
                     }
                 }
            }
        }
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < len ; i++){
            maxLength = Math.max(maxLength , DPlength[i]);
        }
        int result = 0;
        for(int i = 0; i < len ; i++){
            if(DPlength[i] == maxLength){
                result += DPcount[i];
            }
        }
        return result;
    }
}