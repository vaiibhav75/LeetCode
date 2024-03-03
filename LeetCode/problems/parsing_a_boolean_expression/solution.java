class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            if (c == ',') {
                continue;
            }

            if (c == ')') {
                boolean and = true;
                boolean or = false;
                boolean not = true;

                char x = stack.pop();

                while (x != '(') {
                    if (x == 't') {
                        or = true;
                        not = false;
                    } else {
                        and = false;
                        not = true;
                    }
                    x = stack.pop();
                }
                char insert;
                x = stack.pop();
                if (x == '&') {
                    insert = and ? 't':'f';
                } else if (x == '|') {
                    insert = or ? 't':'f';
                }else  {
                    insert = not ? 't':'f';
                }
                stack.push(insert);
            } else {
                stack.push(c);
            }
        }
        
        return stack.pop() == 't';
    }
}