class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}}));
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans = new ArrayList<>();
        solve(new ArrayList<>(), 0,graph);
        return ans;
    }

    static List<List<Integer>> ans;

    static void solve (List<Integer> map, int i, int[][] graph) {
        map.add(i);
        if (i == graph.length-1) {
            ArrayList<Integer> temp = new ArrayList<>(map);
            ans.add(temp);
            map.remove(map.size()-1);
            return;
        }


        for (int j = 0; j < graph[i].length; j++) {

            solve(map,graph[i][j], graph);

        }

        map.remove(map.size()-1);
    }
}