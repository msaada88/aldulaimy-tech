import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

/**
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 49571295329.1
 * @since 2017-03-14
 */

public class SkylinePanel extends JPanel
{   
    private final int WINDOW_X = 300,
                      WINDOW_Y = 200;
    
    private Random gen = new Random (); //random generator
             
    public SkylinePanel ()
    {
        setPreferredSize (new Dimension(WINDOW_X, WINDOW_Y));
        setBackground (Color.gray);
    }
    
    /**
     * Draws the building onto the panel, and writes a message
     * @param g A graphics object to be used to draw the objects
     */
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        
        Star nightStars = new Star (WINDOW_X, WINDOW_Y, WINDOW_X + WINDOW_Y); // creates Star object in dimension of window
        nightStars.draw(g);
        
        int numberBuildings = gen.nextInt (WINDOW_X / 40) + 5; // generates a random number of buildings from 5 to a varying width
        
        int[] sizes = new int [numberBuildings]; // an array to store random numbers for building size determination
        
        for (int i = 0; i < numberBuildings; i++)
        {
            sizes[i] = gen.nextInt (49) + 50; // fills the size array with numbers from 50 to 99
        }
        
        int sum = 0,
            marginSum = 0;
        
        for (int each: sizes) // adds up the sizes from the array
            sum += each;
        
        double[] weightedSize = new double [numberBuildings]; // a new array will hold the proportions that determine the drawn size
        
        for (int i = 0; i < numberBuildings; i++)
            weightedSize[i] = (double) sizes[i] / sum; // each weightedSize is a random fraction of width occupied by any certain building over all buildings
        
        int[] margin = new int [numberBuildings];
        
        for (int i = 0; i < numberBuildings; i++)
            margin[i] = gen.nextInt (5) + 2; // the array of margins is filled with at least 2 and at most 6
        
        for (int each: margin) // find the total pixels for margins after the first building
            marginSum += each;
            
        
        int localX = 4; // start the drawing position at 4 pixels from the left
        
        for (int localBuild = 0; localBuild < numberBuildings; localBuild++)
        {
            int localY = 50 + gen.nextInt (101); //each height is at least 50px from the top and at most 150px from the top
            
            // width of each building is its fraction (weightedSize) times usable space (total window size minus amount of margins time size of margins)
            int width = (int) (weightedSize[localBuild] * (WINDOW_X - marginSum));
            
            
                    
            Building build = new Building (localX, localY, width, WINDOW_Y - localY);
            
            build.draw (g);
            
            // update the drawing position each time by the width and a margin of 4
            localX = localX + width + margin[localBuild];
        }
        
        g.drawString ("Boris and Mohamed's Metropolis", 60, 20);
    }
}