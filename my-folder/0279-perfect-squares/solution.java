class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        for (int i = 1; i*i <= n ; i++) {
            arr[i*i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                continue;
            }
            int x = 1;
            int y = i-1;
            int min = Integer.MAX_VALUE;
            while (x <= y) {
                min = Math.min(min, arr[x] + arr[y]);
                x++;
                y--;
            }
            arr[i] = min;
            
        }
        return arr[n];
        
    }
}
