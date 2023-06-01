class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int count = 0;
        if(grid[0][0] == 1 || grid[grid.length -1][grid[0].length -1] == 1)
            return -1;
        // else{
        //     for(int i = 0; i < grid.length-1 ; i++){
        //         for (int j = 0; j < grid[0].length-1 ; j++){
        //             if (grid[i+1][j+1] == 0){
        //                 count++;
        //             }
        //             else if (grid[i][j+1] == 0 || grid[i+1][j] == 0)
        //                 count++;
        //         }
        //     }
        //     return count+1;
        // }
        int row = grid.length;
        int col = grid[0].length;

        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
            return -1;
        }

        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        boolean[][] visited = new boolean[row][col];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for (int i = 0; i < size; i++) {
                int[] curPos = queue.poll();

                if (curPos[0] == row - 1 && curPos[1] == col - 1) {
                    return count;
                }

                for (int[] dir : dirs) {
                    int nextX = curPos[0] + dir[0];
                    int nextY = curPos[1] + dir[1];

                    if (nextX < 0 || nextX >= row || nextY < 0 || nextY >= col || visited[nextX][nextY]                         || grid[nextX][nextY] == 1) {
                        continue;
                    }

                    visited[nextX][nextY] = true;
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
        return -1;
    }
}