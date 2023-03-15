class Solution {

    static String multiply(String num1, String num2) {
        if (num2.length() == 1 && num2.charAt(0) == '0') {
            return "0";
        }
        if (num1.length() == 1 && num1.charAt(0) == '0') {
            return "0";
        }
        StringBuilder ans = new StringBuilder(multiplyOne(num1,num2.charAt(0)));
        for (int i = 1; i <num2.length() ; i++) {
            String curr = multiplyOne(num1, num2.charAt(i));
            ans = add(ans, curr);
        }
        return ans.reverse().toString();
    }

    static StringBuilder add (StringBuilder mainString, String toAdd) {
        mainString.insert(0, '0');
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < toAdd.length(); i++) {
            int currans = (toAdd.charAt(i) - '0') + (mainString.charAt(i) - '0') + carry;
            ans.append(currans%10);
            carry = currans/10;
        }
        for (int i = toAdd.length(); i < mainString.length(); i++) {
            int currans = (mainString.charAt(i) - '0') + carry;
            ans.append(currans%10);
            carry = currans/10;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        return ans;
    }

    static String multiplyOne (String num, char c) {
        int divisor = c - '0';
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = num.length()-1; i >= 0 ; i--) {
            int tempAns = ((c-'0') * (num.charAt(i) - '0'))+carry;
            int digAns =(tempAns%10);
            ans.append(digAns);
            carry = tempAns/10;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        
        return ans.toString();
    }
}
