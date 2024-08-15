//
// Program Name:        majority_element.java
// Date Last Modified:  07/13/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             15 ms [Beat 26.05%]
// Memory Usage:        47.24 MB [Beat 68.99%]
//
// Program Description:
//
//      return element returning majority of times
//


import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {	
        HashMap <Integer, Integer> countMap = new HashMap <Integer, Integer>();
        
        for (int number : nums) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number)+1);
            } else {
                countMap.put(number, 1);
            }
        }
        
        Integer max = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
		
		return max; 
	}
}

//
// Program Name:        majority_element.java
// Date Last Modified:  07/13/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             4 ms [Beat 45.36%]
// Memory Usage:        48.6 MB [Beat 41.56%]
//
// Program Description:
//
// 	return element returning majority of times
//


class Solution {
    public int majorityElement(int[] nums) {

		if (nums.length == 1) { return nums[0]; }

		Arrays.sort(nums);

		int majority = nums[0], temp = nums[1];
		int majcount = 1, tempcount = 0;

		if (temp == majority) { majcount ++; } else { tempcount ++; }

		for (int i = 2; i < nums.length; i ++) {
		    boolean swap = false;

		    if (nums[i] == majority) {
		        majcount ++;
		    } else if (nums[i] == temp) {
		        tempcount ++;
		    } else {
		        temp = nums[i];
		        tempcount ++;
		    }

				swap = tempcount > majcount ? true : false;

				if (swap) {
						majority = temp;
						majcount = tempcount;
						if (i < nums.length - 1) {
							temp = nums[i+1];
							tempcount = 1;
						}
				}
		}

		return majority;
    }
}
