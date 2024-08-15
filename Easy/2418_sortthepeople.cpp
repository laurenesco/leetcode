#include <string>

class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        // Sort the arrays simulaneously
        for (int i = 0; i < heights.size(); i++) {
            for (int j = 0; j < heights.size() - i - 1; j++) {
                if (heights[j] < heights[j+1]) {
                    int temp = heights[j];
                    string temp2 = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = temp;
                    names[j+1] = temp2;
                }
            }
        }
        return names;
    }
};
