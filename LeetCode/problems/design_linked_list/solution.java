class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    public MyLinkedList() {
        length = 0;
    }

    public int get(int index) {
        if (index >= length) {
            return -1;
        }

        Node pointer = head;

        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }

        return pointer.val;
    }

    public void init (int val) {
        head = new Node(val);
        tail = head;
        length = 1;
    }

    public void addAtHead(int val) {
        if (length == 0) {
            init(val);
            return;
        }
        Node pointer = new Node(val);
        pointer.next = head;
        head = pointer;
        length++;

    }

    public void addAtTail(int val) {
        if (length == 0) {
            init(val);
            return;
        }
        Node pointer = new Node(val);
        tail.next = pointer;
        tail = pointer;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index == 0){
            addAtHead(val);
            return;
        }
        
        
        recursiveInsert(index,val,head);

        
    }
    
    public void recursiveInsert (int index, int val, Node pointer) {
        if (index == 1) {
            Node n = new Node(val);
            n.next = pointer.next;
            pointer.next = n;
            length++;
        } else {
            recursiveInsert(index-1,val,pointer.next);
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }
        Node pointer = head;
        for (int i = 0; i < index-1; i++) {
            pointer = pointer.next;
        }

        pointer.next = pointer.next.next;

        if (index == length -1) {
            tail = pointer;
        }

        length--;


    }
}
