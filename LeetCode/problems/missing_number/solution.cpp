class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int index = 0;
        for (int i = 0; i <nums.size() ; i++) {
            while (nums[i] != i) {
                if(nums[i] == nums.size()) {
                    index = i;
                    break;
                }
                swap(nums, i, nums[i]);

            }

        }
        if (nums[index] == index) {
            return nums.size();
        }
        return index;
    }

    void swap (vector<int>& nums , int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};