#include <string>

using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        // possible edge cases:
        // - repeating char needle
        // - single char needle
        // - same length needle and haystack
        // - not first occurrence is match
        // - needle size 1

        // pseudocode:
        // size EQUALS needle.length
        // counter EQUALS 1
        //
        // FOR h_char IN haystack
        //    IF haystack[h_char] EQUALS needle[0]
        //       FOR n_char in needle
        //          IF haystack[j] NOT EQUALS needle[j]
        //              break
        //          counter ++
        //    IF counter EQUALS size
        //       return h_char
        //    ELSE 
        //       counter EQUALS 0

        int size = needle.length();
        int counter = 1;
        bool matched = false;

        for (int i = 0; i < haystack.length(); i ++) {
            if (haystack[i] == needle[0]) {
                matched = true;
                for (int j = 1; j < needle.length(); j ++) {
                    if (haystack[j+i] != needle[j]) {
                        break;
                    }
                    counter ++;
                }
            }
            if (counter == size && matched) {
                return i;
            } else {
                counter = 1;
            }
        }

        return -1;
    }
};
