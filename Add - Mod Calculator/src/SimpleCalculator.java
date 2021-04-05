import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JButton ADDButton;
    private JButton MODButton;
    private JButton CLEARButton;
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public SimpleCalculator() {
        ADDButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText().trim();
                String num2 = num2Field.getText().trim();

                double result = Double.parseDouble(num1)+Double.parseDouble(num2);
                resultField.setText(result+"");


            }
        });


        MODButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText().trim();
                String num2 = num2Field.getText().trim();
                double result = Double.parseDouble(num1)%Double.parseDouble(num2);
                resultField.setText(result+"");

            }
        });
        CLEARButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                num1Field.setText("");
                num2Field.setText("");
                resultField.setText("");
            }
        });
    }
}
