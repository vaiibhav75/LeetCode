class Solution {


    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        ans.add(p);
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = ans.size();
            int x = nums[i];

            if (i == 0 || x != nums[i-1]) {
                a = 0;
            } 
            for (int j = a; j < n; j++) {
                List<Integer> curr = new ArrayList<>(ans.get(j));
                curr.add(x);
                ans.add(curr);
            }
            a = n;
        }
        return ans;
    }


}
