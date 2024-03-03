class Solution {
    public int calculate(String s) {
        Queue<String> parser = getStrings(s);
        parser.add(")");
        Stack<String> calculator = new Stack<>();
        calculator.push("(");
        while (!parser.isEmpty()) {
            String x = parser.poll();
            
            if (x.equals(")")) {
                int val = 0;
                int prev = 0;
                String curr = calculator.pop();
                while (!curr.equals("(")) {
                    if (curr.equals("+")) {
                        val += prev;
                        prev = 0;
                    } else if (curr.equals("-")) {
                        val-= prev;
                        prev = 0;
                    } else {
                        prev = no(curr);
                    }
                    curr = calculator.pop();
                }
                val+= prev;
                calculator.push(str(val));
                continue;
            }
            calculator.push(x);
        }
        
        return no(calculator.pop());
    }

    private static Queue<String> getStrings(String s) {
        Queue<String> parser = new LinkedList<>();
        int i = 0;
        StringBuilder curr = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c >= '0' && c <= '9') {
                curr.append(c);
                continue;
            }

            if (!curr.isEmpty()) {
                parser.add(curr.toString());
                curr = new StringBuilder();
            }

            if (c != ' ') {
                parser.add(String.valueOf(c));
            }
        }

        if (!curr.isEmpty()) {
            parser.add(curr.toString());
            curr = new StringBuilder();
        }
        return parser;
    }

    static int no(String s ) {
        return Integer.parseInt(s);
    }

    static String str(int t) {
        return String.valueOf(t);
    }
}
