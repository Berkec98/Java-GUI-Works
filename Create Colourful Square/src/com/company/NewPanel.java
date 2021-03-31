package com.company;
import java.awt.*;
import javax.swing.*;
// This program create a green square into the white backgorund.

    class NewPanel extends JPanel  {

        public NewPanel() // Create a class.
        {
            this.setBackground (Color.white);
        } // I created a JPanel and I set background's color is white.

        public void paintComponent (Graphics g)
        {
            super.paintComponent (g); //This help me the colour and shape of square.

            g.setColor(Color.GREEN); // It makes square's colour is green.
            g.fillRect (10,10,90,90); // Size and coordinate of square.

        }


        }








