class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0)
            return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for( int i=1 ; i< numRows ;i++){
            List<Integer> CurrentRow = new ArrayList<>();
            List<Integer> PreRow = triangle.get(i-1);
            CurrentRow.add(1);
            for ( int j = 1; j< i ;j++){
                CurrentRow.add(PreRow.get(j-1)+PreRow.get(j));
            }
            CurrentRow.add(1);
            triangle.add(CurrentRow);
        }
        return triangle;
    }
}