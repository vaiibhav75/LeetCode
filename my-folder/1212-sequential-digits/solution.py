class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        ans = []

        for i in range(2, 11):
            val = 1
            map = 1

            for j in range(1, i):
                x = val % 10
                val *= 10
                val += (x + 1)

                map *= 10
                map += 1

            for j in range(10 - i):
                if low <= val <= high:
                    ans.append(int(val))
                val += map

        return ans

