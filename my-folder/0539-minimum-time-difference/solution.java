class Solution {
    // public static void main(String[] args) {
    //     List<String> arr = new ArrayList<>();
    //     arr.add("00:00");
    //     arr.add("04:00");
    //     arr.add("22:00");

    //     System.out.println(findMinDifference(arr));
    // }


    static int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        for (int i = 0; i < arr.length; i++) {
            String x = timePoints.get(i);
            int hrs = ((x.charAt(0) - '0')*10) + (x.charAt(1) - '0');
            int mins = ((x.charAt(3) - '0')*10) + (x.charAt(4) - '0');
            arr[i] = (hrs*60) + mins;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int time = Math.abs(arr[(i+1)% arr.length] - arr[i]);
            time = Math.min(time, 1440-time);
            min = Math.min(min, time);
        }
        min = Math.min(min, 1440-min);
        return min;
    }
}
