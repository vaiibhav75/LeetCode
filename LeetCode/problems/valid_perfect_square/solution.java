class Solution {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }
    static boolean isPerfectSquare(int num) {
        if ( num == 1 ) {
            return true;
        }

        int s = 1;
        int e = num/2;
        int m  = s + (e-s)/2;

        while (s <= e) {
            if (m > num/m ) {
                e = m-1;
            } else if (m < num/m) {
                s = m+1;
            } else {
                if ( m * m == num ) {
                    return true;
                } else {
                    return false;
                }
                
            }
            m  = s + (e-s)/2;
        }
        return false;
    }
}