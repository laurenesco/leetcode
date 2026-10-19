# https://leetcode.com/problems/find-target-indices-after-sorting-array

class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        indices = []
        nums.sort()

        for idx, num in enumerate(nums):
            if num == target:
                indices.append(idx)

        return indices
