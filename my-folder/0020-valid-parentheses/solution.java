class Solution {
    public boolean isValid(String s) {
        StringBuilder str = new StringBuilder(s);
        return solve(str);
    }
    
    static boolean solve (StringBuilder str) {
        if (str.length() == 0) {
            return true;
        }
        int k = 0;
        char x = '0';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '['){
               x = c;
               k = i;
            }
        }
        if (x == '0' ) {
            return false;
        }
        
        if (k == str.length()-1) {
            return false;
        }
        
        if (x == '(') {
            x = ')';
        }
        if (x == '[') {
            x = ']';
        }
        if (x == '{') {
            x = '}';
        }
        
        if (x == str.charAt(k+1)) {
            str.deleteCharAt(k);
            str.deleteCharAt(k);
            return solve(str);
        }
        return false;
    }
}
