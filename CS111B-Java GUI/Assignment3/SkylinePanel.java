import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Boris Alguliev
 * @author Mohamaed Saada
 * @version 495712581
 * @since 2017-02-27
 */

public class SkylinePanel extends JPanel
{
    private Building building1,
                     building2,
                     building3,
                     building4,
                     building5;
             
    public SkylinePanel ()
    {
        building1 = new Building (20, 100, 30, 100);
        building2 = new Building (55, 120, 50, 80);
        building3 = new Building (130, 100, 60, 100);
        building4 = new Building (210, 120, 40, 80);
        building5 = new Building (260, 90, 30, 110);
        
        setPreferredSize (new Dimension(300, 200));
        setBackground (Color.lightGray);
    }
    
    /* 
     * Draws the building onto the panel, and writes a message
     */
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        
        building1.draw (g);
        building2.draw (g);
        building3.draw (g);
        building4.draw (g);
        building5.draw (g);
        
        g.drawString ("Boris and Mohamed's Metropolis", 80, 20);
    }
}
