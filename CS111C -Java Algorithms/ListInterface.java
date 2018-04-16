public interface ListInterface {
// ********************************
//  Inteface for the ADT List
// ********************************
    
    // list operations:
    public boolean isEmpty();
    public int size();
    public void add(int index, Object item)
            throws ListIndexOutOfBoundsException;
    public void remove(int index)
            throws ListIndexOutOfBoundsException;
    public Object get(int index)
            throws ListIndexOutOfBoundsException;
    public void removeAll();
} // end ListInteface