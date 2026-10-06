// 48. Rotate Image

class Solution {
    void reverse(int[] arr, int col) {
        int i=0; 
        int j=col-1;

        while(i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    void transpose(int[][] matrix, int row, int col) {
        for(int i=0; i<row; i++) {
            for(int j=i+1; j<col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        transpose(matrix, row, col);  

        for(int i=0; i<row; i++) {
            reverse(matrix[i], col);
        }
    }
}