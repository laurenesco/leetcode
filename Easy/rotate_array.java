//
// Program Name:        rotate_array.java
// Date Last Modified:  07/14/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             XX ms
// Memory Usage:        XX MB
//
// Program Description: Rotate an array k times. Rotate by shifting all values left, 
// 			then replacing the first value with the previous last value.
//


class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            nums = rotateValues(nums);
        }
    }

    public int[] rotateValues(int[] nums) {
        int n = nums.length;
        int temp = nums[n-1];

        for (int i = n-1; i > 0; i--) {
            nums[i] = nums[i-1];
        }

        nums[0] = temp;

        return nums;
    }
}
