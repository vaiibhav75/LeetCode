class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,new boolean[candidates.length],0);
        return ans;
    }

    static List<List<Integer>> ans;

    static void solve (int[] candidates, int target, boolean[] curr, int i) {
        if (i == candidates.length && target == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < curr.length; j++) {
                if (curr[j]) {
                    temp.add(candidates[j]);
                }
            }
//            Collections.sort(temp);
//            if (ans.contains(temp)) {
//                return;
//            }
            ans.add(temp);
            return;
        }

        if (i >= candidates.length || target < 0) {
            return;
        }
        int prev = i-1;
        if (prev >= 0 && candidates[prev] == candidates[i]) {
            if (!curr[prev]) {
                solve(candidates,target,curr,i+1);
                return;
            }
            
        }
        curr[i] = true;
        solve(candidates,target-candidates[i],curr,i+1);
        curr[i] = false;
        solve(candidates,target,curr,i+1);
    }
}