class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int lasti = mat.length-1;
        int lastj = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(compare(mat,i,j)) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static boolean compare(int[][] mat, int i, int j) {
        boolean x = compareLeft (mat, i, j);
        if (!x) {
            return false;
        }
        x = compareRight (mat, i, j);
        if (!x) {
            return false;
        }
        x = compareTop (mat, i, j);
        if (!x) {
            return false;
        }
        x = compareBottom (mat, i, j);
        if (!x) {
            return false;
        }

        return true;
    }

    static boolean compareLeft (int[][] mat, int i, int j) {
        if (j == 0) {
            return true;
        }

        if (mat[i][j] > mat[i][j-1]) {
            return true;
        }

        return false;
    }

    static boolean compareRight (int[][] mat, int i, int j) {
        if (j == mat[0].length-1) {
            return true;
        }

        if (mat[i][j] > mat[i][j+1]) {
            return true;
        }

        return false;
    }

    static boolean compareTop (int[][] mat, int i, int j) {
        if (i == 0) {
            return true;
        }

        if (mat[i][j] > mat[i-1][j]) {
            return true;
        }

        return false;
    }

    static boolean compareBottom (int[][] mat, int i, int j) {
        if (i == mat.length-1) {
            return true;
        }

        if (mat[i][j] > mat[i+1][j]) {
            return true;
        }

        return false;
    }
}