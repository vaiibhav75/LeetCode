class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        long[] prefix = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i-1]+nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]-k)) {
                int index = map.get(nums[i]-k);
                long val = prefix[i]-prefix[index]+nums[index];
                max = Math.max(max,val);
            }
            
            if (map.containsKey(nums[i]+k)) {
                int index = map.get(nums[i]+k);
                long val = prefix[i]-prefix[index]+nums[index];
                max = Math.max(max,val);
            }
            

            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                long val = prefix[i]-prefix[index]+nums[index]-nums[i];
                if (val < 0) {
                    map.put(nums[i],i);
                }
            } else {
                map.put(nums[i],i);
            }
        }
        if (max == Long.MIN_VALUE) {
            return 0;
        }
        return max;
    }
}