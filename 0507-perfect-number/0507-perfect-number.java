class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1, left = 2, right = num/2 +1;
        while(left <= right){
            if (num % left == 0)
                sum+=left;
            if(num % right == 0)
                sum+=right;
            if (left == right)
                sum= sum-right;
            left++;
            right--;
        }
        if (num == sum && num != 1)
            return true;
        else
            return false;
    }
}