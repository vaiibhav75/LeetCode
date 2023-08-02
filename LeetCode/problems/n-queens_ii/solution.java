class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        boolean[] collums = new boolean[n];
        boolean[] ADiag = new boolean[2*n + 1];
        boolean[] BDiag = new boolean[2*n + 1];


        solve(ans,n,curr,0,collums,ADiag,BDiag);
        return ans.size();
    }

     static void solve (List<List<String>> ans, int n, List<String> curr, int val, boolean[] collums, boolean[] ADiag, boolean[] BDiag) {
        if (val == n) {
            ans.add(curr);
            return;
        }
        StringBuilder dotamp = new StringBuilder();
        for (int j = 0; j < n; j++) {
            dotamp.append('.');
        }
        for (int i = 0; i < n; i++) {



            if (!collums[i] && !ADiag[i+val] && !BDiag[n-1-val + i]) {
                collums[i] = true;
                ADiag[i+val] = true;
                BDiag[n-1-val + i] = true;
                dotamp.setCharAt(i,'Q');

                List<String> newCurr = new ArrayList<>(curr);
                newCurr.add(dotamp.toString());
                dotamp.setCharAt(i,'.');


                solve(ans, n, newCurr,val+1,collums,ADiag,BDiag);

                collums[i] = false;
                ADiag[i+val] = false;
                BDiag[n-1-val + i] = false;


            }
        }


    }

}