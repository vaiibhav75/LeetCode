class Solution {
    
    static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }

        int start = 1;
        int end = max;

        while (start <= end) {
            int mid = start + (end-start)/2;
            long k = hrsFinder(piles, mid);

            if (k > h) {
                start = mid + 1;

            } else {
                end = mid -1;
            }
        }
        return start;
    }

    static long hrsFinder (int[] piles, int x) {
        long sum = 0;
        for (int i = 0; i < piles.length; i++) {
            long a = piles[i]/x;
            if (piles[i]%x > 0) {
                a++;
            }
            sum += a;
           
        }
        

        return sum;
    }
}
