// These app helps you to create teams with members.

package com.company;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


import javax.swing.*;
public class Teams extends JFrame {
    String teams[] = {"Team 1 ", " Team 2 " };
    String members[][] = {{"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},};

    public Teams(String title) {

        super(title);
        addWindowListener(new WindowAdapter() { });
        setVisible(true);
        init();
        pack();  }
    private void init() {
        JTable table = new JTable(members, teams);
        JScrollPane pane = new JScrollPane(table);
        getContentPane().add(pane);
    }
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}