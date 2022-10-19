class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String num ="123456789";
        for ( int i =1; i<= 9 ;i++){
            for ( int j =0 ; j+i <= num.length(); j++){
                String substr = num.substring(j,i+j);
                int value = Integer.parseInt(substr);
                if ( value >= low && value<= high)
                    list.add(value);
            }
        }
        return list;
    }
}