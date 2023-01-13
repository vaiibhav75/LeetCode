class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        if (k >= (nums[nums.length-1]-nums[0])*nums.length) {
            return nums.length;
        }
        int max = 0;
        for (int i = 0; i <nums.length; i++) {
            if (i > 0) {
                if (nums[i] == nums[i-1]){
                    continue;
                }
            }

            max = Math.max(max, filler(nums,i,k));
        }
        return max;

    }

    static int filler(int[] arr, int index, int k) {
        int x = 0;
        if (index < arr.length -1) {
            x = bs(arr, arr[index]) - index;
        } else {
            x = 1;
        }

       int i = 1;
        int l = k;
        while (l >= 0) {
            if (index - i < 0) {
                break;
            }
            if (l >= arr[index]-arr[index-i]) {
                l -= arr[index]-arr[index-i];
                x++;
                i++;
            } else  {
                break;
            }
        }
        return x;
    }

    static int bs (int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;

        while (hi >= lo) {
            int mid  = lo + (hi - lo)/2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }
}