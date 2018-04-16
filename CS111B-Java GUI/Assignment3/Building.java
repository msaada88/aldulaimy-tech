import java.awt.Color;
import java.awt.Graphics;

import java.util.Random;

/**
 * 
 */

/**
 * Building - Defines variables for 
 * @author Boris Alguliev
 * @author Mohamaed Saada
 * @version 1.0
 * @since 2017-02-27
 *
 */
public class Building 
{
    private int x,
                y,
                width,
                height;
    
    private Random gen = new Random (); //random generator for window placement
    
    /**
     * Creates and object to store values for the size and shape of a building
     * @param upperX The x position in pixels of the left side of the building
     * @param upperY The y position in pixels of the top side of the building
     * @param buildWidth The width of the building in pixels
     * @param buildHeight The height of the building in pixels
     */
    public Building (int upperX,int upperY, int buildWidth, int buildHeight)
    {
        x = upperX;
        y = upperY;
        width = buildWidth;
        height = buildHeight;
    }
    
    /**
     * @return The width in pixels of the building
     */
    public int getWidth () 
    {
        return width;
    }
    
    /**
     * @return The height in pixels of the building
     */
    public int getHeight () 
    {
        return height;
    }
    
    /**
     * @param width The new width in pixels of the building
     */
    public void setWidth (int width) 
    {
        this.width = width;
    }
    
    /**
     * @param height The new height in pixels of the building
     */
    public void setHeight (int height) 
    {
        this.height = height;
    }
    
    /**
     * Draws the building of specified size and position, and draws windows 
     * @param g A graphics object
     */
    public void draw (Graphics g)
    {
        g.setColor (Color.black); //set color for buildings
        g.fillRect (x, y, width, height);
        
        g.setColor (Color.yellow); //set color for windows
                
        for (int i = 0; i < (height + width)/15 ; i++) //create randomly placed windows
        {
            g.fillRect (gen.nextInt (width-8) + x + 4, gen.nextInt (height-8) + y + 4, 4, 4);
        }
    }
    
    
}
