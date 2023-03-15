class Solution {

    public int equalSubstring(String s, String t, int maxCost) {
        int[] cost = new int[s.length()];
        for (int i = 0; i < t.length(); i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int lo = 0;
        int hi = s.length();

        while (lo <= hi) {
            int mid = lo + ((hi-lo)/2);
            int midcost = minCost(cost,mid);

            if (midcost <= maxCost) {
                lo = mid + 1;
            } else {
                hi = mid-1;
            }
        }
        return hi;
    }

    static int minCost (int[] arr, int length) {
        int cost = 0;
        for (int i = 0; i < length; i++) {
            cost+= arr[i];
        }
        int minCost = cost;
        for (int i = length; i < arr.length ; i++) {
            cost += arr[i];
            cost -= arr[i-length];
            minCost = Math.min(cost,minCost);
        }
        return minCost;
    }


}