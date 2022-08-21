class Solution {
    
    public int findKthPositive(int[] arr, int k) {
        if (missingNumbers(arr[0], 0) >= k) {
            return k ;
        }
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;

        while (start <= end) {
            if ( missingNumbers(arr[mid],mid) > k) {
                end = mid - 1;
            } else if ( missingNumbers(arr[mid],mid) < k) {
                start = mid  + 1;
            } else {
                if (arr[mid-1] + 1 == arr[mid]){
                    end = mid -1;
                } else {
                    return arr[mid]-1;
                }
            }
            mid = start + (end - start)/2;
        }
        return arr[end] + (k - missingNumbers(arr[end],end));
    }
    static int missingNumbers(int num, int index) {
        return num - index - 1 ;
    }
}