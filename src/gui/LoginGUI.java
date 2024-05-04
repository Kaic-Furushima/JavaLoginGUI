package gui;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import constants.CommonConstants;

public class LoginGUI extends JFrame{
	public LoginGUI(){
		super(CommonConstants.APP_NAME);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
		setResizable(false);
		setLocationRelativeTo(null);
		
		addGUIComponents();
		
	}
	
	public void addGUIComponents() {
		SpringLayout springLayout = new SpringLayout();
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(springLayout);
		
		// Usuário
		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
		usernameField.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, SpringLayout.WEST, loginPanel);
		springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, loginPanel);
		springLayout.putConstraint(SpringLayout.WEST, usernameField, 135, SpringLayout.WEST, loginPanel);
		springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, loginPanel);
		
		loginPanel.add(usernameLabel);
		loginPanel.add(usernameField);
		
		// Senha
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JPasswordField passwordField = new JPasswordField(CommonConstants.TEXTFIELD_SIZE);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordField);
		
		springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
		springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);
		
		// Login Button
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				
				if(username.equals("username") && password.equals("password")) {
					System.out.println("Login feito com sucesso");
					dispose();
				} else {
					System.out.println("Usuário ou senha incorreto(s)");
				}
				
				
			}
		});
		
		
		springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, loginPanel);
		springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, loginPanel);
		
		loginPanel.add(loginButton);
		
		this.getContentPane().add(loginPanel);
		
	}

}
