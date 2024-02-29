class MyCircularQueue {
    int front;
    int rear;
    int size;
    int[] arr;
    int k;

    public MyCircularQueue(int k) {
        this.k = k;
        size = 0;
        arr = new int[k];
        front = 0;
        rear = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        size++;
        arr[rear] = value;
        rear++;
        
        rear =adjust(rear);
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front++;
        size--;
        front = adjust(front);
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        int x = front;
        x = adjust(x);

        return arr[x];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int x = rear-1;
        x=adjust(x);
        
        return arr[x];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == k;
    }
    
    public int adjust (int x) {
        return (x+k)%k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */