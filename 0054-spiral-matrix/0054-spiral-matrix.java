class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list = new ArrayList<>();
        if (matrix.length == 0)
            return list;
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int currentRow= 0, currentCol = 0;
        while(currentRow < maxRow && currentCol < maxCol){
            for(int i = currentCol ; i < maxCol ; i++){
                list.add(matrix[currentRow][i]);
            }
            currentRow++;
            for(int i = currentRow ; i < maxRow ; i++){
                list.add(matrix[i][maxCol-1]);
            }
            maxCol--;
            if (currentRow < maxRow){
                for(int i = maxCol-1 ; i >=currentCol ; --i){
                    list.add(matrix[maxRow-1][i]);
                }
                maxRow--;
            }
            if(currentCol<maxCol){
                for(int i = maxRow-1 ; i>=currentRow ; --i){
                    list.add(matrix[i][currentCol]);
                }
                currentCol++;
            }
        }
        return list;
        // int i = 0;
        // int j = 0;
        // while(i == 0 && j< matrix[0].length){
        //     list.add(matrix[i][j]);
        //     j++;
        // }
        // int k = 0;
        // while (j == matrix[0].length -1 && k< matrix.length){
        //     if (!list.contains(matrix[j][k]))
        //         list.add(matrix[j][k]);
        // }
    }
}