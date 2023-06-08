class Solution {

//    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7,8};
//        List<List<Integer>> ans = subsets(Arrays.);
//        System.out.println(Collections.unmodifiableList(ans));
//    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        ans.add(p);

        for (int i = 0; i < nums.length; i++) {
            int n = ans.size();
            int x = nums[i];

            for (int j = 0; j < n; j++) {
                List<Integer> curr = new ArrayList<>(ans.get(j));
                curr.add(x);
                ans.add(curr);
            }
        }
        return ans;
    }

    
}
