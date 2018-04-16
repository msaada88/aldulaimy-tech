public class Queue implements QueueInterface {
    private int size;
    private Node first;
    private Node last;
    
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void enqueue(Object newItem) throws QueueException {
        if (size == 0) {
            Node node = new Node(newItem);
            first = node;
            last = node;
        }
        else {
            Node node = new Node(newItem);
            last.next = node;
            last = node;
        }
        
        size++;
    }
    
    public Object dequeue() throws QueueException {
        if (size == 0) {
            throw new QueueException("Queue is empty");
        }
        
        Node node = first;
        first = first.next;
        
        return node.item;
    }
    
    public void dequeueAll() {
        first = null;
        last = null;
        size = 0;
    }
    
    public Object peek() throws QueueException {
        if (size == 0) {
            throw new QueueException("Queue is empty");
        }
        
        return first.item;
    }
    
    public String oddListings() {
        String word = "";
        int i = 1;
        
        if (size >= 1) {
            for (Node curr = first; i <= size; i += 2) {
                word += curr.item + " ";
                if (curr.next != null) {
                    curr = curr.next.next;
                }
            }
        }
        
        return word;
    }
    
    public String evenListings() {
        String word = "";
        int i = 2;
    
        if (size >= 2) {
            for (Node curr = first.next; i <= size; i += 2) {
                word += curr.item + " ";
                if (curr.next != null) {
                    curr = curr.next.next;
                }
            }
        }
    
        return word;
    }
}
