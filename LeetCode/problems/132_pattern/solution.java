class Solution {
    public boolean find132pattern(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            min[i] = Math.min(min[i-1],nums[i-1]);
        }
        // System.out.println(Arrays.toString(min));

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[nums.length-1]);
        for (int i = nums.length-2; i > 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= min[i]) {
                stack.pop();
            }
            if (nums[i] < min[i]) {
                continue;
            }
            if (!stack.isEmpty() && stack.peek() < nums[i]) {
                return true;
            }

            stack.push(nums[i]);
            // System.out.println(stack);
        }
        return false;
    }
}