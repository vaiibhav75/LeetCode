class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        
        while (i <= j) {
            if (nums[i] == 0) {
                int x = i;
                while (x < j) {
                    int temp = nums[x];
                    nums[x] = nums[x+1];
                    nums[x+1] = temp;
                    x++;
                }
                j--;
                
            } else {
                i++;
            }
            
        }
    }
}
