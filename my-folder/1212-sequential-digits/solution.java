class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 2; i < 11; i++) {
            long val = 1;
            long map= 1;
            for (int j = 1; j < i; j++) {
                long x = val%10;
                val *= 10;
                val+=(x+1);

                map*= 10;
                map+= 1;
            }

            for (int j = 0; j < 10 - i; j++) {
                if (val >= low && val <= high) {
                    ans.add((int)val);
                }
                val+= map;
            }
            
        }

        return ans;
    }
}
