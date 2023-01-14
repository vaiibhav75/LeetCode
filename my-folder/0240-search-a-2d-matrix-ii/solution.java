class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (bs(matrix[i], target )){
                return true;
            }
        }
        return false;
    }

    static boolean bs (int[] arr, int target) {
        int hi = arr.length-1;
        int lo = 0;

        while (hi >= lo) {
            int mid = (hi + lo)/2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                lo = mid +1;
            } else {
                hi = mid -1;
            }
            
        }
        return false;
    }

}
