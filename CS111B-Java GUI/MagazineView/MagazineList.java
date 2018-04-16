/**
 * Implementation of a linked-list structure for manipulation of
 * <code>Magazine</code> objects. Implements methods to add, insert,
 * delete, and clear <code>Magazine</code> objects.
 *
 * @author Boris Alguliev
 * @author Carlos G. Valdes Cantu
 * @author Mohamed Saada
 * @version 1.0
 * @since 2017-05-12
 */
public class MagazineList {
    private MagazineNode list;
    
    /**
     * Sets up an initially empty list of magazines.
     */
    public MagazineList() {
        list = null;
    }
    
    /**
     * Creates a new MagazineNode object and adds it to the end of
     * the linked list.
     * @param mag The magazine to add.
     */
    public void add(Magazine mag) {
        
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;
        
        if (list == null)
            list = node;
        else {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }
    
    /**
     * Creates a new MagazineNode object and adds it to the front of
     *  the linked list.
     * @param mag The magazine to insert.
     */
    public void insert(Magazine mag) {
        
        MagazineNode node = new MagazineNode(mag);
    
        if (list == null)
            list = node;
        else {
            node.next = list;
            list = node;
        }
    }
    
    /**
     * Clears the linked list.
     */
    public void deleteAll() {
        list = null;
    }
    
    /**
     * Searches for the given <code>String</code> and deletes the first
     * <code>MagazineNode</code> that contains a <code>Magazine</code>
     * with a matching title. Search is not case-sensitive.
     * @param s <code>String</code> to search for.
     */
    public void delete(String s) {
        MagazineNode helper = list;
        boolean found = false;
        
        if (list != null) {
            if (helper.magazine.toString().equalsIgnoreCase(s)) {
                list = helper.next;
                found = true;
            }
    
            while (list != null && !found) {
                if (helper.next.magazine.toString().equalsIgnoreCase(s)) {
                    helper.next = helper.next.next;
                    found = true;
                } else
                    helper = helper.next;
            }
        }
    }
    
    /**
     * Returns this list of magazines as a string.
     * @return A string with the titles of <code>Magazine</code> objects on separate lines.
     */
    public String toString() {
        String result = "";
        
        MagazineNode current = list;
        
        while (current != null) {
            result += current.magazine + "\n";
            current = current.next;
        }
        
        return result;
    }
    
    /**
     * An inner class that represents a node in the magazine list.
     * The public variables are accessed by the MagazineList class.
     */
    private class MagazineNode {
        public Magazine magazine;
        public MagazineNode next;
    
        /**
         * Sets up the node.
         * @param mag The magazine to be stored in this node.
         */
        public MagazineNode(Magazine mag) {
            magazine = mag;
            next = null;
        }
    }
}
