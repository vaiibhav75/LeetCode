class Solution {
    public char findKthBit(int n, int k) {
        if (k%2 == 1) {
            if (k%4 == 1) {
                return '0';
            } else {
                return '1';
            }
        }

        int currVal = (int) Math.pow(2, n-1);
        int lastval = currVal;
        char currBit = '1';
        
        while (k != currVal) {
            if (k > currVal) {
                currBit = '0';
                lastval /= 2;
                currVal += lastval;
            } else {
                currBit = '1';
                lastval /= 2;
                currVal -= lastval; 
            }
        }
        return currBit;

    }
}
