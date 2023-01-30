class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int collum = matrix[0].length-1;
        while (row < matrix.length && collum >= 0) {
            if (matrix[row][collum] == target) {
                return true;
            } else if (matrix[row][collum] > target) {
                collum--;
            } else if (matrix[row][collum] < target) {
                row++;
            }
        }
        return false;
    }
}
