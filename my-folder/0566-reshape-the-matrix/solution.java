class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
//if r,c same as original OR rc != original matrix rowcol then return mat
        if ((mat.length == r && mat[0].length == c) || ((r * c) != (mat.length * mat[0].length)))
            return mat;

        //store all mat elements serially in arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr.add(mat[i][j]);
            }
        }
        //add arraylist element in ret[]
        int[][] ret = new int[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = arr.get(k);
                k++;
            }
        }

        return ret;

    }
}
