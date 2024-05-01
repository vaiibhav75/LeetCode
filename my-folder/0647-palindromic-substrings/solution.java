class Solution {
    public int countSubstrings(String s) {
        return solve(s);
    }

    static int solve (String s) {
        int n = s.length();
        long ans = n;
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];
        Arrays.fill(odd, true);

        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                even[i] = true;
                ans++;
            }
        }

        for (int i = 3; i <= n; i+= 2) {
            for (int j = 0; j <= n - i ; j++) {
                if (s.charAt(j) == s.charAt(j+i-1) && odd[j+1]) {
                    odd[j] = true;
                    ans++;
                } else {
                    odd[j] = false;
                }
            }
        }

        for (int i = 4; i <= n; i+= 2) {
            for (int j = 0; j <= n - i ; j++) {
                if (s.charAt(j) == s.charAt(j+i-1) && even[j+1]) {
                    even[j] = true;
                    ans++;
                } else {
                    even[j] = false;
                }
            }
        }
        
        return (int) ans;
        
        
    }
}
