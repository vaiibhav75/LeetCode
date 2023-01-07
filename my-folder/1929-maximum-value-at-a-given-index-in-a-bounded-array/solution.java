class Solution {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public int maxValue(int n, int index, int maxSum) {
        long l = index;
        long r = n - index - 1;
        long res = 0;
        long lo = 1;
        long hi = maxSum;


        while (lo <= hi) {
            long mid = lo + (hi - lo)/2;
            long sum = mid;

            long ls = 0;
            long rs = 0;
            long num = mid - 1;
            

            if (num >= l) {
                ls = sum(num) - sum(num-l);
            } else {
                ls = sum(num) + (l - num);
            }

            if (num >= r) {
                rs = sum(num) - sum(num-r);
            } else {
                rs = sum(num) + (r - num);
            }

            sum += ls + rs;

            if (sum <= maxSum) {
                lo = mid + 1;
                res = mid;
            } else {
                hi = mid-1;
            }

        }
        return (int) res;
    }

    static long sum (long m) {
        return (m)*(m+1)/2;
    }
}
