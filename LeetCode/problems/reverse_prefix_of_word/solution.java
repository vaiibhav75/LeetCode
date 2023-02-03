class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        
        if (ind == -1) {
            return word;
        } else {
            StringBuilder ans = new StringBuilder();
            for (int i = ind; i >= 0 ; i--) {
                ans.append(word.charAt(i));
            }
            for (int i = ind+1; i < word.length() ; i++) {
                ans.append(word.charAt(i));
            }
            return ans.toString();
        }
    }
}