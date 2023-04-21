class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ranked = arr.clone();
        Arrays.sort(ranked);
        int currRankl = 0;
        int currValue = Integer.MIN_VALUE;
        int[] ranks = new int[arr.length];

        for (int i = 0; i < ranked.length; i++) {
            if(ranked[i] == Integer.MIN_VALUE) {
                currRankl = 1;
                ranks[i] = currRankl;
                continue;
            }
            
            if (ranked[i] > currValue) {
                currRankl++;
                currValue = ranked[i];
            }
            
            ranks[i] = currRankl;
        }

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int r = bs(ranked,target);
            arr[i] = ranks[r];
        }
        return arr;
        
    }
    
    static int bs (int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        
        
        
        while (hi >= lo) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return -1;
    }
}