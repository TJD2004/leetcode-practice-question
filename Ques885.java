// 885. Spiral Matrix III

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        boolean[][] isVisited = new boolean[rows][cols];

        int LR = 1;
        int TB = 1;
        int RL = 2;
        int BT = 2;

        int num = 0;

        int[][] res = new int[rows * cols][2];
        int idx = 0;

        // Store starting position
        res[idx++] = new int[]{rStart, cStart};
        isVisited[rStart][cStart] = true;
        num++;

        while (num < rows * cols) {

            // Left to Right
            for (int i = cStart + 1; i <= cStart + LR; i++) {
                if (rStart >= 0 && rStart < rows &&
                    i >= 0 && i < cols &&
                    !isVisited[rStart][i]) {

                    res[idx++] = new int[]{rStart, i};
                    isVisited[rStart][i] = true;
                    num++;
                }
            }
            cStart += LR;
            LR += 2;

            // Top to Bottom
            for (int i = rStart + 1; i <= rStart + TB; i++) {
                if (i >= 0 && i < rows &&
                    cStart >= 0 && cStart < cols &&
                    !isVisited[i][cStart]) {

                    res[idx++] = new int[]{i, cStart};
                    isVisited[i][cStart] = true;
                    num++;
                }
            }
            rStart += TB;
            TB += 2;

            // Right to Left
            for (int i = cStart - 1; i >= cStart - RL; i--) {
                if (rStart >= 0 && rStart < rows &&
                    i >= 0 && i < cols &&
                    !isVisited[rStart][i]) {

                    res[idx++] = new int[]{rStart, i};
                    isVisited[rStart][i] = true;
                    num++;
                }
            }
            cStart -= RL;
            RL += 2;

            // Bottom to Top
            for (int i = rStart - 1; i >= rStart - BT; i--) {
                if (i >= 0 && i < rows &&
                    cStart >= 0 && cStart < cols &&
                    !isVisited[i][cStart]) {

                    res[idx++] = new int[]{i, cStart};
                    isVisited[i][cStart] = true;
                    num++;
                }
            }
            rStart -= BT;
            BT += 2;
        }

        return res;
    }
}