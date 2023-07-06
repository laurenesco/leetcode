//
// Program Name:        palindromenumber.cpp
// Date Last Modified:  12/15/2022
// Last Modified By:    Lauren Escobedo
// Language:            C++
// Runtime:		34 ms
// Memory Usage: 	6.3 MB
//
// Program Description:
//
// given integer x
// return true if x is palindrome, else return false
//


#include <cmath>

class Solution {
public:
    bool isPalindrome(int x) {

        float length = floor(trunc(log10(x)))+1;

        int forwards = x;
        long int backwards = 0;

        for (int i = 0; i < length; i++) {
            backwards = backwards * 10 + x%10;
            x /= 10;
        }

        if (forwards == backwards) {
            return true;
        } else {
            return false;
        }
    }
};
