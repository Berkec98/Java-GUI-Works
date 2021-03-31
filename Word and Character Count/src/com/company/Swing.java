package com.company;

import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;   // These are my components.
    private JTextField textField;
    private JTextField wordField;
    private JTextField characterField3;
    private JButton clearButton;
    private JButton exitButton;

    public Swing() {

        clearButton.addActionListener(new ActionListener() {  // I add action listener to my clear button.
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");  // If we touch clear button, field's texts will be empty.
                wordField.setText("");
                characterField3.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() { // I add action listener to my exit button.
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            } // If we touch exit button, we will exit the system.
        });
        textField.addKeyListener(new KeyAdapter() { // I add key listener to my text field.
            @Override
            public void keyTyped(KeyEvent e) {
                cccount(textField.getText()); // If I writing something, use cccount method with textfield's text parameter.
            }
        });
    }

    private void cccount(String text) { // I assign cccount method to calculate words and characters.
        int wordc = text.split("\\s").length; // It calculates words, if we write new word; wordc will be increased by 1
        int charc = text.trim().length(); // It calculate length of text.
        wordField.setText("" + wordc); // The wordfield text will be int wordc.
        characterField3.setText("" + (charc-wordc+2)  ); // This formula gives me number of character.
    }


    public static void main(String[] args) { // I generate form main()
        JFrame frame = new JFrame("Typing..."); // This is my title.
        frame.setContentPane(new Swing().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // It causes the application to exit when the application receives a close window event from the operating system.
        frame.pack(); // The pack method sizes the frame so that all its contents are at or above their preferred sizes.
        frame.setVisible(true); // Makes the window visible with the true parameter.
    }


}





