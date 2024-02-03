class Solution {
    public int numberOfPairs(int[][] points) {
        // sort array according to the first collumn then according to the second collumn
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length-i-1; j++) {
                if (points[j][0] > points[j+1][0]) {
                    int[] temp = points[j];
                    points[j] = points[j+1];
                    points[j+1] = temp;
                } else if (points[j][0] == points[j+1][0]) {
                    if (points[j][1] < points[j+1][1]) {
                        int[] temp = points[j];
                        points[j] = points[j+1];
                        points[j+1] = temp;
                    }
                }
            }
        }


        int ans = 0;
        // for (int[] point : points) {
        //     System.out.println(Arrays.toString(point));
        // }
        for (int i = 0; i < points.length; i++) {
            int min = Integer.MIN_VALUE;
            int max = points[i][1];
            for (int j = i+1; j < points.length; j++) {
                if (points[j][1] <= max && points[j][1] > min) {
                    ans++;
                    min = Math.max(min,points[j][1]);
                }
            }
        }



        return ans;
    }

    // sort a particular subarray according to the second collumn

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int[][] points = {{6,2},{4,4},{2,6}};
    //     System.out.println(sol.numberOfPairs(points));
    // }
}
