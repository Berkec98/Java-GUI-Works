package mwme;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Meeting {

	private JFrame frmMeetWithMe;

	/**
	 To see the source and design below, open the .java file with the WindowBuilder Editor using openwith.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meeting window = new Meeting();
					window.frmMeetWithMe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Meeting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeetWithMe = new JFrame();
		frmMeetWithMe.setAutoRequestFocus(false);
		frmMeetWithMe.setResizable(false);
		frmMeetWithMe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp kasa\\Desktop\\hands.png"));
		frmMeetWithMe.setBackground(Color.LIGHT_GRAY);
		frmMeetWithMe.setFont(new Font("Vrinda", Font.BOLD, 15));
		frmMeetWithMe.setTitle("Meet with Me");
		frmMeetWithMe.getContentPane().setForeground(Color.WHITE);
		frmMeetWithMe.setBounds(500,500, 498, 441);
		frmMeetWithMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMeetWithMe.getContentPane().setLayout(null);
		
		JButton btnWho = new JButton("Who am I?");
		btnWho.setBackground(Color.WHITE);
		btnWho.setForeground(Color.BLACK);
		btnWho.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnWho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnWho, "My name is Berke Cakirlar.","Answer",3);
			}
		});
		btnWho.setBounds(34, 10, 192, 83);
		frmMeetWithMe.getContentPane().add(btnWho);
		
		JButton btnHowOldAm = new JButton("How old am I?");
		btnHowOldAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnHowOldAm, "I am 23 years old.","Answer",3);
			}
		});
		btnHowOldAm.setForeground(Color.BLACK);
		btnHowOldAm.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnHowOldAm.setBackground(Color.WHITE);
		btnHowOldAm.setBounds(270, 10, 192, 83);
		frmMeetWithMe.getContentPane().add(btnHowOldAm);
		
		JButton btnUniversity = new JButton("Which University?");
		btnUniversity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnUniversity, "I am at Kadir Has University.","Answer",3);
			}
		});
		btnUniversity.setForeground(Color.BLACK);
		btnUniversity.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnUniversity.setBackground(Color.WHITE);
		btnUniversity.setBounds(34, 104, 192, 88);
		frmMeetWithMe.getContentPane().add(btnUniversity);
		
		JButton btnLive = new JButton("Where do you live?");
		btnLive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnLive, "I am living in Kadikoy,Istanbul","Answer",3);
			}
		});
		btnLive.setForeground(Color.BLACK);
		btnLive.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnLive.setBackground(Color.WHITE);
		btnLive.setBounds(270, 104, 192, 88);
		frmMeetWithMe.getContentPane().add(btnLive);
		
		JButton btnFrom = new JButton("Where are you from?");
		btnFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnFrom,"I am from Turkey.", "Answer", 3);
			}
		});
		btnFrom.setForeground(Color.BLACK);
		btnFrom.setFont(new Font("Book Antiqua", Font.BOLD, 14));
		btnFrom.setBackground(Color.WHITE);
		btnFrom.setBounds(34, 203, 192, 88);
		frmMeetWithMe.getContentPane().add(btnFrom);
		
		JButton btnLanguage = new JButton("Which language is best?");
		btnLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnLanguage, "English for speaking, java for programming :)","Answer",3);
			}
		});
		btnLanguage.setForeground(Color.BLACK);
		btnLanguage.setFont(new Font("Book Antiqua", Font.BOLD, 14));
		btnLanguage.setBackground(Color.WHITE);
		btnLanguage.setBounds(270, 203, 192, 83);
		frmMeetWithMe.getContentPane().add(btnLanguage);
		
		JButton btnEmail = new JButton("What is your e-mail?");
		btnEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnEmail, "berke_cakirlar@hotmail.com","Answer",3);
			}
		});
		btnEmail.setForeground(Color.BLACK);
		btnEmail.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnEmail.setBackground(Color.WHITE);
		btnEmail.setBounds(34, 304, 192, 88);
		frmMeetWithMe.getContentPane().add(btnEmail);
		
		JButton btnAdvice = new JButton("Give me an Advice");
		btnAdvice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(btnAdvice, "Never Stop Loving Yourself!!!","My advice is...",1);
			}
		});
		btnAdvice.setForeground(Color.BLACK);
		btnAdvice.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		btnAdvice.setBackground(Color.WHITE);
		btnAdvice.setBounds(270, 304, 192, 88);
		frmMeetWithMe.getContentPane().add(btnAdvice);
	}
}
