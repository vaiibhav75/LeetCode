class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                ans.append(word.reverse());
                ans.append(' ');
                word.setLength(0);
            }
        }
        ans.append(word.reverse());
        return ans.toString();
    }
}