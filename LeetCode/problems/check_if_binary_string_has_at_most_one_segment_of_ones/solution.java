class Solution {


    public boolean checkOnesSegment(String s) {
        boolean contOccured = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (contOccured) {
                    return false;
                }
            } else {
                contOccured = true;
            }

        }
        return true;
    }
}