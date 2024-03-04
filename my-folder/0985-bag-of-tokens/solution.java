class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int x = 0;
        int y = tokens.length-1;
        
        int ans = 0;
        int score = 0;
        while (x <= y) {
            while (x < n && power >= tokens[x] && x <= y) {
                power-=tokens[x];
                score++;
                x++;
            }
            if (score == 0) {
                break;
            }
            ans = Math.max(ans,score);
            
            while (y >= 0 && x < n && score > 0 && power < tokens[x] && x <= y ) {
                power += tokens[y];
                y--;
                score--;
            }
        }
        
        return ans;
    }
}
