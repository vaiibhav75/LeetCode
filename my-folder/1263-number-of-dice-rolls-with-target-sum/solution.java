class Solution {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30,30,500));
    }
    static int numRollsToTarget(int n, int k, int target) {
        long[][] arr = new long[n+1][target+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target ; j++) {
                arr[i][j] = -1;
            }
        }
        long ans = solve(n,target,k,arr) % 1000000007;
        return (int) ans;
    }

    static long solve (int rem, int target, int k, long[][] arr) {
        if (target == 0 && rem == 0) {
            return 1;
        }

        if (target <= 0){
            return 0;
        }
        if (rem == 0) {
            return 0;
        }

        if (arr[rem][target] != -1) {
            return arr[rem][target];
        }


        long count = 0;
        long MOD =  1000000007;
        for (int i = 1; i <= k ; i++) {
            if (target>=i) {

                count+= solve(rem-1, target-i,k,arr);
                count%=MOD;
            }
            else {
                break;
            }
        }
        arr[rem][target]=count;
        return count;



    }
}
