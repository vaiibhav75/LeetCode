class Solution {
    public int arrangeCoins(int n) {
        int start =  1;
        int end = n;
        int mid = start + (end - start)/2;
        long temp = (long) (mid) *(mid + 1)/2;

        while (start <= end) {



            if ( temp < n) {
                start = mid + 1;
            } else if (temp > n) {
                end = mid - 1;
            } else {
                return mid;
            }
            mid = start + (end - start)/2;
            temp = (long) (mid) *(mid + 1)/2;
        }
        return end;

    }


}
