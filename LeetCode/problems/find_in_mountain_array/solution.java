class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        if (mountainArr.get(peak) < target) {
            return -1;
        }
        System.out.println("peak is " + peak);
        int val = binarySearch(mountainArr, 0, peak,target);
        if (val == -1) {
            System.out.println("not found in 1");
            System.out.println(mountainArr.length()-1);
            return binarySearch2(mountainArr, peak, mountainArr.length()-1, target);
        } else {
            return val;
        }

    }

    static int binarySearch(MountainArray arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr.get(mid) == x)
                return mid;

            if (arr.get(mid) > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    static int binarySearch2(MountainArray arr, int l, int r, int x)
    {   if (arr.get(r) == x) {
        return r;
    }
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr.get(mid) == x)
                return mid;

            if (arr.get(mid) < x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public int peakIndexInMountainArray(MountainArray arr) {
        int start = 1;
        int end = arr.length()-2;
        int mid = start + (end - start)/2;

        while (start <= end) {
            if (arr.get(mid) > arr.get(mid-1) && arr.get(mid) < arr.get(mid+1)) {
                start = mid +1;
            } else if (arr.get(mid) < arr.get(mid-1) && arr.get(mid) > arr.get(mid+1)) {
                end = mid -1;
            } else {
                return mid;
            }
            mid = start + (end - start)/2;
        }
        return mid;
    }
}