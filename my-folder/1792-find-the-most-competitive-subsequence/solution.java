class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = nums.length-i;
            
            
            while (!stack.isEmpty() && remaining > k-stack.size() && stack.peek() > nums[i]) {
                stack.pop();
            }
            
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        
        int[] arr = new int[k];
        
        while (k-- > 0) {
            arr[k] = stack.pop();
        }
        
        return arr;
    }
}
