class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int result[] = new int[len];
        // if (A[0] == B[0])
        //     result[0] = 1;
        // else
        //     result[0] = 0; 
        for (int i = 0 ; i < len ; i++){
            boolean flag = false;
            for (int j = 0; j < len ; j++){
                if (A[i] == B[j])
                    flag = true;
                if(flag && j >= i)
                    result[j]++;
            }
        }
        return result;
    }
}