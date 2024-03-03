class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> indexes = new Stack<>();
        indexes.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                indexes.push(i);
            } else {
                if (indexes.size() > 1 && s.charAt(indexes.peek()) == '(') {
                    indexes.pop();
                } else {
                    indexes.push(i);
                }
            }
        }

        int prev = s.length();
        int ans = 1;
        
        while (!indexes.isEmpty()) {
            int x = indexes.pop();
            ans = Math.max(ans,prev-x);
            prev = x;
        }
        
        return ans-1;

        

    }
}