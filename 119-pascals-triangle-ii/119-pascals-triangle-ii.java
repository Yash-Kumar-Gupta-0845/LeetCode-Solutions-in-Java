class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> Row = new ArrayList<>();
    for ( int i = 0; i<= rowIndex ; i++){
        Row.add(1);
        for ( int j = i-1 ; j>0 ; j--){
            Row.set(j,Row.get(j)+Row.get(j-1));
        }
    }
    return Row;   
    }
}