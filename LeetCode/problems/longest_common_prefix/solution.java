class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean val = checker(strs, i);
            if (val) {
                ans.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return ans.toString();
    }
    static boolean checker(String[] s, int index){
        
        for (int i = 0; i < s.length; i++) {
            if (index >= s[i].length()) {
                return false;
            }
            if (s[i].charAt(index) != s[0].charAt(index)) {
                return false;
            }
        }
        return true;
    } 
}