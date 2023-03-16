class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int k = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            ans.add(camelCheck(queries[i],pattern ));
        }
        return ans;
    }
    
    static boolean camelCheck (String query, String pattern) {
        int k = 0;

        for (int i = 0; i < query.length(); i++) {
            if (k < pattern.length() && pattern.charAt(k) == query.charAt(i)) {
                k++;
            } else {
                if (query.charAt(i) >= 'A' && query.charAt(i) <= 'Z') {
                    return false;
                }
            }
        }
        return k == pattern.length();
    }
}


