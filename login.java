package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class login extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel username = new JLabel();
	JLabel password = new JLabel();
	JLabel message = new JLabel();
	
	JTextField user = new JTextField();
	JPasswordField pass = new JPasswordField(); 
	
	JButton login = new JButton();JButton Signup = new JButton();
	JButton forget = new JButton();
	
	HashMap <String, String> loginInfo = new HashMap<String, String>();
	
	login(HashMap <String,String> loginInfoOriginal){
		
		loginInfo = loginInfoOriginal;
		
		username.setText("Username");
		username.setBounds(50, 100, 100, 25);
		
		password.setText("Password");
		password.setBounds(50, 150, 100, 25);
		
		user.setBounds(175, 100, 180, 25);
		pass.setBounds(175, 150, 180, 25);
		
		login.setBounds(270, 200, 90, 30);
		login.setText("Login"); login.setFocusable(false);
		login.setBackground(Color.green);
		login.addActionListener(this);
		
		Signup.setBounds(175, 200, 90, 30);
		Signup.setText("Signup"); Signup.setFocusable(false);
		Signup.setBackground(Color.GREEN);
		Signup.addActionListener(this);
		
		forget.setBounds(10, 200, 150, 30);
		forget.setText("Forget Password ?");
		forget.setBorderPainted(false);
		forget.setFocusable(false);
		forget.setForeground(Color.BLUE);
		forget.setBackground(Color.WHITE);
		
		
		frame.setSize(450, 450);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		frame.add(username); frame.add(user);
		frame.add(password); frame.add(pass);
		frame.add(login); frame.add(Signup);
		frame.add(forget); frame.add(message);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Signup) {
			user.setText("");
			pass.setText("");
			
		}
		
		if(e.getSource()==login) {
			
			String Username = user.getText();
			String Password = String.valueOf(pass.getPassword());
			
			if(loginInfo.containsKey(Username)) {
				
				if(loginInfo.containsValue(Password)) {
					
					message.setBounds(100, 100, 200, 200);
					message.setText("Login Sucessfull");
					message.setForeground(Color.GREEN);
					
					frame.dispose();
					new WelcomePage();
				}
				else {
					message.setBounds(100, 100, 200, 200);
					message.setText("Incorrect Password");
					message.setForeground(Color.RED);
				}
			}
		}
		
	}

}
