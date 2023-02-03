class Solution {
    public int romanToInt(String s) {
        char prevChar = 0;
        int ans = 0;
        char thisChar = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            thisChar = s.charAt(i);
            switch (thisChar) {
                case 'I' -> {
                    if (prevChar == 'V' || prevChar == 'X') {
                        ans -= 1;
                    } else {
                        ans += 1;
                    }
                }
                case 'X' -> {
                    if (prevChar == 'L' || prevChar == 'C') {
                        ans -= 10;
                    } else {
                        ans += 10;
                    }
                }
                case 'C' -> {
                    if (prevChar == 'D' || prevChar == 'M') {
                        ans -= 100;
                    } else {
                        ans += 100;
                    }
                }
                case 'V' -> ans += 5;
                case 'L' -> ans += 50;
                case 'D' -> ans += 500;
                case 'M' -> ans += 1000;
                default -> {
                }
            }
            prevChar = thisChar;
        }
        return ans;
    }
}