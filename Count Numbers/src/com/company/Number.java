// It helps counting numbers to children. Written by Berke Cakirlar

package com.company;
import java.awt.*;
import java.awt.event.*;
public class Number extends Frame implements WindowListener,ActionListener {
    TextField text = new TextField(19);
    private int count = 0;
    Button button;

    public Number() { } // It can be empty.

    public Number(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        button = new Button("Touch it");
        add(button);
        add(text);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        count++;
        text.setText("Lets say " + count);
    }
    public void windowClosing(WindowEvent e) { // It helps closing the application.
        System.exit(0);
    }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}

}