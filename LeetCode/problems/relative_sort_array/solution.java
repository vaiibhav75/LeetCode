class Solution {

    public static void main(String[] args) {
        int[] a = {28,6,22,8,44,17};
        int[] b = {22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(a,b)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int curr = 0;

        for (int i = 0; i < arr2.length; i++) {
            int pivot = arr2[i];
            while (curr < arr1.length && arr1[curr] == pivot) {
                curr++;
            }

            boolean found = true;

            while (found) {
                found = false;
                for (int j = curr+1; j < arr1.length; j++) {
                    if (arr1[j] == pivot) {
                        swap(arr1,curr,j);
                        curr++;
                        found= true;
                        while (curr < arr1.length && arr1[curr] == pivot) {
                            curr++;
                        }
                        break;


                    }
                }
            }

        }

        Arrays.sort(arr1, curr, arr1.length);
        return arr1;
    }

    static void swap (int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}