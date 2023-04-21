class Solution {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 100000*count(arr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }

    static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}