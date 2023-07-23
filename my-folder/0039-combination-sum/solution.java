class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        solve(candidates,target,0,new int[candidates.length]);
        return ans;
    }

    static List<List<Integer>> ans;

    static void solve (int[] candidates, int target, int x, int[] curr) {
        if (target == 0) {
            List<Integer> insert = new ArrayList<>();
            for (int i = 0; i < candidates.length; i++) {
                for (int j = 0; j < curr[i]; j++) {
                    insert.add(candidates[i]);
                }
            }
            ans.add(insert);
            return;
        }

        if (x >= candidates.length) {
            return;
        }

        for (int i = 0; i*candidates[x] <= target; i++) {
            curr[x] = i;
            solve(candidates,target-i*candidates[x], x+1, curr);

        }
        curr[x] = 0;


        return;
    }
}
