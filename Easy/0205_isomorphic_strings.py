# https://leetcode.com/problems/isomorphic-strings

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        matches_s = {}
        matches_t = {}

        for char_s, char_t in zip(s, t):
            if matches_s.setdefault(char_s, char_t) != char_t or matches_t.setdefault(char_t, char_s) != char_s:
                return False

        return True
