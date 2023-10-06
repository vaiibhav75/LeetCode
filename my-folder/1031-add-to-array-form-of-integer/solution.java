class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int x = num.length-1;
        int carry = k;
        while (x >= 0 && carry > 0) {
            int sum = carry + num[x];
            num[x] =  sum % 10;
            carry = sum / 10;
            x--;

        }
        List<Integer> num2 = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            num2.add(num[i]);
        }

        if (carry > 0) {
            while (carry > 0) {
                num2.add(0, carry % 10);
                carry /= 10;
            }
        }


        return num2;
    }
}
