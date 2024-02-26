class CustomStack {
    int[] arr;
    int top;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        top = 0;
    }

    public void push(int x) {
        if (top < arr.length) {
            arr[top++] = x;
        }
    }

    public int pop() {
        if (top > 0) {
            return arr[--top];
        }
        
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, top); i++) {
            arr[i] += val;
        }
    }
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */