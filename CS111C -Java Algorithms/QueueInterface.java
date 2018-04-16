public interface QueueInterface {

  public boolean isEmpty();
  // Determines whether a queue is empty.
  // Precondition: None.
  // Postcondition: Returns true if the queue is empty;
  // otherwise returns false.

  public void enqueue(Object newItem) throws QueueException;
  // Adds an item at the back of a queue.
  // Precondition: newItem is the item to be inserted.
  // Postcondition: If the operation was successful, newItem
  // is at the back of the queue. Some implementations may
  // throw QueueException if newItem cannot be added to the
  // queue.

  public Object dequeue() throws QueueException;
  // Retrieves and removes the front of a queue.
  // Precondition: None.
  // Postcondition: If the queue is not empty, the item
  // that was added to the queue earliest is returned and
  // the item is removed. If the queue is empty, the
  // operation is impossible and QueueException is thrown.

  public void dequeueAll();
  // Removes all items of a queue.
  // Precondition: None.
  // Postcondition: The queue is empty.

  public Object peek() throws QueueException;
  // Retrieves the item at the front of a queue.
  // Precondition: None.
  // Postcondition: If the queue is not empty, the item
  // that was added to the queue earliest is returned.
  // If the queue is empty, the operation is impossible
  // and QueueException is thrown.
  
  public String oddListings();
  // this method returns a string that contains the Queue's Node contents in the 1st, 3rd, 5th, 7th, etc positions in the Queue for all odd numbered positions in the Queue.
  
  public String evenListings();
  // this method returns a string that contains the Queue's Node contents in the 2nd, 4th, 6th, 8th, etc positions in the Queue for all even numbered positions in the Queue.
}  // end QueueInterface
