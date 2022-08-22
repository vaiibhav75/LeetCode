class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
                arr1[nums1[i]]++;
        }

        for (int i = 0; i < nums2.length; i++) {
                arr2[nums2[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                for (int j = 0; j < Math.min(arr1[i],arr2[i] ); j++) {
                    ans.add(i);
                }
            }
        }

        int[] finalAns = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            finalAns[i] = ans.get(i);
        }

        return finalAns;
        
    }
}