class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix [matrix.length-1][matrix[0].length-1]) {
            return false;
        }
        int x = search(matrix, target);
        return search2(matrix, target, x);

    }

    static int search(int[][] arr,int x) {
        int start = 0;
        int end = arr.length-1;

        while (start<= end) {
            int mid = start + (end-start)/2;
            if (arr[mid][0] == x) {
                return mid;
            } else if (arr[mid][0] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    static boolean search2(int[][] arr,int x, int num) {
        int start = 0;
        int end = arr[num].length-1;

        while (start<= end) {
            int mid = start + (end-start)/2;
            if (arr[num][mid] == x) {
                return true;
            } else if (arr[num][mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
