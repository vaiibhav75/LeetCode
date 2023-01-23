class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            myString.append(arr[i]);
        }
        return myString.toString();
        
    }
}
