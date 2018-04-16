import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    1. create a frame
    2. add panel to frame
    3. create random numbers and fill the arrays
    4. draw the rectangles representing the numbers in the array
    5. sort the array on button press
    6. repeat 4-5 until sorted
 */

/**
 * Visually demonstrates two sorting techniques (selection & insertion) using graphics
 * @author Boris Alguliev
 * @author Mohamed Saada
 * @version 4.3.2.1
 * @since 2017-05-02.
 */
public class TwoSorts
{
    private static boolean debug = false;

    public static void main (String[] args)
    {
        JFrame frame = new JFrame("Sorting Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SortPanel ());

        frame.pack();
        frame.setVisible(true);

        if (args.length > 0 && args[0].equals("debug"))
            debug = true;
    }

    private static class SortPanel extends JPanel
    {
        // arrays for random numbers and boolean array for unique number storage
        private static int index;
        private static int[] listSel,
                             listIns;
        private static boolean[] used;

        // selection sort variables
        private static int min;
        private static int temp;

        // insertion sort variables
        private static int key;
        private static int position;

        private JButton button;



        public SortPanel()
        {
            min = 0;
            index = 0;
            listSel = new int[12];
            listIns = new int[12];
            used = new boolean[31];

            button = new JButton("Sort");
            button.addActionListener(new SortListener());
            add (button);

            setBackground(Color.white);
            setPreferredSize(new Dimension(500,400));

            // fills the array with unique random numbers
            for (int i = 0; i < listSel.length; i++)
            {
                int num;

                do {
                    num = (int) (Math.random() * 21 + 10); // a number between 10 and 30
                } while (used[num]);

                listSel[i] = num;
                listIns[i] = num;
                used[num] = true;
            }
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            for (int i = 0; i < listSel.length; i++)
            {
                int xPos = 50 + 20 * i;

                // draws rectangles for selection sort, and values stored in the array above each rectangle
                g.setColor(Color.pink);
                g.fillRect(xPos, 200 - (listSel[i] * 2), 10, listSel[i] * 2);
                g.drawString(listSel[i] + "", xPos, 190 - (listSel[i] * 2));

                // draws rectangles for insertion sort, and values stored in the array above each rectangle
                g.setColor(Color.green);
                g.fillRect(xPos, 210, 10, listIns[i] * 2);
                g.drawString(listIns[i] + "", xPos, 230 + listIns[i] * 2);
            }

            // key to know which is which
            g.drawString("Insertion", 300, 220);
            g.setColor(Color.pink);
            g.drawString("Selection", 300, 200);
        }

        // sorts the array once using the selection sorting algorithm
        public void selectionSortOnce ()
        {
            if (index < listSel.length -1)
            {
                min = index;

                for (int scan = index + 1; scan < listSel.length; scan++)
                    if (listSel[scan] < listSel[min])
                        min = scan;

                // Swap the values
                temp = listSel[min];
                listSel[min] = listSel[index];
                listSel[index] = temp;
            }
        }

        // sorts the array once using the insertion sorting algorithm
        public void insertionSortOnce ()
        {
            if (index + 1 <listIns.length)
            {
                key = listIns[index + 1];
                position = index + 1;

                //  Shift larger values to the right
                while (position > 0 && key < listIns[position-1])
                {
                    listIns[position] = listIns[position-1];
                    position--;
                }

                listIns[position] = key;
            }
        }

        private class SortListener implements ActionListener
        {
            /**
             * Invoked when an action occurs.
             * Sorts the array once using each algorithm and redraws the rectangles
             * @param e Action event generated by button press
             */
            @Override
            public void actionPerformed(ActionEvent e)
            {
                selectionSortOnce();
                insertionSortOnce();
                repaint();
                index++;

                // sets button text when sorting is complete
                if (index >= listIns.length - 1)
                    button.setText("Done!");

                // prints values in console if program run with debug command line argument
                if (debug)
                {
                    for (int field : listSel)
                        System.out.print(field + " ");

                    System.out.print("\n");

                    for (int field : listIns)
                        System.out.print(field + " ");

                    System.out.print("\n\n");
                }
            }
        }
    }
}