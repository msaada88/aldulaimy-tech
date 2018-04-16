import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A panel that provides a graphical interface to manipulate a <code>MagazineList</code>.
 *
 * @author Boris Alguliev
 * @author Carlos G. Valdes Cantu
 * @author Mohamed Saada
 * @version 1.0
 * @since 2017-05-12
 */

public class MagazineViewPanel extends JPanel {
    private JLabel inputLabel;
    private JLabel deleteLabel;
    private JButton push;
    private JTextField insertMagazine;
    private JTextField deleteMagazine;
    private JTextArea display;
    private MagazineList rack;
    private JPanel north;
    private JPanel south;
    
    /**
     * Creates a new panel with buttons and listeners for manipulating a
     * <code>MagazineList</code>.
     */
    public MagazineViewPanel() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.gray);
        setLayout(new BorderLayout());
        
        rack = new MagazineList();
        north = new JPanel();
        south = new JPanel();
        
        inputLabel = new JLabel("Add Magazine:");       // North
        insertMagazine = new JTextField(30);
        insertMagazine.addActionListener(new InsertListener());
        
        display = new JTextArea();                     // Center
        display.setEditable(false);
        
        deleteLabel = new JLabel("Delete Magazine:");       // South
        deleteMagazine = new JTextField(30);
        deleteMagazine.addActionListener(new DeleteListener());
        
        push = new JButton("Delete All");             //South
        push.addActionListener(new ClearListener());
        
        north.add(inputLabel);
        north.add(insertMagazine);
        
        south.add(deleteLabel);
        south.add(deleteMagazine);
        south.add(push);
        
        add(north, BorderLayout.NORTH);
        add(display, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class InsertListener implements ActionListener {
        /**
         * Inserts the <code>String</code> from the appropriate text field
         * into the <code>MagazineList</code> and refreshes the
         * text area when triggered by the user.
         *
         * @param event
         */
        public void actionPerformed(ActionEvent event) {
            String text = insertMagazine.getText();
            
            rack.insert(new Magazine(text));
            insertMagazine.setText("");
            
            display.setText("" + rack);
        }
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class ClearListener implements ActionListener {
        /**
         * Clears the <code>MagazineList</code> of all nodes and
         * resets the text area.
         *
         * @param event
         */
        public void actionPerformed(ActionEvent event) {
            rack.deleteAll();
            display.setText("" + rack);
        }
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class DeleteListener implements ActionListener {
        /**
         * Deletes the <code>String</code> from the appropriate text field
         * from the <code>MagazineList</code> and refreshes the
         * text area when triggered by the user.
         *
         * @param event
         */
        @Override
        public void actionPerformed(ActionEvent event) {
            rack.delete(deleteMagazine.getText());
            display.setText("" + rack);
            deleteMagazine.setText("");
        }
    }
}
