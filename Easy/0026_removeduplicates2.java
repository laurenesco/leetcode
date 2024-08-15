//
// Program Name:        removeduplicates1.java
// Date Last Modified:  07/09/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             XX ms
// Memory Usage:        XX MB
//
// Program Description:
//
// given sorted array in ascending order
// remove duplicates
// relative order should be kept the same
// return number of unique elements
//

class Solution {
    public int removeDuplicates(int[] nums) {
        // Current will mark the index being compared
        int current = 0;
        // Repeats will count the number of repeats of the current value
        int repeats = 0;
        int repeat_value = 0;

        // Iterate through elements after "current", searching for next unique element
        for (int iterator = 1; iterator < nums.length; iterator++) {
            // When a new unique number is found...
            if (nums[current] != nums[iterator]) {
                if (repeats > 0) {
                    // If there was repeats, increment current by 2, since one repeat allowed
                    current += 2;
                } else { 
                    // If not repeats, only increment by one
                    current += 1;
                }
                // Set the value of new "current" to the next number
                nums[current] = nums[iterator];
                // Reset repeats
                repeats = 0;
            } else {
                // If unique number not found, increment repeat counter
                repeats += 1;
                repeat_value = nums[current];
            }
        }

        // If ending with a repeat on deck... 
        if (repeats > 0) {
            // Manually set second value
            nums[current + 1] = repeat_value;
        }

        return current += 2;
    }
}
