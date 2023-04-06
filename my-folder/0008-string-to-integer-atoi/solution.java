class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c <= 'z' && c >= 'a' || c == '.') {
                return (int) ans;
            }

            if (c == '+') {
                int j = i+1;
                if (j == s.length()) {
                        return (int) ans;
                    }
                char x = s.charAt(j);
                while (x <= '9' && x >= '0') {
                    int a = x - '0';
                    ans = ans*10 + a;
                    if (ans > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    j++;
                    if (j == s.length()) {
                        return (int) ans;
                    }
                    x = s.charAt(j);
                }
                return (int) ans;
            }

            if (c == '-') {
                int j = i+1;
                if (j == s.length()) {
                        return (int) (ans*(-1));
                    }
                char x = s.charAt(j);
                while (x <= '9' && x >= '0') {
                    int a = x - '0';
                    ans = ans*10 + a;
                    if (ans > Integer.MAX_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                    j++;
                    if (j == s.length()) {
                        return (int) (ans*(-1));
                    }
                    x = s.charAt(j);
                }
                return (int) (ans*(-1));
            }

            if (c <= '9' && c >= '0') {
                int j = i;
                if (j == s.length()) {
                        return (int) ans;
                    }
                char x = s.charAt(j);
                while (x <= '9' && x >= '0') {
                    int a = x - '0';
                    ans = ans*10 + a;
                    if (ans > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    j++;
                    if (j == s.length()) {
                        return (int) ans;
                    }
                    x = s.charAt(j);
                }
                return (int) ans;
            }
        }
        return (int) ans;
    }
}
