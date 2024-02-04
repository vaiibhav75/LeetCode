class MyQueue {
    Stack<Integer> one;
    Stack<Integer> two;
    public MyQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void push(int x) {
        one.push(x);
    }

    public int pop() {
        transfer(one,two);
        int ans = two.pop();
        transfer(two, one);
        return ans;
    }

    public int peek() {
        transfer(one,two);
        int ans = two.peek();
        transfer(two, one);
        return ans;
    }
    
    void transfer (Stack<Integer> a, Stack<Integer> b) {
        while (!a.empty()) {
            b.push(a.pop());
        }
    }

    public boolean empty() {
        return one.empty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
