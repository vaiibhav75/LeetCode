class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            if (arr[nums1[i]] == 0) {
                arr[nums1[i]]++;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (arr[nums2[i]] == 1) {
                arr[nums2[i]]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                ans.add(i);
            }
        }

        int[] finalAns = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            finalAns[i] = ans.get(i);
        }

        return finalAns;
    }
}