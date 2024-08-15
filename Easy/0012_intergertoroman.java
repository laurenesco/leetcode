//
// Program Name:        roman_numerals.java
// Date Last Modified:  08/09/2023
// Last Modified By:    Lauren Escobedo
// Language:            Java
// Runtime:             2 ms [Beat 100%]
// Memory Usage:        43.32 MB [Beat 97.79%]
//
// Program Description:
//
//      Given roman numeral, return integer representation 
//

class Solution {
    public int romanToInt(String s) {
        String romanNumeral = s;
        int length = romanNumeral.length();
        int pointer = 0, solution = 0;

        while (pointer < length) {
            switch (romanNumeral.charAt(pointer)) {
                case 'I':
                    if (length-1 > pointer) {
                        if (romanNumeral.charAt(pointer+1) == 'V') {
                            solution += 4;
                            pointer ++;
                        } else if (romanNumeral.charAt(pointer+1) == 'X') {
                            solution += 9;
                            pointer ++;
                        } else {
                            solution += 1;
                        }
                    } else {
                        solution += 1;
                    }
                    break;
                case 'V':
                    solution += 5;
                    break;
                case 'X':
                    if (length-1 > pointer) {
                        if (romanNumeral.charAt(pointer+1) == 'L') {
                            solution += 40;
                            pointer ++;
                        } else if (romanNumeral.charAt(pointer+1) == 'C') {
                            solution += 90;
                            pointer ++;
                        } else {
                            solution += 10;
                        }
                    } else {
                        solution += 10;
                    }
                    break;
                case 'L':
                    solution += 50;
                    break;
                case 'C':
                    if (length-1 > pointer) {
                        if (romanNumeral.charAt(pointer+1) == 'D') {
                            solution += 400;
                            pointer ++;
                        } else if (romanNumeral.charAt(pointer+1) == 'M') {
                            solution += 900;
                            pointer ++;
                        } else {
                            solution += 100;
                        }
                    } else {
                        solution += 100;
                    }
                    break;
                case 'D':
                    solution += 500;
                    break;
                case 'M':
                    solution += 1000;
                    break;
                default:
                    break;
            }
            pointer ++;
        }

        return solution;
    }
}

