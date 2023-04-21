class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];
        int[] arr = {rCenter, cCenter};
        int n = rows*cols;
        int x = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[x][0] = i;
                ans[x][1] = j;
                x++;
            }
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (distanceGreater(ans[j],ans[j+1],arr)) {
                    swap(ans,j);
                }
            }
        }
        return ans;
    }
    
    static void swap (int[][] arr, int x) {
        int[] temp = arr[x];
        arr[x] = arr[x+1];
        arr[x+1] = temp;
    }

    static boolean distanceGreater (int[] arr1, int[] arr2, int[] compare) {
        int distance1 = Math.abs(compare[0] - arr1[0]) + Math.abs(compare[1] - arr1[1]);
        int distance2 = Math.abs(compare[0] - arr2[0]) + Math.abs(compare[1] - arr2[1]);
        return distance1 > distance2;
    }
}
