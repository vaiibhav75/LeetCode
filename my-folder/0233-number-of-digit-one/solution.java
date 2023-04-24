class Solution {

    public static void main(String[] args) {
        System.out.println(countDigitOne(13));
    }
    static int countDigitOne(int n) {
        String s = String.valueOf(n);

        int k = s.length();

        int[] arr = new int[k];
        k--;

        for (int i = 0; i <= k ; i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int nn = n;


        long ans = 0;

        if (arr[k] >= 1) {
            ans++;
        }

        int i = 1;

        while (k-i >= 0) {
            int j = k - i;

            if (arr[j] >= 2) {
                ans += Math.pow(10, i);
            }
            if (arr[j] == 1) {
                ans += nn%(Math.pow(10,i)) + 1;
            }
            i++;
        }

        long num = 1;

        while (nn > 0) {
            nn /= 10;
            ans += nn*num;
            num *= 10;
        }

        return (int)ans;



    }
}
