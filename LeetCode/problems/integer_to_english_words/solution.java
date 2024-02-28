class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] thousands = {"", "Thousand", "Million", "Billion"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num % 1000 != 0) {
                sb.insert(0, helper(num % 1000, ones, teens, tens) + thousands[i] + " ");
            }
            num /= 1000;
            i++;
        }
        return sb.toString().trim();
    }
    
    private String helper(int num, String[] ones, String[] teens, String[] tens) {
        StringBuilder sb = new StringBuilder();
        if (num >= 100) {
            sb.append(ones[num / 100]).append(" Hundred ");
            num %= 100;
        }
        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        }
        if (num >= 10) {
            sb.append(teens[num - 10]).append(" ");
            return sb.toString();
        }
        if (num > 0) {
            sb.append(ones[num]).append(" ");
        }
        return sb.toString();
    }
}