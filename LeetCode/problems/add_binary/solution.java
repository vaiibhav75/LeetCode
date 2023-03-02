class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder ans  = new StringBuilder();
        for (int i = 0; i < Math.max(a.length(),b.length()) ; i++) {
            int num1 = 0;
            int num2 = 0;
            int j = a.length() - i -1;
            if (j < a.length() && j >= 0) {
                num1 = a.charAt(j) - '0';
            } else {
                num1 = 0;
            }
            j = b.length() - i -1;
            if (j < b.length() && j >= 0) {
                num2 = b.charAt(j) - '0';
            } else {
                num2 = 0;
            }
            
            int num3 = num1 + num2 + carry;
            
            
            ans.append(num3%2);
            carry = num3/2;
            
        }
        if (carry != 0) {
            ans.append(carry);
        }
        
        return ans.reverse().toString();
    }
}