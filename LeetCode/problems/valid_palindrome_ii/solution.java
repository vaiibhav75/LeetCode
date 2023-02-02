class Solution {

    // public static void main(String[] args) {
    //     System.out.println(validPalindrome("aba"));
    // }
    static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }  else {
                boolean val1= checkPalindrome(s,i+1,j);
                boolean val2= checkPalindrome(s,i,j-1);
                return (val1 || val2);
            }
        }
        return true;
    }

    static boolean checkPalindrome (String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }  else {
                return false;
            }
        }
        return true;

    }
}