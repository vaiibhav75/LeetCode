class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int num = 0;
        for (int i = 0; i < allowed.length(); i++) {
            num |= 1 << allowed.charAt(i) - 'a';
        }
        int count = words.length;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int x = 1 << words[i].charAt(j) - 'a';
                if ((x & num) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
