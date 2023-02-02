class Solution {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;

        for (int k = 0; k < moves.length(); k++) {
            switch (moves.charAt(k)) {
                case 'U' -> j++;
                case 'D' -> j--;
                case 'L' -> i--;
                case 'R' -> i++;
                default -> {
                }
            }
        }
        return (i==0 && j==0);
    }
}
