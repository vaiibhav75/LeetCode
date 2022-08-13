class Solution {
    public void rotate(int[] nums, int k) {
        int x = k% nums.length;
        if (x > 0) {
            int[] arr = new int[x];
            int pos = x-1;
            for (int i = nums.length-1; i > nums.length-x-1 ; i--) {
                arr[pos]= nums[i];
                pos--;
            }
            for (int i = nums.length-1; i >= x; i--) {
                nums[i]=nums[i-x];
            }
            for (int i = 0; i < x; i++) {
                nums[i]= arr[i];
            }
        }
        



    }
}
