class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
//        int count = 0;

        while (n > 0) {
            sum += (n%k);
            n /= k;
//            count++;
        }
//        System.out.println(sum);
//        System.out.println(count);
        return sum;
    }
}
