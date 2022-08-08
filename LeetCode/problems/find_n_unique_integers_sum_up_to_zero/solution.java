class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n%2 != 0){
            for (int i = 0; i <= n/2; i++) {
                arr[n/2 + i] = i;
                arr[n/2 - i] = -i;
            } 
        } else {
            for (int i = 1; i <= n/2; i++) {
                arr[n/2 -1 +i] = i;
                arr[n/2 - i] = -i;
            }
        }
        return arr;
        
        
    }
}