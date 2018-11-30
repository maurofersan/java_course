package com.mauro.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblTexto;

	public Welcome() {
		frame = new JFrame("Welcome");
		frame.setBounds(10, 700, 500, 300);
		panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		lblTexto = new JLabel("Welcome to the real world!");
		lblTexto.setFont(new Font("Arial", Font.ITALIC, 50));
		lblTexto.setBounds(20, 140, 300, 50);
		panel.add(lblTexto);
	}
	public static void main(String...args) {
		Welcome welcome = new Welcome();
		welcome.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome.frame.setVisible(true);	
	}

}
