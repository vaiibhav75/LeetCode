class Solution {
    public String toLowerCase(String s) {
        StringBuilder w1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                int x = ((int)s.charAt(i)) + 32;
                w1.append((char) x);
            } else {
                w1.append(s.charAt(i));
            }
        }
        return w1.toString();
    }
}