class Solution {
    
    public int maximumRemovals(String s, String p, int[] removable) {

        int lo = 0;
        int hi = removable.length;
        while (hi >= lo) {
            int mid = lo + (hi-lo)/2;
            StringBuilder k = new StringBuilder(s);
            for (int j = 0; j < mid; j++) {
                k.setCharAt(removable[j],'$');
            }
            if (isSubstring(k,p)) {
                lo = mid +1;
            } else {
                hi = mid -1;
            }
        }

        return hi;
    }

    static boolean isSubstring (StringBuilder p, String s) {
        int k = 0;
        for (int i = 0; i < p.length(); i++) {

            if (p.charAt(i)== s.charAt(k)) {
                k++;
            }
            if (k== s.length()){
                return true;
            }

        }
        return false;
    }
}
