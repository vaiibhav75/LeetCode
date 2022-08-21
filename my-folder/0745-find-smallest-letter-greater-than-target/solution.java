class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length-1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length-1;
        
        int mid = (start + (end-start)/2);
        
        while (start <= end) {
            if (letters[mid] > target) {
                end = (mid - 1);
            } else if (letters[mid] < target) {
                start = (mid + 1);
            } else {
                if (letters[mid + 1] > target) {
                    return letters[mid + 1];
                } else {
                    start = mid + 1;
                }
            }
            mid = (start + (end-start)/2);
        }
        return letters[start];
    }
}
