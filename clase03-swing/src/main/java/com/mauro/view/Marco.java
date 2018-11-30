package com.mauro.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Marco {

	private JFrame frame;
	private JPanel panel;
	private JButton btnSignIn;
	private JLabel lblUsername;
	private JTextField txtUsername;
	private JLabel lblPassword;
	private JPasswordField txtPassword;

	public Marco() {
		frame = new JFrame("login");
		frame.setBounds(850, 90, 400, 570);

		panel = new JPanel();
		panel.setBackground(new Color(92, 172, 235));
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		lblUsername = new JLabel("Username: ");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(60, 50, 150, 30); 
		panel.add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setBounds(60, 80, 250, 20);
		panel.add(txtUsername);

		lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(60, 120, 150, 30);
		panel.add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(60, 150, 250, 20);
		panel.add(txtPassword);

		btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(150, 280, 100, 20);
		panel.add(btnSignIn);
	}

	public static void main(String[] args) {
		Marco marco = new Marco();
		marco.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.frame.setVisible(true);
	}
}
