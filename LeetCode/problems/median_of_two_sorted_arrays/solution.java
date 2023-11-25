class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int x =n+m;
        int f = x/2;
        int [] arr = new int [x];
        while(i+j<x && i < n && j < m){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            arr[k]=nums1[i];
            k++;
            i++;
        }

        while (j < m) {
            arr[k]=nums2[j];
            k++;
            j++;
        }
       

        if(x%2==0){
            double a = (double) ((double)arr[f - 1] + (double) arr[f]) /2;
            
            return a;
        }else{
            return (double) arr[f];
        }
    }
}