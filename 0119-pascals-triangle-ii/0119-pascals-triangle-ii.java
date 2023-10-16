class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i <= rowIndex ; i++){
            ls.add(0,1);
            for (int j = 1; j < ls.size() - 1; j++){
                ls.set(j, ls.get(j) + ls.get(j + 1));
            }
        }
        return ls;
    }
}