class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        
        int i = 0;
        int j = 0;
        while (i+j < word1.length() + word2.length()) {
            if (i < word1.length()) {
                ans.append(word1.charAt(i));
                i++;
                
            } else {
                i = word1.length();
            }
            if (j < word2.length()) {
                ans.append(word2.charAt(j));
                j++;

            } else {
                j = word2.length();
            }
        }
        return ans.toString();
    }
}
