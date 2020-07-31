import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class radio_button {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();    
	
		     
		JRadioButton r1 = new JRadioButton("A) Male");    
		JRadioButton r2 = new JRadioButton("B) Female");    
		r1.setBounds(75,50,100,30);    
		r2.setBounds(75,100,100,30);    
	
		// button group used to select one.
		ButtonGroup bg = new ButtonGroup();    
		bg.add(r1);bg.add(r2);    
		
		frame.add(r1);
		frame.add(r2);      
		
		// perform action
		JButton btn = new JButton("Click");
		btn.setBounds(80,145,80,22);
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) {
					JOptionPane.showMessageDialog(frame, "You are male.");
				}
				
				if(r2.isSelected()) {
					JOptionPane.showMessageDialog(frame, "You are female.");
				}
				
			}
			
		});
		
		
		frame.setSize(300,300);    
		frame.setLayout(null);    
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
