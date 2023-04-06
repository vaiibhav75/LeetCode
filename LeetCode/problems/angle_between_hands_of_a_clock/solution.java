class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;

        double hourAngle = hour*30 + (minutes*0.5);
        double minuteAngle = minutes*6;
        double ans =  Math.abs(hourAngle-minuteAngle);
        return Math.min(ans, 360-ans);
    }
}