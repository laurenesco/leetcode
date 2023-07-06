//
// Program Name:        removeelement.java
// Date Last Modified:  07/06/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             1 ms
// Memory Usage:        40.9 MB
//
// Program Description:
//
// remove all occurences of val in nums, in-place
// move all values in nums not equal to val to the front of the array
// return the number of elements not equal to val
// Note: val will always be positive

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        // Set all instances of val in nums equal to 0
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == val) {
                nums[i] = -1;
            } else {
                count ++;
            }
        }

        // Sort in descending order
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    nums[j] = nums[j] + nums[i];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }
        }

        return count;
    }
}

