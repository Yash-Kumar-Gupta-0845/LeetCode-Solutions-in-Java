class Solution {
    public int arrangeCoins(int n) {
        // if (n == 1 || n == 2)
        //     return 1;
        // int maxCoin = ( n%2 == 0 ? n/2 : n/2+1);
        //     return maxCoin -1;
        long left = 0, right = n;
        while(left <= right){
            long mid = left + (right - left)/2;
            long k = mid*(mid+1)/2;
            if(k == n)
                return (int)mid;
            else if (k>n){
                right = mid-1;
            }
            else
                left = mid+1;
        }
        return (int)right;
    }
}