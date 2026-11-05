# https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c

class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        print(f"a | b = {a | b}")

        flips = 0

        # If a | b == c, quick return 
        if a | b == c:
            return flips

        # Get width of c and create iterable bit representations
        width = max(a, b, c).bit_length() 
        bit_a = f"{a:0{width}b}"
        bit_b = f"{b:0{width}b}"
        bit_ab = f"{a|b:0{width}b}"
        bit_c = f"{c:0{width}b}"

        for place in range(len(bit_c)):

            if bit_c[place] != bit_ab[place]:

                # Only case where 2 flips are required
                if bit_a[place] == '1' and bit_b[place] == '1':
                    flips += 2

                else: 
                    flips += 1


        return flips
