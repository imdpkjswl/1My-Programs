import javax.swing.*;  
public class simple_textfield {
	public static void main(String[] args) { 
		
		    JFrame frame = new JFrame("TextField");  
		    JTextField t1,t2;  
		    
		    t1=new JTextField("First TextField");  
		    t1.setBounds(50,100, 200,30);  
		    t2=new JTextField("Second TextField");  
		    t2.setBounds(50,150, 200,30);  
		    
		    frame.add(t1); 
		    frame.add(t2);  
		    
		    frame.setSize(400,400);  
		    frame.setLayout(null);  
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
	    
	    
	 }  
}
