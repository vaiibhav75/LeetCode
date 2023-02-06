class Solution {

//    public static void main(String[] args) {
//        System.out.println(nextGreaterElement(230241));
//    }
    static int nextGreaterElement(int n) {


        String s = Integer.toString(n);
        StringBuilder str = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            str.append(s.charAt(k));
        }

        int i = breakFinder(s);
        if (i == -1) {
            return -1;
        }
        int j = smallFinder(s,i);


        swap(str,i , j);
        sort(str, i + 1);


        long ans = 0;
        for (int k = 0; k < str.length(); k++) {
            long val = str.charAt(k) - '0';
            ans = ans*10 + val;
        }

        if (ans <= Integer.MAX_VALUE) {
            return (int) ans;
        } else {
            return -1;
        }






    }

    static int breakFinder (String s) {
        int i = s.length()-1;
        while ( i > 0) {

            if (s.charAt(i) > s.charAt(i-1)) {
                return i-1;
            }
            i--;
        }
        return -1;
    }

    static int smallFinder (String s, int i) {
        int j = s.length()-1;
        while ( j > i ) {
            if (s.charAt(j) > s.charAt(i)) {
                return j;
            }
            j--;
        }
        return -1;
    }


    static void sort (StringBuilder s, int x) {
        for (int i = x; i < s.length(); i++) {
            for (int j = x; j < s.length()-1; j++) {
                if (s.charAt(j) > s.charAt(j + 1)) {
                    swap(s, j , j + 1);
                }
            }
        }
    }

    static void swap (StringBuilder s , int i , int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
}
