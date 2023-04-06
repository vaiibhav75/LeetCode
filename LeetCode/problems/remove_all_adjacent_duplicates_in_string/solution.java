class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        return solver(str).toString();
    }
    
    static StringBuilder solver(StringBuilder str) {
        boolean found = false;
        int x = -1;
        
        for (int i = 1; i < str.length(); i++) {
            if (i == 0) {
                break;
            }
            if (str.charAt(i) == str.charAt(i-1)) {
                found = true;
                x = i-1;
                str.deleteCharAt(x);
                str.deleteCharAt(x);
                i--;
                i--;
                
            }
        }

        if (!found) {
            return str;
        }
        
        
        
        
        return solver(str);
    }
}