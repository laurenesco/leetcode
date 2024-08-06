#include <vector>

using namespace std;

class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        vector<int> luckies;

        // For each row, find the minimum value
        for (int r = 0; r < matrix.size(); r ++) {
            int min = matrix[r][0];
            int col = 0;

            for (int c = 0; c < matrix[0].size(); c ++) {
                if (matrix[r][c] <= min) {
                    min = matrix[r][c];
                    col = c;
                }
            }

            // For each minimum value, check if max for that column
            int max = 0;
            for (int r = 0; r < matrix.size(); r ++) {
                max = matrix[r][col] >= max ? matrix[r][col] : max;
            }

            if (max == min) { luckies.push_back(max); }
        }

        // Return the lucky number
        return luckies;
    }
};
