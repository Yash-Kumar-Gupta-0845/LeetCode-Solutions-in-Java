class Solution {
    public boolean checkPerfectNumber(int num) {
        int count = 1;
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                count += i + num/i;
            }
        }
        if (count == num && count != 1)
            return true;
        else
            return false;
    }
}