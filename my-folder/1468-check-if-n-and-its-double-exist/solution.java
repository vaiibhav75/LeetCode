class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("test element" + arr[i] + "   test index" + i);
            int start = i + 1;

            int end = arr.length-1;
            int mid = start + (end-start)/2;
            
            if (arr[i] >= 0) {
                while (start <= end) {

                    System.out.println("mid element" + arr[mid] + "  mid index" +mid);
                    if (arr[mid] < (2 * arr[i])) {
                        System.out.println("smaller");
                        start = mid + 1;
                    } else if (arr[mid] > (2 * arr[i])) {
                        end = mid - 1;
                        System.out.println("larger");
                    } else {
                        return true;
                    }
                    mid = start + (end-start)/2;
                }
            } else {
                while (start <= end) {

                    System.out.println("mid element" + arr[mid] + "  mid index" +mid);
                    if (arr[mid]*2 < arr[i]) {
                        System.out.println("smaller");
                        start = mid + 1;
                    } else if (arr[mid]*2 > arr[i]) {
                        end = mid - 1;
                        System.out.println("larger");
                    } else {
                        return true;
                    }
                    mid = start + (end-start)/2;
                }
            }

            
        }
        return false;
    }
}
