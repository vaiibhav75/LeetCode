class Solution {

    public static void main(String[] args) {
        List<String> ans = new Solution().findAllConcatenatedWordsInADict(new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"});
        for (String s : ans) {
            System.out.println(s);
        }
    }

    static HashSet<String> map;
    static HashMap<String,Boolean> mapping;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        map = new HashSet<>();
        Collections.addAll(map, words);
        List<String> ans = new ArrayList<>();
        mapping = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.remove(words[i]);
            if (concat(words[i])) {
                ans.add(words[i]);
            }
            mapping.put(words[i],true);
            map.add(words[i]);
        }

        return ans;



    }

    static boolean concat (String s) {

        if (mapping.containsKey(s)) {
            return mapping.get(s);
        }
        if (map.contains(s)) {
           
            return true;
        }

        for (int i = 0; i < s.length()-1; i++) {
            if (map.contains(s.substring(0,i+1))) {
                if (concat(s.substring(i+1))) {
                    mapping.put(s,true);
                    return true;
                }
            }
        }
        mapping.put(s,false);
        return false;
    }
}