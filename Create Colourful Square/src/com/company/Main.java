package com.company;
// Created by Berke Cakirlar
import javax.swing.*;

public class Main {
    public static void main (String[] argv)
    {
        // Create an instance of NewFrame
        JFrame f = new JFrame ();

        // Set the title and other parameters.
        f.setTitle ("Assignment 7..");
        f.setResizable (true);
        f.setSize (500, 500);

        // Create and add the panel.
        NewPanel panel = new NewPanel ();
        f.getContentPane().add (panel);

        // Show the frame.
        f.setVisible (true);

    }
}

