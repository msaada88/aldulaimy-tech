import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Creates the panel for the UFO "game"
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 42.3
 * @since 2017-04-06
 */

public class SpaceShipPanel extends JPanel
{
    // declare the point to draw lines
    
    private Point point1 = null;
    
    // create the label and button for the controls, and the UFO image to follow the cursor
    private JLabel counterText;
    private JButton button;
    private ImageIcon ufo;
    
    // boolean tag to store the laser fire state and times fired since last reset
    private boolean clickToggled;
    private int timesFired;
    
    /**
     * Constructor for the panel of the Spaceship Game. Defaults laser to off and 
     * shots fired to zero.
     */
    public SpaceShipPanel()
    {
        timesFired = 0;
        clickToggled = false;
        
        // counter
        counterText = new JLabel ("Times fired: " + timesFired);
        add (counterText);
        
        // controls
        button = new JButton ("Reset");
        button.addActionListener (new ResetListener());
        add (button);
        
        // listeners for pressing and releasing
        addMouseListener (new LaserPressListener());
        addMouseListener (new LaserReleaseListener());
        
        // listener for moving the mouse
        addMouseMotionListener (new LaserMovedListener());
        
        // creates a ufo icon that will follow the cursor
        ufo = new ImageIcon ("Ufo_small.png");
        
        setBackground (Color.gray);
        setPreferredSize (new Dimension (400, 500));
    }
    
    /* 
     * Draws the line between the cursor and the "target"
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        
        // draws a line between the last moved-to pixel and a random point on the panel
        
        if (clickToggled && point1 != null) 
        {
            page.setColor (colorPick ());
            page.drawLine (point1.x, point1.y, 
                          (int) (Math.random () * 400) , (int) (Math.random () * 500));
        }
        
        //update the counter on repaint
        counterText.setText ("Times fired: " + timesFired + "    ");
        
        // move the ufo "cursor" with each repaint
        ufo.paintIcon (this, page, point1.x - 50, point1.y - 50);

       // debug
       // page.drawString ("Times fired: " + timesFired, 20, 20);
    }

    /**
     * Picks a color out of four, based on the amount of lasers fired
     * @return A Color object, either blue, green, cyan, or yellow
     */
    private Color colorPick ()
    {
        Color shade = null;
        
        switch (timesFired % 4)
        {
        case 0: 
            shade = Color.yellow;
            break;
        case 1: 
            shade = Color.blue;
            break;
        case 2: 
            shade = Color.green;
            break;
        case 3: 
            shade = Color.cyan;
            break;
        }
        
        return shade;
    }
    
    /**
     * Listens for the press of the mouse to turn on the laser, 
     * add one to the shot counter, and redraw the graphics
     */
    private class LaserPressListener implements MouseListener 
    {
        
        public void mousePressed (MouseEvent event)
        {
            timesFired++;
            clickToggled = true;
            repaint();
        }
        
        public void mouseClicked (MouseEvent event) {}
        public void mouseReleased (MouseEvent event) {}
        public void mouseEntered (MouseEvent event) {}
        public void mouseExited (MouseEvent event) {}
    }
    
    /**
     * Listens for the release of the mouse to turn off the laser and redraw graphics
     * Indeed, this could have been in the last class but part 9 on the rubric suggests I do 
     * it like this
     */
    private class LaserReleaseListener implements MouseListener
    {
        public void mouseReleased (MouseEvent event) 
        {
            clickToggled = false;
            repaint();
        }
        
        public void mouseClicked (MouseEvent event) {}
        public void mousePressed (MouseEvent event) {}
        public void mouseEntered (MouseEvent event) {}
        public void mouseExited (MouseEvent event) {}
    }
    
    /**
     * Listens to the mouse moving to find the new point of the cursor location,
     * and draws the ufo centered at that position
     */
    private class LaserMovedListener implements MouseMotionListener
    {
        public void mouseMoved (MouseEvent event) 
        {
            point1 = event.getPoint ();
            repaint();
        }
        
        public void mouseDragged (MouseEvent e) {}
    }
    
    /**
     * This listens to the press of the reset button to stop the laser and set
     * times fired back to zero.
     */
    private class ResetListener implements ActionListener 
    {
        public void actionPerformed (ActionEvent e)
        {
            clickToggled = false;
            timesFired = 0;
            repaint();
        }
    }
}