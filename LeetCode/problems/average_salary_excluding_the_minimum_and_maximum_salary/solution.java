class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double average = 0;

        for (int i = 1; i <salary.length-1 ; i++) {
            average += (double) salary[i] / (salary.length- 2) ;
        }
        return average;
    }
}