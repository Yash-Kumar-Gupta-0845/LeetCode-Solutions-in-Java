class Solution {
    public int addDigits(int num) {
        return ((num < 9)? num : (num% 9 == 0)? 9: num%9);
        // if (num < 9)
        //     return num;
        // if (num % 9 == 0)
        //     return 9;
        // return num%9;
    //     int res = unitFinder(num);
    //     while (res > 9){
    //         res = unitFinder(res);
    //     }
    //     return res;
    // }
    // private int unitFinder(int n){
    //     int dSum = 0;
    //     while(n>0){
    //         dSum+=n%10;
    //         n/=10;
    //     }
    //     return dSum;
    }
}