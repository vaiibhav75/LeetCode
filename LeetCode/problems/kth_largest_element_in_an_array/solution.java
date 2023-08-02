class Solution {

    public int findKthLargest(int[] nums, int k) {
        sort(nums,0,nums.length-1, nums.length-k);
        return nums[nums.length - k];
    }



    static void sort (int[] arr, int i, int j, int target) {
        if (i >= j) {
            return;
        }
        int anchor = i;
        int x = i+1;
        int y = j;

        while (x <= y) {
            while (x <= j && arr[x] <= arr[anchor] ) {
                x++;
            }

            while ( y >= i && arr[y] > arr[anchor] ) {
                y--;
            }

            if (x <= y) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            } else {
                break;
            }
        }

        int temp = arr[anchor];
        arr[anchor] = arr[y];
        arr[y] = temp;
 
        if (y < target) {
            sort(arr,y+1,j,target);
        } else if (y > target) {
            sort(arr,i,y-1,target);
        } else {
            return;
        }

    }


}