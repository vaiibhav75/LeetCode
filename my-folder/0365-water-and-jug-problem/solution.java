class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (targetCapacity > jug1Capacity + jug2Capacity) {
            return false;
        }
        int hcf = hcf(jug1Capacity, jug2Capacity);
        
        return targetCapacity%hcf == 0;
    }
    
    static int hcf (int a, int b) {
        if (a == 0) {
            return b;
        }
        return hcf(b%a, a);
    }
}
