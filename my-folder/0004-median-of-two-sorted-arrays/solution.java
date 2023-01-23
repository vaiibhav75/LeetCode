class Solution {
    
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totLength = nums1.length + nums2.length;

        if (totLength %2 == 0) {
            double answer = 0;
            int median2 = totLength/2;
            int median1 = totLength/2 -1;
            ArrayList<Integer> arr = new ArrayList<>();

            int lo = 0;
            int hi = nums1.length-1;

            while (hi >= lo) {

                int mid = lo + (hi - lo)/2;
                int position = posFinder(nums2, nums1[mid]) + mid;
                if ( position == median1 || position == median2) {
                    arr.add(nums1[mid]);
                    if (position == median1){
                        lo = mid+1;
                    } else {
                        hi = mid-1;
                    }

                } else if (position > median2) {
                    hi = mid-1;
                } else if (position < median1) {
                    lo = mid + 1;
                }
            }
            if (arr.size() == 2) {
                answer = (arr.get(0) + arr.get(1));
                answer = answer/2;
                return answer;
            }
            lo = 0;
            hi = nums2.length-1;
            while (hi >= lo) {
                int mid = lo + (hi - lo)/2;
                int position = posFinder2(nums1, nums2[mid]) + mid;
                if ( position == median1 || position == median2) {
                    arr.add(nums2[mid]);
                    if (position == median1){
                        lo = mid+1;
                    } else {
                        hi = mid-1;
                    }
                } else if (position > median2) {
                    hi = mid-1;
                } else if (position < median1) {
                    lo = mid + 1;
                }
            }

            answer = (arr.get(0) + arr.get(1));
            answer = answer/2;
            return answer;
        } else {
            int median = totLength/2;
            int lo = 0;
            int hi = nums1.length-1;
            while (hi >= lo) {
                int mid = lo + (hi - lo)/2;
                int position = posFinder(nums2, nums1[mid]) + mid;
                if ( position == median) {
                    return (double) nums1[mid];
                } else if (position > median) {
                    hi = mid-1;
                } else {
                    lo = mid + 1;
                }
            }

            lo = 0;
            hi = nums2.length-1;
            while (hi >= lo) {
                int mid = lo + (hi - lo)/2;
                int position = posFinder2(nums1, nums2[mid]) + mid;
                if ( position == median) {
                    return (double) nums2[mid];
                } else if (position > median) {
                    hi = mid-1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return 0;
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
        if (target < arr[lo]) {
            return 0;
        }

        while (hi >= lo) {
            int mid = (lo + hi) / 2;

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
        if (target > arr[hi]) {
            return hi + 1;
        }

        while (hi >= lo) {
            int mid = (lo + hi) / 2;

            if (target <= arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return hi+1;
    }

}


