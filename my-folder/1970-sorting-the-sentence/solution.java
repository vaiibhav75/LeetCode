class Solution {
     public String sortSentence(String s) {
        StringBuilder myString = new StringBuilder();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 57 && s.charAt(i) >= 49) {
                max = Math.max(max, ((int)s.charAt(i))-48 );
            }
        }
        String[] arr = new String[max];
        StringBuilder word = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {

            if (s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                word.append(s.charAt(i));
            } else if (s.charAt(i) <= 122 && s.charAt(i) >= 97) {
                word.append(s.charAt(i));
            } else if (s.charAt(i) <= 57 && s.charAt(i) >= 49){
                arr[((int)s.charAt(i)) - 49] = word.toString();
                word.setLength(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            myString.append(arr[i] + " ");
        }
        return myString.toString().stripTrailing();
    }
}
