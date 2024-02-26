class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ans = new Stack<>();

        outer: for (int x: asteroids) {
            if (x > 0) {
                ans.push(x);
                continue;
            }

            while (!ans.isEmpty() && x * ans.peek() < 0) {
                if (Math.abs(ans.peek()) <= Math.abs(x)) {
                    if (Math.abs(ans.pop()) == Math.abs(x)){
                        continue outer;
                    } 
                } else {
                    break;
                }
            }
            if (ans.isEmpty() || x* ans.peek() > 0) {
                ans.push(x);
            }
        }
        
        int n =ans.size();
        
        int[] arr = new int[n];

        for (int i = n-1; i >= 0 ; i--) {
            arr[i] = ans.pop();
        }
        
        return arr;
    }
}