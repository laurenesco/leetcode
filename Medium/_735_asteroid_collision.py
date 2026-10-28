# https://leetcode.com/problems/asteroid-collision

class Solution(object):
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        """
        
        """

        [10, 15, -5, -20]

        10 15

        survivors = []

        for new_asteroid in asteroids:
            if not survivors:
                survivors.append(new_asteroid)
            else:

                top = survivors[-1]

                # If the asteroids are traveling in opposite directions
                if top * new_asteroid < 0:
                    if abs(top) > abs(new_asteroid):
                        # Destroy the new asteroid by not appending it
                        pass

                    elif abs(top) < abs(new_asteroid):
                        # Destroy the top asteroid as many times as needed
                        while 
                            survivors[-1] * new_asteroid < 0 
                        and abs(survivors[-1]) < abs(new_asteroid) 
                        and survivors:


                    else:
                        # Tie in mass, destroy both
                        survivors.pop()

