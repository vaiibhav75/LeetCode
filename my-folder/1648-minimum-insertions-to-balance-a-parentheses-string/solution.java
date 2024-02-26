class Solution {
    public int minInsertions(String s) {
        // Stack<Character> stack = new Stack<>();
        int ans =0;
        int val = 0;
        int n = s.length();
        for (int i = 0; i <  n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                val++;
            } else if (i < n-1 && s.charAt(i+1) == ')') {
                if (val == 0) {
                    ans++;
                } else {
                    val--;
                }
                i++;

            } else {
                if (val == 0) {
                    ans+= 2;
                } else {
                    val--;
                    ans++;
                }
            }
        }

        return ans +val*2;
    }
}
