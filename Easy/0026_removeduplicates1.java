//
// Program Name:        removeduplicates1.java
// Date Last Modified:  07/09/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             1 ms
// Memory Usage:        43.9 MB
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
        // Unique marks the index of the current unique element
        int unique = 0;

        // Iterate through elements after "unique", searching for next unique element
        for (int iterator = 1; iterator < nums.length; iterator++) {
            if (nums[unique] != nums[iterator]) {
                // When a new unique element is found, increment "unique" to the next index,
                // and set the new current unique index to the next unique number
                unique ++;
                nums[unique] = nums[iterator];
            }
        }

        return unique += 1;
    }
}
