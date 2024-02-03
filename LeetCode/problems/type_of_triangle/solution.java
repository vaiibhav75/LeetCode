class Solution {
    public String triangleType(int[] nums) {
        if (nums.length != 3) {
            return "none";
        }
        
        if (isTriangle(nums[0], nums[1], nums[2])) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        }
        
        return "none";
    }
    
    static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}