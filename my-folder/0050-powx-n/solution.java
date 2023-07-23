class Solution {

    public double myPow(double n, int k1) {
        long k = k1;
        
        if (k < 0) {
            n = 1/n;
            k = -k;
        }
        if (k == 0) {
            return 1;
        }

        if (k == 1) {
            return n;
        }

        long y = k/2;
        double x = myPow(n,(int)y);
        if (k%2 == 0) {
            double val = x *x ;
            return  val;
        }

        double val = x *x*n;
        return val;
    }
}
