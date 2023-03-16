class Solution {
    public List<String> printVertically(String s) {
        int maxLength = 0;
        List<String> arr =new ArrayList<>();
        StringBuilder k = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                arr.add(k.toString());
                maxLength = Math.max(maxLength, k.length());
                k.setLength(0);
            } else {
                k.append(s.charAt(i));
            }
        }
        arr.add(k.toString());
        maxLength = Math.max(maxLength, k.length());


        List<String> ans =new ArrayList<>();

        for (int i = 0; i < maxLength; i++) {
            StringBuilder val = new StringBuilder();
            for (int j = 0; j < arr.size(); j++) {
                if (i < arr.get(j).length()) {
                    val.append(arr.get(j).charAt(i));
                } else {
                    val.append(" ");
                }
            }
            
            ans.add(val.toString().stripTrailing());
        }
        return ans;



    }
}
