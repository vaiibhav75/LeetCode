import java.util.Arrays;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[105];
        Arrays.sort(nums);
        int prev = -1;
        int count = 0;
        for (int x : nums) {
            if (x == prev) {
                count++;
            } else {
                arr[count]++;
                count = 1;
                prev = x;
            }
        }
        arr[count]++;
        for (int i = 100; i >= 0 ; i--) {
            if (arr[i] > 0) {
                return arr[i]*i;
            }
        }
        
        return 0;
    }
}
