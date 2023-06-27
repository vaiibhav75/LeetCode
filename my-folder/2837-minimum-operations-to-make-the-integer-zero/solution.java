class Solution {

    
    static int makeTheIntegerZero(int num1, int num2) {
        int i = 1;
        long num = num1;
        num-= num2;
        while (num > 0) {

            if (bitcount(num) <= i && num >= i) {
                return i;
            }
            i++;
            num-= num2;

        }

        return -1;
    }

    static int bitcount (long n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n= n>>1;
        }
        return count;
    }
}
