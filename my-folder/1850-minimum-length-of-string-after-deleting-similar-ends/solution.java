class Solution {
    
    public int minimumLength(String s) {
        char[] ans =  s.toCharArray();
        int left = 0;
        int right = ans.length-1;
        int length = ans.length;
        while (length > 1 && ans[left] == ans[right]) {
            char x = ans[left];
            while (length > 0 && ans[left] == x) {
                left++;
                length--;
            }
            while (length > 0 && ans[right] == x) {
                right--;
                length--;
            }
        }
        return length;
    }
}
