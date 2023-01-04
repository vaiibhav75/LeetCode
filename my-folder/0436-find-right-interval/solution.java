class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int arr[][] = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            arr[i][0] = intervals[i][0];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] ans = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            ans[i] = search(arr, intervals[i][1]);
        }

        return ans;

    }

    static int search (int[][] arr, int x) {
        if (x < arr[0][0]) {
            return -1;
        }
        if (x > arr[arr.length-1][0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ) {
            int mid = start + (end - start)/2 ;
            if (arr[mid][0] == x) {
                return arr[mid][1];
            } else if (arr[mid][0] >= x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start][1];
    }
}
