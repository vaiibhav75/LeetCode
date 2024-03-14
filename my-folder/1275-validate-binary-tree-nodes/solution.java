class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] parents = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                if (++parents[leftChild[i]] > 1) return false;
                count++;
            }

            if (rightChild[i] != -1) {
                if (++parents[rightChild[i]] > 1) return false;
                count++;
            }
        }

        if (count != n-1) return false;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (parents[i] == 0) {
               if (!check(i,leftChild,rightChild,arr)) return false; 
            }
        }

        for (int i = 0; i < n; i++) {
            if (!arr[i]) return false;
        }
        return true;
    }

    public boolean check (int i, int[] l, int[] r, boolean[] arr) {
        if (i == -1) return true;
        if (arr[i]) return false;
        arr[i] = true;
        return check(l[i],l,r,arr) && check(r[i],l,r,arr);

    }
}
