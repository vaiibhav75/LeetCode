class Solution {

    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));
    }

    static int calculate(String s) {
        Stack<Boolean> calc = new Stack<>();
        Stack<Integer> num = new Stack<>();
        Queue<String> parser = getStrings(s);

        while (!parser.isEmpty()) {
            String x = parser.remove();

            if (x.equals("/")) {
                num.push(num.pop()/no(parser.remove()));
                continue;
            }

            if (x.equals("*")) {
                num.push(num.pop()*no(parser.remove()));
                continue;
            }

            if (x.equals("+")) {
                calc.push(true);
                continue;
            }

            if (x.equals("-")) {
                calc.push(false);
                continue;
            }

            num.push(no(x));

        }

        int ans = 0;

        while (!calc.isEmpty()) {
            if (calc.pop()) {
                ans += num.pop();
            } else {
                ans-= num.pop();
            }
        }

        if (!num.isEmpty()) {
            ans += num.pop();
        }
        return ans;

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
