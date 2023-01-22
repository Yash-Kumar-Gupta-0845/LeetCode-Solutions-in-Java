class Solution {
    public int addDigits(int num) {
        int res = unitFinder(num);
        while (res > 9){
            res = unitFinder(res);
        }
        return res;
    }
    private int unitFinder(int n){
        int dSum = 0;
        while(n>0){
            dSum+=n%10;
            n/=10;
        }
        return dSum;
    }
}