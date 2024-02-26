class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftBound = new int[n];
        int[] rightBound = new int[n];

        Stack<Integer> indexes = new Stack<>();
        for (int i = 0; i < n; i++) {
            leftBound[i] = i;
            while (!indexes.isEmpty() && heights[indexes.peek()] >= heights[i]) {
                leftBound[i] = leftBound[indexes.pop()];
            }
            indexes.push(i);
        }

        indexes = new Stack<>();

        for (int i = n-1; i >= 0 ; i--) {
            rightBound[i] = i;
            while (!indexes.isEmpty() && heights[indexes.peek()] >= heights[i]) {
                rightBound[i] = rightBound[indexes.pop()];
            }
            indexes.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, (rightBound[i] - leftBound[i] + 1) *heights[i]);
        }

        // System.out.println(Arrays.toString(leftBound));
        // System.out.println(Arrays.toString(rightBound));

        return ans;
    }
}