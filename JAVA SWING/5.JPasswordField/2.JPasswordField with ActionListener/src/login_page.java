import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class login_page {
	   
	public static void main(String[] args) {    
	    JFrame frame = new JFrame("Simple Login Page");
	     JTextField user = new JTextField();
	     JPasswordField pass = new JPasswordField();
	     JLabel label1 = new JLabel("Username:");
	     JLabel label2 = new JLabel("Password:");
	     
	     JButton btn = new JButton("Login");
	     JLabel result = new JLabel();
	     
	        
	     label1.setBounds(20,35, 80,30);
	     label2.setBounds(20,100, 80,30);
	     user.setBounds(100,35,160,27);
	     pass.setBounds(100,100,160,27);    
	     btn.setBounds(130, 160, 85,27);
	     result.setBounds(80,200, 400,30);
	     
	     
	     frame.add(user);
	     frame.add(pass);
	     frame.add(label1);
	     frame.add(label2);  
	     frame.add(btn);
	     frame.add(result);
	     
	     btn.addActionListener(new ActionListener() {
	    	 
			@Override
			public void actionPerformed(ActionEvent e) {
				String u = user.getText();
				String p = new String(pass.getPassword()); // convert char array into string.
				
				result.setText("Successfully Login Completed");
				JOptionPane.showMessageDialog(frame,"Username: "+u+"\nPassword: "+p);
				result.setText(""); // make disappear result text after on click OK.
				
			}
	     });
	     
	     frame.setSize(450,350);    
	     frame.setLayout(null);    
	     frame.setVisible(true);
	     frame.setResizable(false);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     
	}  
}
