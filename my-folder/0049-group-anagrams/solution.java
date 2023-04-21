class Solution {


    static List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted = strs.clone();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = sorted[i].toCharArray();
            Arrays.sort(arr);
            sorted[i] = String.valueOf(arr);
        }
        List<String> strList = new ArrayList<>(Arrays.asList(strs));
        List<String> sortedList = new ArrayList<>(Arrays.asList(sorted));
        List<List<String>> ans = new ArrayList<>();

        while (strList.size() > 0) {
            List<String> toADD = new ArrayList<>();
            toADD.add(strList.get(0));
            String curr = sortedList.get(0);
            strList.remove(0);
            sortedList.remove(0);
            for (int i = 0; i < strList.size(); i++) {
                if (sortedList.get(i).equals(curr)) {
                    toADD.add(strList.get(i));

                    strList.remove(i);
                    sortedList.remove(i);
                    i--;
                }
            }

            ans.add(toADD);
        }
        return ans;
    }
}
