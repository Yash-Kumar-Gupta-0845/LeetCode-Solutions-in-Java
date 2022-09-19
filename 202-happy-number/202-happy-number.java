class Solution {
    public boolean isHappy(int n) {
        if (n ==1)
            return true;
        else{
            List<Integer> list=new ArrayList<Integer>();  
            while (n!=1){
                int temp = n;
                n = 0;
                while(temp >0){
                    n= n+(int)Math.pow((temp%10),2);
                    temp/=10;
                }
                    if(list.contains(n))
                        return false;
                    else
                        list.add(n);
                
            }
            return true;
        }
    }
}