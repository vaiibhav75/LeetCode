class Solution {
    public int maxRepeating(String sequence, String word) {
        int start = 0;
        int end = sequence.length()/word.length();
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            boolean exists = sequence.contains(maker(word,mid));
            if (exists){
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return end;
    }
    
    static String maker (String s, int x) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < x; i++) {
            ans.append(s);
        }
        return ans.toString();
    }
}
