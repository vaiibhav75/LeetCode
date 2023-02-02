class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i >= name.length()) {
                i= name.length()-1;
                 if (name.charAt(i) == typed.charAt(j)) {
                     if (j >= typed.length()-1) {
                         return true;
                     }
                     j++;
                     continue;
                 } else {
                     return false;
                 }
            }
            if (name.charAt(i) != typed.charAt(j)) {
                if (i == 0) {
                    return false;
                } else if (name.charAt(i-1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                } 
            } else {
                i++;
                j++;
            }
        }
        if (i <  name.length()) {
            return false;
        }
        return true;
        
    }
}
