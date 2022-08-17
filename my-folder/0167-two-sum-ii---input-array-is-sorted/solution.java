class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = {0 , 0};
        int s = 0;
        int e = numbers.length-1;

        for (int i = 0; i < numbers.length-1; i++) {
            s = i+1;
            int k = target - numbers[i];
            int m = s + (e-s)/2;
            while (s <= e) {
                if(numbers[m] < k) {
                    s = m + 1;
                } else if (numbers[m] > k) {
                    e = m -1;
                } else {
                    arr[0] = i + 1;
                    arr[1] = m +1;
                    return arr;
                }
                m = s + (e-s)/2;
            }
        }
        return arr;

    }
}
