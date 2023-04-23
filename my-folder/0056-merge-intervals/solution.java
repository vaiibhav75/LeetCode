class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int compare = 0;
        int merges = 0;
        for (int i = 0; i < intervals.length-1; i++) {
            compare = Math.max(compare,intervals[i][1] );
            if ( compare >= intervals[i+1][0]) {
                merges++;
            }
        }

        int[][] ans = new int[intervals.length-merges][2];

        int x = 1;

        int y = 0;
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        while (x < intervals.length ) {
            if (ans[y][1] >= intervals[x][0]) {
                if (ans[y][1] >= intervals[x][1]) {
                    x++;
                    continue;
                }
                ans[y][1] = intervals[x][1];
                x++;
            } else {
                y++;
                ans[y][0] = intervals[x][0];
                ans[y][1] = intervals[x][1];
                x++;
            }

        }
        return ans;
    }
}
