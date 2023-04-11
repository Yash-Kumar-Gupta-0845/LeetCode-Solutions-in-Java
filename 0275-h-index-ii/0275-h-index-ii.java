// Binary Search

class Solution {
    public int hIndex(int[] citations) {
        int result = 0;
        int n = citations.length;
        int start = 0, end = n;
        while(start < end){
            int mid = start+(end-start)/2;
            if (n - mid <= citations[mid]){
                result = Math.max(n-mid, result);
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
}