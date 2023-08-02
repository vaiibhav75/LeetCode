class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().combinationSum3(3,7));
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        return solve(k,n,0);
    }

    static List<List<Integer>> solve (int k, int n, int prev) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k == 1 && n > prev && n < 10) {
            List<Integer> temp = new ArrayList<>();
            temp.add(n);
            ans.add(temp);
            return ans;
        }

        for (int i = prev+1; i < n && i < 10; i++) {
            List<List<Integer>> temp = solve(k-1,n-i,i);
            for (int j = 0; j < temp.size(); j++) {
                temp.get(j).add(i);
            }
            ans.addAll(temp);
        }
        return ans;
    }

}