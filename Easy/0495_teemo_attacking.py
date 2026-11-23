# https://leetcode.com/problems/teemo-attacking

class Solution:
    def findPoisonedDuration(self, timeSeries: list[int], duration: int) -> int:
        prev_end = float('-inf')
        poisoned_seconds = 0

        for attack in timeSeries:
            start = attack
            end = attack + duration - 1

            poisoned_seconds += duration

            if start <= prev_end:
                poisoned_seconds -= prev_end - start + 1

            prev_end = end

        return poisoned_seconds
