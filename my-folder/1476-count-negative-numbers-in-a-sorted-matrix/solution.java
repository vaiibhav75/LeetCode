class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;

        for (int[] arr:grid) {
            if (arr[arr.length-1] < 0){
                int start = 0;
                int end = arr.length-1;
                int mid = start + (end-start)/2;

                while (start <= end) {
                    if(arr[mid] > 0) {
                        start = mid + 1;
                    } else if (arr[mid] < 0) {
                        end = mid-1;
                    } else {
                        if (arr[mid+1] < 0) {
                            end = mid;
                            break;
                        }else {
                            start = mid +1;
                        }
                    }
                    mid = start + (end-start)/2;
                }
                ans = ans + (arr.length-1-end); 
            }
            
            
        }
        
        return ans;
    }
}
