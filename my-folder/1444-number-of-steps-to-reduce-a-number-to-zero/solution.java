class Solution {
    public int numberOfSteps(int num) {
        return solve (num, 0);
    }

    static int solve (int n, int steps) {
        if (n == 0) {
            return steps;
        }
        steps++;

        if (n % 2 == 0) {
            return solve(n/2 , steps);
        }

        return solve (n-1, steps);
    }
}

