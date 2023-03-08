class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < (1<< nums.length); i++) {
            List<Integer> arr = new ArrayList<>();
            int j = 0;
            while (j < 12) {
                if (((i>>j) & 1) == 1) {
                    arr.add(nums[j]);
                }
                j++;
            }

//            Collections.sort(arr);
            if (ans.contains(arr)) {
                continue;
            }
            ans.add(arr);
        }
        return ans;
    }
}