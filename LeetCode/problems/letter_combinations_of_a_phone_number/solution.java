class Solution {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    static List<String> letterCombinations(String digits) {
            List<String> arr = new ArrayList<>();
            if (digits.length() == 0) {
                return arr;
            }
            arr.add("");


            List<String> mapping = new ArrayList<>();
            mapping.add("abc");
            mapping.add("def");
            mapping.add("ghi");
            mapping.add("jkl");
            mapping.add("mno");
            mapping.add("pqrs");
            mapping.add("tuv");
            mapping.add("wxyz");

            int i = 0;

            while (i < digits.length()){
                
                int curr = digits.charAt(i) - '2';
                List<String> ans = new ArrayList<>();
                for (int j = 0; j < arr.size(); j++) {
                    String str = mapping.get(curr);
                    for (int k = 0; k < str.length(); k++) {
                        ans.add(arr.get(j) + str.charAt(k));
                    }
                }
                arr = ans;
                i++;
            }

            return arr;

    }

}