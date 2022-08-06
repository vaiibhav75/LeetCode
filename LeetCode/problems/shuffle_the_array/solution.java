class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if (i%2==0) {
                arr[i] = nums[i/2];
            }else {
                arr[i] = nums[ n + i/2];
            }
        }
        return arr;
    }
}