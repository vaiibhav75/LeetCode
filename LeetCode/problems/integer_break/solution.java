class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        int[] arr = new int[n];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int x = 1;
            int y = i-1;
            while (x <= y) {
                max = Math.max(arr[x]*arr[y],max);
                x++;
                y--;
            }
            max = Math.max(max, i);
            arr[i] = max;
        }

        int max = Integer.MIN_VALUE;
        int x = 1;
        int y = n-1;
        while (x <= y) {
            max = Math.max(arr[x]*arr[y],max);
            x++;
            y--;
        }
        return max;

    }
}