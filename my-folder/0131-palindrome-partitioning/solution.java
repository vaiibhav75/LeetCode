import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<>();
        List<String> currentList = new ArrayList<>();
        int val = 1 << n-1;
        outer: for (int i = 0; i < val; i++) {
            int breaks = i;
            int prev = 0;
            currentList.clear();

            for (int j = 1; j < n; j++) {
                if ((breaks & 1) == 1) {
                    if (isPalindrome(s, prev, j-1)) {
                        currentList.add(s.substring(prev, j));
                    } else {
                        continue outer;
                    }
                    prev = j;
                }
                breaks >>= 1;
            }

            if (isPalindrome(s,prev,n-1)) {
                currentList.add(s.substring(prev));
            } else {
                continue outer;
            }

            
            result.add(new ArrayList<>(currentList));
            
        }

        return result;
    }


    private boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

