class Solution {
    public int findComplement(int num) {
        for (int i = 0; i <= log2(num) ; i++) {
            num ^= (1<<i);
        }
        return num;
    }

    static int log2 (int n) {
        return (int) (Math.log(n)/Math.log(2));
    }
}