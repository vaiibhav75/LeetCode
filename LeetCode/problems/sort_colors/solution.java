class Solution {
    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0 -> a++;
                case 1 -> b++;
                case 2 -> c++;
            }
        }
        for (int i = 0; i < a; i++) {
            nums[i]=0;
        }
        for (int i = a; i <a+b ; i++) {
            nums[i]=1;
        }
        for (int i = a+b; i < a+b+c ; i++) {
            nums[i]=2;
        }
    }
}