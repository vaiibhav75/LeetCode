class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char x = stack.pop();
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
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}