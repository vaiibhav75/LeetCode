class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2*n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i%n]) {
                res[stack.pop()] = nums[i%n];
            }
            stack.push(i%n);
        }
        return res;
    }
}
