class Solution {

    static int minFlips(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int minSteps = 10;

        for (int i = 0; i < (1 << (m*n)); i++) {
            int num = i;

            int steps = 0;
            int[][] arr = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[j][k] = mat[j][k];
                }
            }

            while (num > 0) {
                steps++;
                int swap = log2(num & (-num));
                int x =swap/n;
                int y = swap%n;
                swapper(arr, x,y);

                num &= num -1;
            
            }
            if (zeroChecker(arr)) {
                minSteps = Math.min(minSteps,steps);
            }

        }
        if (minSteps == 10) {
            return -1;
        }
        return minSteps;
    }

    static int log2 (int n) {
        return (int) (Math.log(n)/Math.log(2));
    }

    static boolean zeroChecker (int[][] mat) {
        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[0].length; l++) {
                if (mat[k][l] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static void swapper (int[][] mat, int x, int y) {
        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[0].length; l++) {
                if ((k == x && Math.abs(l-y) < 2 )|| (l == y && Math.abs(k-x) < 2)) {
                    mat[k][l] ^= 1;

                }
            }
        }
    }
}
