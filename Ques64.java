// 64. Minimum Path Sum

/*
    Backtrack Solution (TLE)
*/

class Solution {
    public static int Solve(int[][] grid, int i, int j, int m, int n) {

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        int right = Solve(grid, i, j + 1, m, n);
        int down = Solve(grid, i + 1, j, m, n);

        return grid[i][j] + Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return Solve(grid, 0, 0, m, n);
    }
}