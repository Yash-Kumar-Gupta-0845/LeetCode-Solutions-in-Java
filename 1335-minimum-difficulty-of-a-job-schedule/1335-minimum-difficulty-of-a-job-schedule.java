class Solution {
    public int minDifficulty(int[] jobDif, int d) {
        int len = jobDif.length;
        int arr[] = new int[d];
        if (d> len)
            return -1;
        // int maxi = Integer.MIN_VALUE;
        // int mini = Integer,MAX_VALUE;
        // for ( int i =0 ; i< len ; i++){
        //     arr[0] = Math.max(jobDifficulty[i], maxi);
        //     arr
        //     }
        // for ( int i =1; i< d ; i++){
        //     arr[i]=
        // }
        int minDif[][] = new int[d][len];
        for (int i = 1; i<d; i++){
            Arrays.fill(minDif[i], Integer.MAX_VALUE);
        }
        int maxDif = 0;
        for ( int i =0; i<= len -d; i++){
            maxDif = Math.max(maxDif, jobDif[i]);
            minDif[0][i] = maxDif;
        }
        for ( int day =1 ; day< d; day++){
            for ( int to = day; to <= len -d + day; to++){
                int currDayDiff = jobDif[to];
                int result = Integer.MAX_VALUE;
                for ( int j = to-1 ; j>=day-1 ;j--){
                    result = Math.min(result, minDif[day-1][j] + currDayDiff);
                    currDayDiff = Math.max(currDayDiff, jobDif[j]);
                }
                minDif[day][to] = result;
            }
        }
        return minDif[d-1][len-1];
    }
}