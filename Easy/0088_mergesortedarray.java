//
// Program Name:        mergesortedarray.java
// Date Last Modified:  07/06/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             1 ms
// Memory Usage:        41.2 MB
//
// Program Description:
//
// nums1 and nums2 sorted in ascending order
// merge the two arrays in ascending order
// store the result in nums1
// Note: nums1 is the size of m + n
//

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m1, int[] nums2, int n2) {
        int insertIndex = nums1.length - n2; // Find the number of real values in nums1
        int iterator = 0;

        for(int i = insertIndex; i < nums1.length; i++) { // Loop over 0's in nums1
            nums1[i] = nums2[iterator]; // Replace the 0's in nums1 with values from nums2
            iterator ++; // Increment the nums2 iterator
        }

        Arrays.sort(nums1); // Sort the array
    }
}
