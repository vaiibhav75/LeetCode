class Solution {

    public boolean canReach(String s, int minJump, int maxJump) {
        boolean[] arr = new boolean[s.length()];
        if (s.charAt(s.length() - 1) == '1') {
            return false;
        }
        arr[0] = true;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] && s.charAt(i) == '0') {
                start = Math.max (i + minJump, end +1);
                end = Math.min(i + maxJump, s.length() - 1);
                for (int j = start; j <= end ; j++) {
                    arr[j] = true;
                }
            }
        }
        return arr[arr.length-1];
    }
}