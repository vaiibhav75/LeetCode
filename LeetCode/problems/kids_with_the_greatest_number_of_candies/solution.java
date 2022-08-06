class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<Boolean>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            arr.add((candies[i] + extraCandies) >= max);
        }

        return arr;
    }
}