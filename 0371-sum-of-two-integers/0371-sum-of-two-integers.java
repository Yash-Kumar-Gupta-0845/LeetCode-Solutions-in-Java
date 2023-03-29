class Solution {
    public int getSum(int a, int b) {
        int carry = (a & b) << 1;
        int res = a^b;
        if(carry == 0)
            return res;
        else
            return getSum(carry, res);
    }
}