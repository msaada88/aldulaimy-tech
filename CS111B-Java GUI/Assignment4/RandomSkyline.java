import javax.swing.JFrame;

/*
 * 1. create a new frame named Skyline
 * 2. add the SkylinePanel to the frame, which:
 * 3. sends values to the Building class to:
 * 4. draw buildings on the panel on the frame
 * 5. beauty
 */

/**
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 495712581.1
 * @since 2017-03-14
 */

public class RandomSkyline
{
    /**
     * Generates a city skyline with randomly placed windows
     */
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Skyline");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new SkylinePanel ());

        frame.pack();
        frame.setVisible(true);
    }   
}