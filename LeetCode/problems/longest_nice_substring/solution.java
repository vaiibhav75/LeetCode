class Solution {
    public String longestNiceSubstring(String s) {
        for (int i = s.length()-1; i >= 0 ; i--) {
            for (int j = 0; j <= s.length()-1 -i; j++) {
                String substr = s.substring(j, i+j+1);
                // System.out.println(substr);
                if (isnice(substr)) {
                    return substr;
                }
            }
        }
        return "";
    }

    static boolean isnice (String k) {
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) <= 'Z' && k.charAt(i) >= 'A') {
                uppercase |= 1 << k.charAt(i) - 'A';
            } else {
                lowercase |= 1 << k.charAt(i) - 'a';
            }
        }
        // System.out.println(Integer.toBinaryString(uppercase));
        // System.out.println(Integer.toBinaryString(lowercase));
        return (uppercase ^ lowercase) == 0;
    }
}