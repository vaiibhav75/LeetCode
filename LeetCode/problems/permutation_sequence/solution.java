class Solution {

    public static void main(String[] args) {
        System.out.println(getPermutation(3,2));
    }
    static String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();
        int i = 1;
        StringBuilder arr = new StringBuilder();
        for (int j = 1; j <= n ; j++) {
            arr.append(j);
        }
        while (k > 0) {
            int val;
            val = (int) Math.ceil((double) k /factorial(n-i));
            val--;
            ans.append(arr.charAt(val));
            arr.deleteCharAt(val);
            k %= factorial(n-i);
            i++;
        }
        arr.reverse();
        ans.append(arr.toString());

        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.toString();

    }

    static int factorial (int n ) {
        if (n== 0   || n == 1) {
            return 1;
        }
        int ans = 1;

        for (int i = 1; i <= n ; i++) {
            ans *= i;
        }
        return ans;
    }
}