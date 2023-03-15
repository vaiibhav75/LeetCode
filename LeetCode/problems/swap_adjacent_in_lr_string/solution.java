class Solution {
    public boolean canTransform(String start, String end) {
        int i = 0;
        int j = 0;
        char[] a = start.toCharArray();
        char[] b = end.toCharArray();

        while (i < a.length || j < b.length) {
            while (i < a.length && a[i] == 'X') { i++; }
            while (j < b.length && b[j] == 'X') { j++; }

            if (i >= a.length || j>= b.length) { break; }

            if (a[i] != b[j] ) { return false; }
            if (a[i] == 'R' && i > j) {
                return false;
            }
            if (a[i] == 'L' && i < j) {
                return false;
            }
            
            i++;
            j++;

        }
        return i==j;
    }
}