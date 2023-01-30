class Solution {
    public boolean halvesAreAlike(String s) {
        int con1 = 0;
        int vol1 = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == 'a'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'e'|| s.charAt(i) == 'u'|| s.charAt(i) == 'A'|| s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U'){
                vol1 ++;
            } else {
                con1++;
            }
        }
        int con2 = 0;
        int vol2 = 0;
        for (int i = s.length()-1; i >= s.length()/2; i--) {
            if (s.charAt(i) == 'a'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'e'|| s.charAt(i) == 'u'|| s.charAt(i) == 'A'|| s.charAt(i) == 'E'|| s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U'){
                vol2 ++;
            } else {
                con2++;
            }
        }
        
        return (con2==con1 && vol2==vol1);
    }
}
