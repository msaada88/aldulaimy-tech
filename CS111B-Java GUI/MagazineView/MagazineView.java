import javax.swing.*;

/*
1. Create a frame
2. Add a panel
3. Add Labels, Buttons, and a text area to the panel
4. Add action listeners to provide interaction with the MagazineList
 */

/**
 * Creates a frame and displays a <code>MagazineViewPanel</code>.
 *
 * @author Boris Alguliev
 * @author Carlos G. Valdes Cantu
 * @author Mohamed Saada
 * @version 1.0
 * @since 2017-05-12
 * @see MagazineViewPanel
 */
public class MagazineView {
    /**
     * Creates a frame and displays a <code>MagazineViewPanel</code>.
     * @see MagazineViewPanel
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Magazine Rack");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new MagazineViewPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}