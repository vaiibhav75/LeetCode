class Solution {

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        } if (n == 3) {
            return 1;
        }

        boolean[] arr = new boolean[n];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i*i <= n ; i++) {
            if (!arr[i]) {
                for (int j = i+i; j < n; j+= i) {
                    arr[j] = true;
                }
            }
        }
        int count = 1;
        for (int i = 3; i <n ; i+=2) {
            if (!arr[i]) {
                count++;
            }
        }
        return count;

    }
}