class Solution {
    public int countDigits(int num) {
        if(num<10)
            return 1;
        int count = 0;
        int temp = num;
        while(num> 0){
            int val = num %10;
            if (temp % val == 0)
                count++;
            num/=10;
        }
        return count;
    }
}