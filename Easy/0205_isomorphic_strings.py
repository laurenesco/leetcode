# https://leetcode.com/problems/isomorphic-strings

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        matches_s = {}
        matches_t = {}

        for idx in range(len(s)):
            if matches_s.setdefault(s[idx], t[idx]) != t[idx]:
                return False
            if matches_t.setdefault(t[idx], s[idx]) != s[idx]:
                return False

        return True
