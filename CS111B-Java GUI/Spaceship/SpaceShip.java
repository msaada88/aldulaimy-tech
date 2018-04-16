package hw6;

import javax.swing.JFrame;

/**
 * Creates the frame to hold the Spaceship game
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 42.3
 * @since 2017-04-06
 */

public class SpaceShip
{
    
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Spaceship");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new SpaceShipPanel ());

        frame.pack();
        frame.setVisible(true);
    }
    
}