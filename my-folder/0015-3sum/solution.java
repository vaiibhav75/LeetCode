class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (k > 0 && nums[k] == nums[k-1]) {
                continue;
            }
            int target = -nums[k];
            int i = k+1;
            int j = nums.length - 1;

            while (j > i) {
                if (j < nums.length - 1 && nums[j] == nums[j+1]) {
                    j--;
                    continue;
                }

                if (i > k+1 && nums[i] == nums[i-1]) {
                    i++;
                    continue;
                }

                int x = nums[j] + nums[i];
                if (x > target) {
                    j--;
                } else if (x < target) {
                    i++;
                } else {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[k]);
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    ans.add(arr);
                    i++;
                    j--;
                }
            }
        }
        return ans;

    }
}
