// 240. Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0]. length;

        int s = 0;
        int e = cols -1;

        while(s < rows && e >= 0) {
            if(matrix[s][e] == target) {
                return true;
            } else if(matrix[s][e] > target) {
                e--;
            } else {
                s++;
            }
        }
        return false;
    }
}