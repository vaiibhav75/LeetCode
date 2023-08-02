class Solution {
    public int numTilePossibilities(String tiles) {
        int ans = 0;
        for (int i = 1; i <= tiles.length() ; i++) {
            ans += solve(new StringBuilder(tiles),i,"",new HashSet<>());
        }
        return ans;
    }
    
    static int solve (StringBuilder tiles, int k, String curr, HashSet<String> map) {
        if (k == 0) {
            if (map.contains(curr)) {
                return 0;
            } else {
                map.add(curr);
                return 1;
            }
        }
        
        int count = 0;

        for (int i = 0; i < tiles.length(); i++) {
            char x = tiles.charAt(i);
            tiles.deleteCharAt(i);
            count += solve(tiles,k-1,curr + x, map);
            tiles.insert(i,x);
        }
        return count;
    } 
}