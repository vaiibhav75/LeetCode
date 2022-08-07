class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a = 0;
        if (ruleKey.equals("type")) {
            a = 0;
        } else if (ruleKey.equals("color")) {
            a = 1;
        } else if (ruleKey.equals("name")) {
            a = 2;
        }
        int b = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(a))){
                b++;
            }
        }
        return b;
    }
}
