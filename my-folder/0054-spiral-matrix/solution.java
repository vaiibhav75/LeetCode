class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int a = 0;
        int b = 0;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int c = (Math.min(m+1,n+1) + 1 )/2;
        for (int x = 0; x < c ; x++) {
            for (int i = x; i <= n-x; i++) {
                if (ans.size() == matrix.length* matrix[0].length ){
                    return ans;
                }
                b = i;
                ans.add(matrix[a][b]);
            }


            for (int i = x+1; i <= m-x; i++) {
                if (ans.size() == matrix.length* matrix[0].length ){
                    return ans;
                }
                a = i;
                ans.add(matrix[a][b]);
            }


            for (int i = n-x-1; i >= x ; i--) {
                if (ans.size() == matrix.length* matrix[0].length ){
                    return ans;
                }
                b = i;
                ans.add(matrix[a][b]);
            }


            for (int i = m-x-1; i >= x+1 ; i--) {
                if (ans.size() == matrix.length* matrix[0].length ){
                    return ans;
                }
                a = i;
                ans.add(matrix[a][b]);
            }
        }

        return ans;

    }
}
    
