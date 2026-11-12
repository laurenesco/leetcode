# https://leetcode.com/problems/pascals-triangle/

class Solution:
    def generate(self, numRows: int) -> list[list[int]]:
        """
        Generates Pascal's triangle as a nested list.

        Params: 
         - numRows: Determines how many levels are included in the pyramid
        """

        triangle = [[1]]

        while len(triangle) < numRows:
            triangle.append(self._getNextRow(triangle[len(triangle)-1]))

        return triangle

    def _getNextRow(self, prevRow: list[int]) -> list[int]:
        """
        Helper function to generate the next row in Pascal's pyramid

        Params:
         - prevRow: The previous row in the pyramid
        """

        lPtr = 0
        rPtr = 1
        newRow = [1]

        while (lPtr < rPtr) and (rPtr < len(prevRow)):
            newRow.append(prevRow[lPtr] + prevRow[rPtr])

            lPtr += 1
            rPtr += 1

        newRow.append(1)
        return newRow
