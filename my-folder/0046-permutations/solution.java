class Solution {

    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), nums);
        return ans;
    }
     
    static void solve (List<List<Integer>> ans, List<Integer> p, int[] up) {
        if (up.length == 0) {
            ans.add(p);
            return;
        }

        int x = up[0];
        for (int i = 0; i <= p.size(); i++) {
            List<Integer> nn = new ArrayList<>(p);
            nn.add(i, x);
            solve(ans, nn, Arrays.copyOfRange(up, 1, up.length));
        }

    }
}
