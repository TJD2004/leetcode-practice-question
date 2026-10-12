// 2643. Row With Maximum Ones

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int maxRow = 0;
        int maxCount = 0;

        for(int i=0; i<rows; i++) {
            int oneCount = 0;
            for(int j=0; j<cols; j++) {
                if(mat[i][j] == 1) {
                    oneCount++;
                }
            }

            if(maxCount < oneCount) {
                maxCount = oneCount;
                maxRow = i;
            }
        }

        return new int[]{maxRow, maxCount}; 
    }
}