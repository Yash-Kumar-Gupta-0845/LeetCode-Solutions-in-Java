class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            ls.add((int) next_val);
            prev = next_val;
        }
        return ls;
    }
}