/**
 * A class to store a <code>String</code> object.
 *
 * @version 1.0
 * @author John Lewis
 * @author William Loftus
 * @since 2005
 */
public class Magazine {
    private String title;
    
    /**
     * Sets up the new magazine with its title.
     * @param newTitle The <code>String</code> to store in this magazine.
     */
    public Magazine(String newTitle) {
        title = newTitle;
    }
    
    /**
     * Returns this magazine as a string.
     * @return The title of the magazine
     */
    public String toString() {
        return title;
    }
}

