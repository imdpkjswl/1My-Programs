package demoDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import com.mysql.*;

public class registration extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField email;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 509);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);// new BorderLayout(0, 0)
		setContentPane(contentPane);
		
		user = new JTextField();
		user.setBackground(UIManager.getColor("Button.background"));
		user.setFont(new Font("Tahoma", Font.PLAIN, 18));
		user.setBounds(25, 92, 255, 34);
		contentPane.add(user);
		user.setColumns(10);
		
		email = new JTextField();
		email.setBackground(UIManager.getColor("Button.background"));
		email.setFont(new Font("Tahoma", Font.PLAIN, 18));
		email.setColumns(10);
		email.setBounds(25, 174, 255, 34);
		contentPane.add(email);
		
		pass = new JTextField();
		pass.setBackground(UIManager.getColor("Button.background"));
		pass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pass.setColumns(10);
		pass.setBounds(25, 247, 255, 34);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(27, 63, 98, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(25, 150, 100, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(25, 222, 100, 24);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String url = "jdbc:mysql://localhost:3306/testing?useSSL=false&serverTimezone=UTC";
					String dbUser = "root";
					String dbPass = "";
					// Load driver class of mysql database
					Class.forName("com.mysql.cj.jdbc.Driver");  //("com.mysql.jdbc.Driver");
					// Do connection
					Connection conn = DriverManager.getConnection(url,dbUser,dbPass);
					
					PreparedStatement ps = conn.prepareStatement("insert into user(user_name,user_email,user_password) values(?,?,?);");
					ps.setString(1, user.getText());
					ps.setString(2, email.getText());
					ps.setString(3, pass.getText());
					
					int x = ps.executeUpdate();
					if(x > 0)
						System.out.println("Registration done successfully...");
					else
						System.out.println("Registration failed...");
					
				} catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(25, 302, 98, 34);
		contentPane.add(btnNewButton);
	}
}
