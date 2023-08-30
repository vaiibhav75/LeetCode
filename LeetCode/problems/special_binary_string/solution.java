class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.makeLargestSpecial("11011000"));
    }
    public String makeLargestSpecial(String s) {
        if (s.length() <= 2) {
            return s;
        }



        int x = 0;


        ArrayList<String> values = new ArrayList<>();
        while (x < s.length()) {
            int zeros = 0;
            int ones = 0;


            int start = x;
            while (start < s.length()) {
                if (s.charAt(start) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
                start++;
                if (zeros == ones) {
                    break;
                }
            }

            if (start - x == s.length()) {
                return 1 + makeLargestSpecial(s.substring(1,s.length()-1)) + 0;
            }
            values.add(makeLargestSpecial(s.substring(x,start)));

            x = start;
        }

        values.sort(Collections.reverseOrder());

        StringBuilder ans = new StringBuilder();

        for (int k = 0; k < values.size(); k++) {
            ans.append(values.get(k));
        }

        return ans.toString();
    }
}