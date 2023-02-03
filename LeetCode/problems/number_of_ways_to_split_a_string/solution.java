class Solution {
    public int numWays(String s) {
        int numOfOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                numOfOnes++;
            }
        }

        if (numOfOnes%3 != 0) {
            return 0;
        }

        int num = numOfOnes/3;

        if ( num == 0) {
            long a = (s.length()-1);
            a = a * (s.length()-2);
            a = a/2;
            a = a % 1000000007;
            return (int) a;
        }

        long a = -1;
        long b = -1;
        long c = -1;
        long d = -1;

        if (num == 1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (a == -1) {
                        a = i;
                    } else if (b == -1) {
                        b = i;
                        c = i;
                    } else if (d == -1){
                        d = i;
                        break;
                    };
                }
            }
        } else {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count++;
                    if (count == num) {
                        if (a == -1) {
                            a = i;
                            count -= 1;
                        } else if (b == -1) {
                            b = i;
                            count = 1;
                        } else if (c == -1) {
                            c = i;
                            count -= 1;
                        } else if (d == -1) {
                            d = i;
                            break;
                        }
                    }
                }
            }
        }
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        long ans = (b-a)*(d-c);
        ans = ans % 1000000007;
        return (int) ans;



    }
}