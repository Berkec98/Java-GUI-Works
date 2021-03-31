package com.company;
import javax.swing.JFrame;

    class SwingDemo extends JFrame {
        private javax.swing.JLabel jLabel = null;
        private javax.swing.JLabel jjLabel = null;
        private javax.swing.JButton jButton = null;
        private javax.swing.JTextField jTextField = null;

        public SwingDemo() {
            super();
            this.setSize(600, 250);
            this.getContentPane().setLayout(null);
            this.add(getJLabel(), null);
            this.add(getJButton(), null);
            this.add(getJTextField(), null);
            this.setTitle("Nice to meet you!");

        }

        private javax.swing.JLabel getJLabel() {
            if (jLabel == null) {
                jLabel = new javax.swing.JLabel();
                jLabel.setBounds(34, 49, 183, 18);
                jLabel.setText("Your Name and Surname");

            } return jLabel;

        }
        private javax.swing.JTextField getJTextField() {
            if (jTextField == null) {
                jTextField = new javax.swing.JTextField();
                jTextField.setBounds(195, 49, 210, 20);
            }
            return jTextField;
        }
        private javax.swing.JButton getJButton() {
            if (jButton == null) {
                jButton = new javax.swing.JButton();
                jButton.setBounds(195, 110, 71, 27);
                jButton.setText("I AM");
            }
            return jButton; }}

