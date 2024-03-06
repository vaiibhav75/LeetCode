class Node {


    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }


}

class LRUCache {
    int capacity;
    int currSize;
    Node head;
    Node tail;
    HashMap<Integer,Node> map;
    HashMap<Node,Integer> map2;

    public static void main(String[] args) {
        // Test case 1
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // Output should be 1
        cache.put(3, 3);
        System.out.println(cache.get(2)); // Output should be -1 (since 2 was removed due to capacity constraint)
        cache.put(4, 4);
        System.out.println(cache.get(1)); // Output should be -1 (since 1 was removed due to capacity constraint)
        System.out.println(cache.get(3)); // Output should be 3
        System.out.println(cache.get(4)); // Output should be 4
    }


    public LRUCache(int capacity) {
        this.capacity = capacity;
        currSize =0;
        map = new HashMap<>();
        map2 = new HashMap<>();
        head = null;
        tail = null;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node x = map.get(key);
            remove(x);
            insert(x);
            return x.val;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            map2.remove(map.get(key));
            Node x = new Node(value);
            map.put(key,x);
            map2.put(x,key);

            insert(x);
        } else {
            Node x = new Node(value);
            map.put(key,x);
            map2.put(x,key);
            insert(x);
            currSize++;
            if (currSize > capacity) {
                map.remove(map2.get(head));
                map2.remove(head);
                remove(head);
                currSize--;
            }
        }
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void insert (Node x) {
        if (isEmpty()) {
            head = x;
            tail = x;
            return;
        }

        tail.next = x;
        x.prev = tail;
        x.next = null;
        tail = x;
    }

    public void remove (Node x) {
        if (x == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        if (x == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        x.prev.next = x.next;
        x.next.prev = x.prev;
    }
}
