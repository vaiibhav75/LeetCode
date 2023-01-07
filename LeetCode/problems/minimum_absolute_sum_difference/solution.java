class Solution {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long maxSum = 0;
        long maxDiffCreated = 0;

        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < nums1.length; i++) {
            long diff = Math.abs(nums1[i] - nums2[i]);
            maxSum += diff;

            long num = binarySearch(arr, nums2[i]);
            long newDiff = Math.abs(num - nums2[i]);
            long diffCreated = Math.abs(diff - newDiff);
            maxDiffCreated = Math.max(maxDiffCreated, diffCreated);


        }
        System.out.println(maxSum);
        System.out.println(maxDiffCreated);
        System.out.println(maxSum - maxDiffCreated);
        System.out.println((maxSum - maxDiffCreated)%1000000007);
        long ans = (maxSum - maxDiffCreated)%1000000007;
        return (int) ans;




    }

    static int binarySearch (int[] arr, int x) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end <= 0) {
            end = 0;
        }
        if (start >= arr.length -1) {
            start = arr.length-1;
        }
        if (Math.abs(x-arr[end]) < Math.abs(x- arr[start])){
            return arr[end];
        } else {
            return arr[start];
        }
    }
}


