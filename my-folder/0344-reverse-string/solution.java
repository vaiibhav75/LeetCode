class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        swap (s, i, j);
    }
    
    static void swap(char[] s, int i , int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
        if (i < j) {
            swap (s, i, j);
        }
    }
}

