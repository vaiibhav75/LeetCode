class Solution {
    public boolean isValid(String s) {
        char firstOpen = 0;
        char secondOpen = 0;
        char thirdOpen = 0;
        boolean b1Open = false;
        boolean b2Open = false;
        boolean b3Open = false;

        StringBuilder ans = new StringBuilder();

        char currBrac = 0;
        for (int i = 0; i < s.length() ; i++) {
            currBrac = s.charAt(i);
            switch (currBrac) {
                case '(', '{', '[' -> {
                    ans.append(currBrac);
                }
                case ')'-> {
                    if (ans.length() == 0) {
                        return false;
                    }
                    char last = ans.charAt(ans.length()-1);
                    if (last == '('){
                        ans.deleteCharAt(ans.length()-1);
                    } else {
                        return false;
                    }
                }
                case  '}'-> {
                    if (ans.length() == 0) {
                        return false;
                    }
                    char last = ans.charAt(ans.length()-1);
                    if (last == '{'){
                        ans.deleteCharAt(ans.length()-1);
                    } else {
                        return false;
                    }
                }
                case  ']'-> {
                    if (ans.length() == 0) {
                        return false;
                    }
                    char last = ans.charAt(ans.length()-1);
                    if (last == '['){
                        ans.deleteCharAt(ans.length()-1);
                    } else {
                        return false;
                    }
                }

            }
        }
        return (ans.length() == 0);
    }
}