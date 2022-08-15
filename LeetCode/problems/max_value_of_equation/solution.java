class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int f = 1;
        for (int i = 0; i < points.length; i++) {
           if (f < i+1){
               f = i+1;
           }
            for (int j = f; j<points.length; j++) {
                if (points[j][0] > points[i][0] + k){
                    break;
                }
                if (points[i][1] - points[i][0] + points[j][0] + points[j][1] > max) {
                    max = points[i][1] - points[i][0] + points[j][0] + points[j][1];
                    f=j-1;
                }
            }
            
        }
        return max;
    }

}
