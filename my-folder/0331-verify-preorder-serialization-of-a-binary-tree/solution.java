import java.util.*;
class Solution {
    public boolean isValidSerialization(String preorder) {
        StringTokenizer order = new StringTokenizer(preorder, ",");
        Stack<String> stack = new Stack<>();
        stack.push(order.nextToken());
        while (!stack.isEmpty() && stack.peek().equals("#")) stack.pop();
        while (true) {
            if (stack.isEmpty()) {
                return !order.hasMoreTokens();
            }
            
            if (!order.hasMoreTokens()) {
                return false;
            }
            stack.pop();
            if (order.hasMoreTokens()) {
                stack.push(order.nextToken());
            } else {
                return false;
            }

            if (order.hasMoreTokens()) {
                stack.push(order.nextToken());
            } else {
                return false;
            }
            
            while (!stack.isEmpty() && stack.peek().equals("#")) stack.pop();
        }
    }
}

