class MedianFinder {
    PriorityQueue<Integer> secondHalf;
    PriorityQueue<Integer> firstHalf;
    boolean odd;
    public MedianFinder() {
        firstHalf = new PriorityQueue<>(Collections.reverseOrder());
        secondHalf = new PriorityQueue<>();
        odd = false;
    }

    public void addNum(int num) {
        if (odd) {
            secondHalf.add(num);
            firstHalf.add(secondHalf.poll());
        } else {
            firstHalf.add(num);
            secondHalf.add(firstHalf.poll());
        }
        odd = !odd;
    }

    public double findMedian() {
        if (odd) {
            return secondHalf.peek();
        } else {
            return (firstHalf.peek() + secondHalf.peek()) / 2.0;
        }
    }
}
