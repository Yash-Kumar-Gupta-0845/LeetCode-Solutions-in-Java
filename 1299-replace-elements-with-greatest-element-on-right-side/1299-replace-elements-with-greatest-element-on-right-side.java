class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int[] result = new int[n];

        int maxRight = arr[n-1];
        result[n-1] = -1;
        
        for(int i = n-2; i >= 0 ; i--){

            int temp = arr[i];
            result[i] = maxRight;

            if(maxRight < temp)
                maxRight = temp;
        }

        return result;
    }
}