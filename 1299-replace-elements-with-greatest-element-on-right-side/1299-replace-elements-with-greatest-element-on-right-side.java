class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        // int arr1[] = new int[len];
        // for(int i = 0; i < len ; i++){
        //     arr1[i] = arr[i];
        // }
        // Arrays.sort(arr1);
        if (len == 1)
            arr[0] = -1;
        else{
            for (int i = 0; i < len-1 ; i++){
                int max = 0;
                for(int j = i+1 ; j < len ; j++){
                    max = Math.max(max,arr[j]);
                }
                arr[i] = max;         
            }
            arr[len-1] = -1;
        }
        return arr;
    }
}