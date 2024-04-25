class Structure {
    StringBuilder s;
    long start;
    long end;
}

class Solution {
    public String decodeAtIndex(String s, int k) {
        Stack<Structure> list = new Stack<>();
        char[] sc = s.toCharArray();
        int n = s.length();
        int i = 0;

        long pev = 0;


        while (i < n) {
            Structure str = new Structure();
            str.s = new StringBuilder();
            str.start = pev+1;
            
            while (i < n && Character.isLetter(sc[i])) str.s.append(sc[i++]);
            
            pev += str.s.length();
            str.end = pev;
            
            while (i < n && Character.isDigit(sc[i])) pev *= sc[i++] - '0';
            
            list.push(str);
            if (pev >= k) break;
        }

        return String.valueOf(solve(list, k));
    }

    static char solve (Stack<Structure> arr, long k) {
        Structure str = arr.pop();
        k%=str.end;
        if (k == 0) k = str.end;

        if (k < str.start) {
            return solve(arr, k);
        } else {
            return str.s.charAt((int) (k - str.start));
        }
    }
}
