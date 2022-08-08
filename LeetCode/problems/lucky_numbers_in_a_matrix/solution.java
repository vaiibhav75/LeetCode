class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int minvalue = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min ){
                    min = matrix[i][j];
                    minvalue = j;
                }

            }
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if ( matrix[k][minvalue] > matrix[i][minvalue]) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                ans.add(matrix[i][minvalue]);
            }
        }
        return ans;
    }
}