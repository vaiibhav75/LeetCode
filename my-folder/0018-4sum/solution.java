class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0) {
                if (nums[i] == nums[i-1]){
                    continue;
                }
            }
            for (int j = i+1; j < nums.length-2; j++) {
                if (j > i+1) {
                    if (nums[j] == nums[j-1]){
                        continue;
                    }
                }
                int left = j + 1;
                int right = nums.length-1;

                while (right > left) {
                    
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[left];
                    sum += nums[right];
                    
                    if (sum == target) {
                        if ( left < right -1) {
                            if (nums[left] == nums[left + 1]){
                                left++;
                                continue;
                            }
                            if (nums[right] == nums[right - 1]){
                                right--;
                                continue;
                            }
                        }
                        
                        
                        List<Integer> arr = new ArrayList<>(4);
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[left]);
                        arr.add(nums[right]);
                        ans.add(arr);
                        left++;
                        
                        right--;
                        
                        
                        
                    } else if (sum > target) {
                        right--;
                        
                    } else {
                        left++;
                        
                    }
                }
            }
        }
        return ans;
    }
}
