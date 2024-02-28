class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        List <String> ans = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return ans;
        }
        
        if (contains(s,wordDict)) {
            ans.add(s);
        }

        for (int i = 0; i < s.length()-1; i++) {
            String x = s.substring(0,i+1);
            if (contains(x,wordDict)){
                List<String> extracted = wordBreak(s.substring(i+1),wordDict);

                for (int j = 0; j < extracted.size(); j++) {
                    StringBuilder insert = new StringBuilder(x);
                    insert.append(" ");
                    insert.append(extracted.get(j));
                    ans.add(insert.toString());
                }
                
            }
        }
        
        return ans;
    }
    
    static boolean contains (String s, List<String> wordDict) {
        for (String X:
             wordDict) {
            
            if (X.equals(s)){
                return true;
            }
            
        }
        return false;
    }
    
    
    
}
