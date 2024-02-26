class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int ans =0;
        for (char c: s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    ans++;
                    continue;
                }
                char x = stack.peek();
                if (x == '(') {
                    x = ')';
                }
                if (x == '[') {
                    x = ']';
                }
                if (x == '{') {
                    x = '}';
                }

                if (c != x) {
                    ans++;
                } else {
                    stack.pop();
                }
            }
        }

        return ans +stack.size();
    }
}