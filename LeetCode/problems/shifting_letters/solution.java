class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        shifts[shifts.length -1] %= 26;
        for (int i = shifts.length-2; i >= 0 ; i--) {
            shifts[i] = (shifts[i] + shifts[i+1])%26;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int valOfChar = (((s.charAt(i) - 'a') + shifts[i])%26) + 'a';
            ans.append((char) valOfChar);
        }
        return ans.toString();
    }
}