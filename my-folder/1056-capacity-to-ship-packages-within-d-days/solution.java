class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        
        System.out.println(Arrays.toString(weights));
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
        System.out.println("sum is " + sum );
        System.out.println();

        int lo = max;
        int hi = sum;
        while (hi >= lo) {
            int mid = lo + (hi-lo)/2;
            System.out.println("mid is " + mid);
            int calDays = daysCalc(weights, mid);
            System.out.println("days calculated " + calDays);
            System.out.println();
            if (calDays > days) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;

    }

    static int daysCalc (int[] weights, int k) {
        int x = 0;
        int i = 0;
        while ( i < weights.length) {
            int cap = k;
            while (cap >= weights[i]) {
                cap -= weights[i];
                if (i == weights.length-1) {
                    i++;
                    break;
                }
                i++;
            }
            x++;
        }
        return x;
    }
}
