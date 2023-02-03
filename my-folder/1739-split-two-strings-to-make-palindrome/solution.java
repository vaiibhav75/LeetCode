class Solution {
    
    public boolean checkPalindromeFormation(String a, String b) {
        return (twistedPalindrome(a,b) || twistedPalindrome(b,a));
    }
    static boolean twistedPalindrome (String a, String b) {
       
        int i = 0;
        int j = a.length() - 1;
        while (i <= j) {

            if (a.charAt(i) != b.charAt(j)) {
                return (simplePalindrome(a,i,j) || simplePalindrome(b,i,j));
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    static boolean simplePalindrome(String ans, int i, int j) {
        while (i <= j) {
            if (ans.charAt(i) != ans.charAt(j)){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
