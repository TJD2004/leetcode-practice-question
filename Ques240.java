// 240. Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0]. length;

        for(int i=0; i<rows; i++) {
            int s = 0;
            int e = cols - 1;

            while(s <= e) {
                int mid = s + (e-s)/2;

                if(matrix[i][mid] == target) {
                    return true;
                } else if(matrix[i][mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return false;
    }
}