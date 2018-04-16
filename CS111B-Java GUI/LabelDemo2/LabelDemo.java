//********************************************************************
//  LabelDemo.java       Author: mohamed/saada
//
//  Demonstrates the use of image icons in labels.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class LabelDemo
{
   //-----------------------------------------------------------------
   //  Creates and displays the primary application frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Label Demo 2.0");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      ImageIcon icon = new ImageIcon ("Label.jpg");

      JLabel label1, label2, label3, label4;

      label1 = new JLabel ("Label Right", icon, SwingConstants.CENTER);
      label1.setHorizontalTextPosition (SwingConstants.LEFT);
      label1.setVerticalTextPosition (SwingConstants.CENTER);

      label2 = new JLabel ("Label Left", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.RIGHT);
      label2.setVerticalTextPosition (SwingConstants.CENTER);

      label3 = new JLabel ("label Above", icon, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);

      label4 = new JLabel ("label Above", icon, SwingConstants.CENTER);
      label4.setHorizontalTextPosition (SwingConstants.CENTER);
      label4.setVerticalTextPosition (SwingConstants.TOP);



      JPanel panel = new JPanel();
      panel.setBackground (Color.white);
      panel.setPreferredSize (new Dimension (700, 900));
      panel.add (label1);
      panel.add (label2);
      panel.add (label3);
      panel.add (label4);


      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
