# https://leetcode.com/problems/non-overlapping-intervals

class Solution:
    def eraseOverlapIntervals(self, intervals: list[list[int]]) -> int:
        removals = 0
        prev_end = float('-inf')

        # Sort by end of interval
        intervals.sort(key=lambda x: x[1])

        for start, end in intervals:
            if start < prev_end:
                # We can remove current one since we presorted the end bounds
                removals += 1
            else:
                prev_end = end

        return removals
