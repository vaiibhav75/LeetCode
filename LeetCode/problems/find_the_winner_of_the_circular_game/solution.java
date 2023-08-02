class Solution {

    
    public int findTheWinner(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(i+1);
        }
        int prev = 0;
        while (ans.size() > 1) {
            int x = (prev + k);
            ans.remove((x-1)%n);
            prev = (x-1)%n;
            n--;
            
        }

        return ans.get(0);
    }
}