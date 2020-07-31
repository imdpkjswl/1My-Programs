import javax.swing.*; 

public class password_field {
	   
	public static void main(String[] args) {    
	    JFrame frame = new JFrame("Password Field Demo");    
	     JPasswordField pass = new JPasswordField();
	     JLabel label = new JLabel("Password:");    
	        
	     label.setBounds(20,100, 80,30);    
	     pass.setBounds(100,100,100,30);    
	            
	     frame.add(pass); 
	     frame.add(label);  
	
	     
	     frame.setSize(300,300);    
	     frame.setLayout(null);    
	     frame.setVisible(true);
	    
	}  
}
