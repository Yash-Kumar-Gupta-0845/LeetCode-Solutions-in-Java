class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2)
            return true;
        boolean flag = true;
        int x1 = (coordinates[1][1] - coordinates[0][1]);
        int y1 = (coordinates[1][0] - coordinates[0][0]);
        for ( int i = 2;i < coordinates.length; i++){
            if(x1 * (coordinates[i][0] - coordinates[1][0]) != y1 * (coordinates[i][1] -                        coordinates[1][1])){
               flag = false;
                break;
            }
        }
        return flag;
    }
}