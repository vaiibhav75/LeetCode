class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int num: nums) arr.add(num);
        Collections.sort(arr);

        for (int i = 0; i < nums.length; i++) {
            int index = bs(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }
        return ans;


    }

    static int bs (ArrayList<Integer> arr, int num) {
        int l = 0;
        int h  = arr.size()-1;

        while (h >= l) {
            int m = l + (h-l)/2;
            int x = arr.get(m);
            if (x < num) {
                l = m + 1;
            } else if (x > num) {
                h = m -1;
            } else {
                if (m == 0) {
                    return m;
                } else if (x == arr.get(m-1)) {
                    h = m-1;
                } else {
                    return m;
                }
            }
        }
        return -1;
    }
}