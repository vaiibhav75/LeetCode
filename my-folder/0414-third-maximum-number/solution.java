class Solution {
   
    static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0],nums[1] );
        }
        int count = 3;
        for (int i = 0; i <count ; i++) {
            if (count > nums.length) {
                return nums[0];
            }



            int max = i;
            for (int j = i + 1; j <nums.length ; j++) {
                if (nums[j] > nums[max] ){
                    max = j;
                }
            }
            swap(nums,max,i);
            if (i > 0 && nums[i] == nums[i-1]) {
                count++;
            }
        }
        return nums[count-1];
    }

    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
