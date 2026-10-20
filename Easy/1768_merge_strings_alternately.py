# https://leetcode.com/problems/merge-strings-alternately

class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        solution = []
        word1 = list(word1)
        word2 = list(word2)

        for idx in range(len(word1) + len(word2)):
            if (idx % 2 == 0 or not word2) and word1:
                ltr = word1.pop(0)
            elif word2: 
                ltr = word2.pop(0)

            solution.append(ltr)

        return ''.join(solution)
