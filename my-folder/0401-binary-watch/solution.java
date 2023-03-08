class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int a = count(i)  + count(j);
                if (a == turnedOn){
                    if (j < 10 ) {
                        ans.add(i + ":0" + j);
                    } else {
                        ans.add(i + ":" + j);
                    }
                }
            }
        }
        return ans;
    }

    static int count(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;

        }
        return count;

    }
}
