class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        str.append(dig4(num));
        str.append(dig3(num));
        str.append(dig2(num));
        str.append(dig1(num));
        return str.toString();
    }

    static String dig1 (int n) {
        n /= 1;
        n %= 10;

        return switch (n) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    static String dig2 (int n) {
        n /= 10;
        n %= 10;

        return switch (n) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    static String dig3 (int n) {
        n /= 100;
        n %= 10;

        return switch (n) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }

    static String dig4 (int n) {
        n /= 1000;
        n %= 10;

        return switch (n) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
    }
}