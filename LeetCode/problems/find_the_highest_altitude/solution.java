class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int height = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            if ( sum >= height) {
                height = sum;
            }
        }
        return height;
    }
}