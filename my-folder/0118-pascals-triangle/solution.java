class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            for (int j = 1; j < i; j++) {
                arr.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            if (i > 0){
                arr.add(1);
            }
            ans.add(arr);
        }
        return ans;
    }
}

