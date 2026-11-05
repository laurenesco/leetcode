# https://leetcode.com/problems/removing-stars-from-a-string

class Solution:
    def removeStars(self, s: str) -> str:
        result = []

        for symbol in s:
            if symbol != '*':
                result.append(symbol)
            else:
                result.pop()

        return ''.join(result)
