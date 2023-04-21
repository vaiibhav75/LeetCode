class Solution {
    public int[] frequencySort(int[] nums) {
        int[] frequency = new int[201];
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            frequency[100+nums[i]] ++;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (frequency[100+nums[j]] > frequency[100+nums[j+1]]) {
                    swap(nums,j);
                } else if (frequency[100+nums[j]] == frequency[100+nums[j+1]]) {
                    if (nums[j] < nums[j+1]) {
                        swap(nums,j);
                    }
                }
            }
        }
        return nums;
        
        
    }
    
    static void swap (int[] a, int i) {
        int t = a[i];
        a[i] = a[i+1];
        a[i+1] = t;
    }
}