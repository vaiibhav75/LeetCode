class Solution {
    public boolean isNumber(String s) {
        boolean eCame = false;
        boolean dotCame = false;
        boolean beforeDot = false;
        boolean afterDot = false;
        boolean beforeE = false;
        boolean affterE = false;
        if (s.length() == 0 ) {
            return false;
        }
        int i = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-'){
            
            i++;
        }
        while (i < s.length()) {
            char x = s.charAt(i);
            if ( x >= '0' && x <= '9') {
                if (dotCame) {
                    afterDot  = true;
                } else {
                    beforeDot = true;
                }

                if (eCame) {
                    affterE = true;
                } else {
                    beforeE = true;
                }
                i++;
                continue;
            } else if (x == '.') {
                if (dotCame || eCame) {
                    return false;
                } else if (i == s.length()-1 && i== 0) {
                    return false;
                } else {
                    dotCame = true;
                    i++;
                }
            } else if (x == 'e' || x== 'E') {
                if (eCame) {
                    return false;
                } else {
                    if (i == s.length()-1 || i== 0) {
                        return false;
                    } 
                    
                    eCame = true;
                    if (s.charAt(i+1) == '+' || s.charAt(i+1) == '-'){
                        i += 2;
                    } else {
                        i++;
                    }
                }
            } else {
                return false;
            }
        }
        
        if (dotCame) {
            if (!(beforeDot || afterDot)) {
                return false;
            }
        } 
        if (eCame) {
            if(!(beforeE && affterE)) {
                return false;
            }
        }
        return beforeE;
    }
}