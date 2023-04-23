class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int sum = 0;
        for (int k = 0; k < nums.length - 2; k++) {


            int i = k+1;
            int j = nums.length - 1;

            while (j > i) {

                int x = nums[j] + nums[i] + nums[k];
                if (x > target) {
                    j--;
                } else if (x < target) {
                    i++;
                } else {
                    return x;
                }
                
                
                int diff = Math.abs(target-x);
                if (diff <= mindiff) {
                    mindiff = diff;
                    sum = x;
                }
                
            }
        }
        
        return sum;

    }
}
