class Solution {
    public int binaryGap(int n) {
        while ((n & 1) != 1) {
            n >>= 1;
        }
        if (n == 0) {
            return 0;
        }

        int max = 0;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                max = Math.max(max,count);
                count = 1;
            } else {
                count++;
            }
            n >>= 1;
        }
        return max;
    }
}
