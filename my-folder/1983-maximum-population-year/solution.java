class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int i = 0; i < logs.length; i++) {
            years[logs[i][0] - 1950]++;
            years[logs[i][1] - 1950]--;
        }

        int max = Integer.MIN_VALUE;
        int curr = 0;
        int ans = 0;

        for (int i = 0; i < years.length; i++) {
            curr += years[i];
            if (curr > max) {
                max = curr;
                ans = i + 1950;
            }
        }
        return ans;

    }
}
