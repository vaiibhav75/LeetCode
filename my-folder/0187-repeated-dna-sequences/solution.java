class Solution {

    //    public static void main(String[] args) {
//        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").toString());
//    }
    static List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() <= 10) {
            return  ans;
        }

        List<Integer> arr = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n <<= 2;
            n |= charToInt(s.charAt(i));
        }
//        System.out.println(Integer.toBinaryString(n));
        arr.add(n);
        for (int i = 10; i < s.length(); i++) {
            n <<= 2;
            n = n & ((1<<20) - 1 );
            n |= charToInt(s.charAt(i));
//            System.out.println(Integer.toBinaryString(n));
            arr.add(n);
        }

        Collections.sort(arr);
//        System.out.println(arr.toString());

        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                if (count > 1) {
//                    System.out.println(arr.get(i-1));
//                    System.out.println(intT0String(arr.get(i-1)));
                    ans.add(intT0String(arr.get(i-1)));
                }
                count = 1;
            }else {
                count++;
            }
        }
        if (count > 1) {
            ans.add(intT0String(arr.get(arr.size()-1)));
        }
        return ans;
    }

    static int charToInt (char c) {
        switch (c) {
            case 'A' :
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;

        }
        return 0;
    }

    static String intT0String (int x) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int n = x & 3;
            ans.append(intToChar(n));
            x >>= 2;
        }


        return ans.reverse().toString();
    }

    static char intToChar (int x) {
        switch (x) {
            case 0 :
                return 'A';
            case 1:
                return 'C';
            case 2:
                return 'G';
            case 3:
                return 'T';

        }
        return 0;
    }
}
