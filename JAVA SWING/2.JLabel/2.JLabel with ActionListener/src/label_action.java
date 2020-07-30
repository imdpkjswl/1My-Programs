import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class label_action {
	public static void main(String[] args) {
    	
    	JFrame frame = new JFrame("Find Your IP");
    	JLabel label = new JLabel();
    	JTextField tf = new JTextField("www.google.com");
    	JButton btn = new JButton("Find IP");
    	
    	tf.setBounds(180,50,150,20);
    	label.setBounds(180,70, 250,30);       
        btn.setBounds(190,100,80,20);
        // Add to container
        frame.add(tf);
        frame.add(btn);
        frame.add(label);
        
        // performing action on button click
 		btn.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent event) {
 				try {  
 			         String host = tf.getText(); 
 			         String ip = java.net.InetAddress.getByName(host).getHostAddress();  
 			         label.setText("IP of "+host+" is: "+ip);  
 			        
 			        } catch(Exception ex) { System.out.println(ex); }  
 			}
 		});
        
    
 	
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}  