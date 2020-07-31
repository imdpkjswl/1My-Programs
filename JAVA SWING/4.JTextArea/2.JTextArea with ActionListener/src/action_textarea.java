import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class action_textarea {
	
	public static void main(String[] args) {
	
		    JFrame frame = new JFrame("Words Counter");  
		    JLabel label1 = new JLabel();  
		    label1.setBounds(50,25,100,30);  
		    
		    JLabel label2 = new JLabel();  
		    label2.setBounds(160,25,100,30);  
		    
		    JTextArea area = new JTextArea();  
		    area.setBounds(20,75,250,200);
		    
		    JButton btn = new JButton("Count Words");  
		    btn.setBounds(100,300,120,30);  
		    
		    // Count characters and words
		    btn.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		 	String text = area.getText();  
		    		    String[] words = text.split("\\s");  
		    		    label1.setText("Words: "+ words.length);  
		    		    label2.setText("Characters: "+ text.length());
		    	}
		    });  
		    
		    
		    frame.add(label1);
		    frame.add(label2);
		    frame.add(area);
		    frame.add(btn);
		    
		    frame.setSize(450,450);  
		    frame.setLayout(null);  
		    frame.setVisible(true); 
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
