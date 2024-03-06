class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int idleTime = (maxFreq - 1) * n;
        for (int i = 24; i >= 0; i--) {
            idleTime -= Math.min(maxFreq - 1, freq[i]);
        }
        return Math.max(idleTime, 0) + tasks.length;
        
    }
}
