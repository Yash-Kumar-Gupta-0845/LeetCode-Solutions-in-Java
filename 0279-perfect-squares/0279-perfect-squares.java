class Solution {
    public int numSquares(int n) {
        while(n % 4 == 0){
            n = n / 4;
        }
        if(n % 8 == 7){
            return 4;
        }
        for(int x = 0; x * x <= n; x++){
            int y = (int)Math.sqrt(n - x*x);
            if(x * x + y * y == n){
                if(x == 0 || y == 0){
                    return 1;
                }
                else{
                    return 2;
                }
            }
        }
        return 3;
    }
}