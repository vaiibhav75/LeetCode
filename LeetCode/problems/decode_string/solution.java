class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> curr = new Stack<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ']') {
                while (stack.peek() != '[') {
                    curr.push(stack.pop());
                }
                stack.pop();
                String add = stackToString(curr);
                int val = 0;
                int pow  = 0;
                while (!stack.isEmpty() && stack.peek() <= '9' && stack.peek() >= '0') {
                    val += (int) ((stack.pop() - '0') * Math.pow(10,pow));
                    pow++;
                }
                for (int j = 0; j < val; j++) {
                    for (int k = 0; k < add.length(); k++) {
                        stack.push(add.charAt(k));
                    }
                }
                curr = new Stack<>();
            } else {
                stack.push(s.charAt(i));
            }
            
            
        }
        
        return stackToRevString(stack);
    }

    static String stackToRevString (Stack<Character> s) {
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.reverse().toString();
    }

    static String stackToString (Stack<Character> s) {
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
}