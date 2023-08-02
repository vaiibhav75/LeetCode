class Solution {

    public static void main(String[] args) {
        int[] arr = {1,5,2};
        System.out.println(new Solution().predictTheWinner(arr));
    }
    public boolean predictTheWinner(int[] nums) {
        return solve(nums,0, nums.length-1,0,0,true);
    }


    static boolean solve (int[] nums, int i, int j,int p1Value, int p2Value, boolean p1Turn) {
        if (j < i) {
            return p1Value >= p2Value;
        }

        if (p1Turn) {
            return (solve(nums,i+1,j,p1Value + nums[i],p2Value,false) || solve(nums,i,j-1,p1Value + nums[j],p2Value,false) );
        } else {
            return (solve(nums,i+1,j,p1Value,p2Value + nums[i],true) && solve(nums,i,j-1,p1Value,p2Value + nums[j],true) );

        }
    }


}