class Solution {
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        // Set<Integer> set = new HashSet<>();
        List <Integer> set = new ArrayList<Integer>();
        while( n != 1){
            int temp = n;
            n = 0;
            while(temp>0){
                n+= (int)Math.pow((temp%10),2);
                temp/=10;
            }
            if(set.contains(n)){
                return false;
            }
            else
                set.add(n);
        }
        return true;
    }
}