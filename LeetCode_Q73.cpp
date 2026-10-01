#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();

        vector<bool> rowZero(rows, false);
        vector<bool> colZero(cols, false);

        // Mark zero rows and columns
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                if (matrix[i][j] == 0)
                    rowZero[i] = true, colZero[j] = true;

        // Set cells to zero
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < cols; ++j)
                if (rowZero[i] || colZero[j])
                    matrix[i][j] = 0;
    }
};

int main() {
    vector<vector<int>> matrix = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };

    Solution sol;
    sol.setZeroes(matrix);

    cout << "Resulting Matrix:\n";
    for (const auto& row : matrix) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
