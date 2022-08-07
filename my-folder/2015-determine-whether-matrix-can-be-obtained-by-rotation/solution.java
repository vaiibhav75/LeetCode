class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int length = mat.length - 1;

        for (int count = 0; count < 4; count++) {

            boolean ans = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {

                    if ((count == 0) && (mat[i][j] != target[i][j])) {
                        ans = false;
                        break;
                    }
                    if ((count == 1) && (mat[i][j] != target[length - j][i])) {
                        ans = false;
                        break;
                    }
                    if ((count == 2) && (mat[i][j] != target[length - i][length - j])) {
                        ans = false;
                        break;
                    }
                    if ((count == 3) && (mat[i][j] != target[j][length - i])) {
                        ans = false;
                        break;
                    }
                }
                if (!ans) break;
            }
            if (ans) return true;
        }

        return false;
    }
}
