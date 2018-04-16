class Node {
    Object item;
    Node next;
    
    
    Node(Object newItem)  {
        item = newItem;
        next = null;
        
    } // end constructor
    
    
    Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }  // end constructor
    
} // end class Node