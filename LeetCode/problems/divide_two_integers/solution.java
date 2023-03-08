class Solution {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }

    static int divide (int dividend, int divisor){
        if (dividend == 0) {
            return 0;
        }
        return divide2(dividend, divisor);
    }
    static int divide2(long dividend, long divisor) {


        long ans = 0;
        long count = 1;
        boolean isNegative = false;
        if (dividend < 0) {
            dividend = -dividend;
            isNegative = true;


        }
        if (divisor < 0) {
            divisor = -divisor;
            isNegative = !isNegative;
        }
        while (dividend > 0) {

            if (divisor < dividend) {
                while ((divisor << 1) < dividend) {
                    divisor <<= 1;
                    count <<= 1;
                }
            } else if (divisor > dividend) {
                while (divisor > dividend) {
                    divisor >>= 1;
                    count >>= 1;
                    if (count == 0) {
                        break;
                    }
                }
            }


            dividend = dividend - divisor;
            ans += count;
        }
        if (isNegative) {
            ans = -ans;
        }

        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) ans;

    }
}