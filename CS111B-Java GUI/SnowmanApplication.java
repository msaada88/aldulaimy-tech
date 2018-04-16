//********************************************************************
//  SnowmanApplication.java       Author: Lewis/Loftus
//  Modified: Mohamed Saada   Date: 2/06/2017
//  Demonstrates basic drawing methods and the use of color.
//  Modified Snowman applet to be stand-alone application. 
//********************************************************************

/**
SnowmanApplication --- frowny snowman
@author Mohamed Saada
@since 2017.02.06
@version 1.0
*/

/*
1. Frame created
2. panel created
3. panel is drawn on
*/

import javax.swing.*;
import java.awt.*;

public class SnowmanApplication
{
   public static void main (String [] args)
   {
      JFrame frame = new JFrame("Snowman Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SnowmanPanel panel = new SnowmanPanel();
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
      
        
//********************************************************************
//  SnowmanPanel class used for drawing shapes 
//********************************************************************

class SnowmanPanel extends JPanel
{

   //-----------------------------------------------------------------
   //  Constructor sets size and color of panel
   //-----------------------------------------------------------------
   public SnowmanPanel()
   {
     setPreferredSize(new Dimension(300,225));
     setBackground(Color.cyan);
   }
     
   //-----------------------------------------------------------------
   //  Draws a snowman.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      final int MID = 170;
      final int TOP = 50;

      setBackground (Color.cyan);

      page.setColor (Color.blue);
      page.fillRect (0, 175, 300, 50);  // ground

      page.setColor (Color.yellow);
      page.fillOval (250, -40, 80, 80);  // sun

      page.setColor (Color.white);
      page.fillOval (MID-20, TOP, 40, 40);      // head
      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

      
      page.setColor (Color.red);
      page.fillOval (MID, TOP+45, 5, 5); //buttons
      page.fillOval (MID, TOP+65, 5, 5);

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

      page.drawArc (MID-10, TOP+20, 20, 10, 60, 120);   // smile

      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
      
      page.setColor (Color.blue);
      page.drawString("Mohamed Saada", 20, 20);
   }
}