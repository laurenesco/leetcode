//
// Program Name:	twosum.cpp
// Date Last Modified:	12/06/2022
// Last Modified By:	Lauren Escobedo
// Language:		C++
// Runtime:		746 ms
// Memory Usage:	10.3 MB
//
// Program Description:
//
// given array nums and integer target
// return indices of the two numbers that add up to target
//
// Note: assume only one solution per test case
// Note: may not use same index twice
//

class Solution {

public:
    vector<int> twoSum(vector<int>& nums, int target) {

       for(int i = 0; i<nums.size(); i++) {
            for (int j = i+1; j<nums.size(); j++) {
                if (nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }

        return {0};
    }
};
