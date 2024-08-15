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

// Solution 1
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

// Solution 2 
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] solution = new int[length];

        for (int i = 0; i < length-1; i ++) {
            int shift = k % length;
            int distance = length - i - 1;

            if (shift <= distance) {
                solution[i + shift] = nums[i];
            } else {
                int z = shift - distance - 1;
                solution[z] = nums[i];
            }
        }
    }
}

// Solution 3
class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        ArrayList<Integer> places = new ArrayList<Integer>();

        for (int i = length - 1; i >= 0; i--) {
            int shift = k > length ? k % length : k;
            int distance = length - i - 1;

            if (shift <= distance) {
                nums[i + shift] = nums[i];
            } else {
                places.add(nums[i]);
            }
        }

        length = 0;
        for (int i = places.size() - 1; i >= 0; i --) {
            nums[length] = places.get(i);
            length ++;
        }
    }
}
