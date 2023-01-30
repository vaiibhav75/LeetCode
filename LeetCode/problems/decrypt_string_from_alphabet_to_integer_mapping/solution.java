class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int i = s.length()-1;
        while ( i >=0) {
            if (s.charAt(i) == 35) {
                int num = (int) s.charAt(i-1)- 48;
                num += ((int)s.charAt(i-2)-48)*10;
                num+= 96;
                str.append((char) num);
                i-= 3;
            } else {
                int num = (int) s.charAt(i)- 48;
                
                num+= 96;
                str.append((char) num);
                i--;
            }
        }
        return str.reverse().toString();
    }
}