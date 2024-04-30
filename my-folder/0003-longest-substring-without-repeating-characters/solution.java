class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int ans = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            prev = Math.max(prev, map[s.charAt(i)] + 1);
            ans = Math.max(ans, i - prev + 1);
            map[s.charAt(i)] = i;
        }
        return ans;
    }
}
