class Solution {

    
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        Queue<Long> queue = new LinkedList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < k) {
                queue.add((long)nums[i]);
            }
        }

        return recursion(queue,new LinkedList<>(), k);
    }

    static int recursion (Queue<Long> queue, Queue<Long> newQueue, int k) {
        if (queue.isEmpty() && newQueue.isEmpty()) {
            return 0;
        }

        if (queue.size() == 1 && newQueue.isEmpty()) {
            return 1;
        }

        if (newQueue.size() == 1 && queue.isEmpty()) {
            return 1;
        }
        
        if (queue.size() == 1 && newQueue.size() == 1) {
            long x = queue.poll();
            long y = newQueue.poll();
            
            long val = Math.min(x,y)*2 + Math.max(x,y);
            if (val < k) {
                return 2;
            } else {
                return 1;
            }
        }
        int ans = 0;
        while (queue.size() > 1) {
            long first;
            long second;

            if (!newQueue.isEmpty() && newQueue.peek() < queue.peek()) {
                first = newQueue.poll();
            } else {
                first = queue.poll();
            }

            if (!newQueue.isEmpty() && newQueue.peek() < queue.peek()) {
                second = newQueue.poll();
            } else {
                second = queue.poll();
            }

            long value = first+ first + second;

            if (value < k) {
                newQueue.add(value);
            }

            ans++;
        }
        return ans + recursion(newQueue,queue, k);

    }
}

