class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> store = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    int[] a = {i,j};
                    store.add(a);
                }
            }
        }
        for (int i = 0; i < store.size(); i++) {
            int x = store.get(i)[0];
            int y = store.get(i)[1];
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][y] = 0;
            }
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[x][k] = 0;
            }
        }
    }
}
