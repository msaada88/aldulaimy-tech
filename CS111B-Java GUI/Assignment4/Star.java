import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 1
 * @since 2017-03-14
 */
public class Star
{
    private final int WINDOW_X,
                      WINDOW_Y,
                      TOTAL_STARS;
    
    private Random gen = new Random();
    
    /**
     * Creates an object storing properties for the sky to be drawn
     * @param width The width of the box to draw in (in pixels)
     * @param height The height of the box to draw in (in pixels)
     * @param stars The amount of stars to draw
     */
    public Star (int width, int height, int stars)
    {
        WINDOW_X = width;
        WINDOW_Y = height;
        TOTAL_STARS = stars;
    }
    
    /**
     * Draws the stars onto the panel
     * @param page A graphics object to be used to draw the objects
     */
    public void draw (Graphics page)
    {
        page.setColor (Color.LIGHT_GRAY);
        
        for (int i = 0; i < TOTAL_STARS; i++)
            page.fillRect (gen.nextInt (WINDOW_X) + 1, gen.nextInt (WINDOW_Y) + 1, 1, 1);
    }
}
