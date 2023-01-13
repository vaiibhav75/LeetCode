class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totLength = nums1.length + nums2.length;
        double answer = 0;
        if (totLength %2 == 0) {
            int median2 = totLength/2;
            int num1 = 0;
            int median1 = totLength/2 -1;
            int num2 = 0;
            
            for (int i = 0; i < nums1.length; i++) {
                int position = posFinder(nums2, nums1[i]) + i;
                if ( position == median1) {
                    num1 = nums1[i];
                } else if (position == median2) {
                    num2 = nums1[i];

                } else if (position > median2) {
                    break;
                }
            }
            for (int i = 0; i < nums2.length; i++) {
                int position = posFinder2(nums1, nums2[i]) + i;
                if ( position == median1) {
                    num1 = nums2[i];
                } else if (position == median2) {
                    num2 = nums2[i];

                } else if (position > median2) {
                    break;
                }
            }

            answer = (num1 + num2);
            answer = answer/2;
        } else {
            int median = totLength/2;
            for (int i = 0; i < nums1.length; i++) {
                int position = posFinder(nums2, nums1[i]) + i;
                System.out.println();
                if ( position == median) {
                    answer = nums1[i];
                    return answer;
                } else if (position > median) {
                    break;
                }
            }

            for (int i = 0; i < nums2.length; i++) {
                int position = posFinder2(nums1, nums2[i]) + i;
                if ( position == median) {
                    answer = nums2[i];
                    return answer;
                } else if (position > median) {
                    break;
                }
            }
        }
        return answer;
    }

    static int posFinder (int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi =arr.length-1;
        if (target > arr[hi]) {
            return hi + 1;
        }

        while (hi >= lo) {
            int mid = (lo + hi) / 2;
            // if (arr[mid] == target) {
            //     System.out.println("mid is " + mid);
            //     return mid;

            // } 
            if (target < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    static int posFinder2 (int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi =arr.length-1;
        if (target < arr[lo]) {
            return 0;
        }

        while (hi >= lo) {
            int mid = (lo + hi) / 2;
            // if (arr[mid] == target) {
            //     System.out.println("mid is " + mid);
            //     return mid;

            // } 
            if (target <= arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return hi+1;
    }
}

    
