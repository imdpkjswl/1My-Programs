import javax.swing.*;  
import java.awt.event.*;  
public class simple_calc { 
      
		public static void main(String[] args) {  
    
		JFrame frame = new JFrame("Simple Calc");
		JTextField t1 = new JTextField("Enter first number");
		JTextField t2 = new JTextField("Enter second number");
		JLabel result = new JLabel();
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JLabel label = new JLabel();
		
		
		// set boundaries
		t1.setBounds(100,50,100,30);
		t2.setBounds(100,100,100,30);
		result.setBounds(100,150,100,30);
		btn1.setBounds(90,200,50,30);
		btn2.setBounds(155,200,50,30);
		label.setBounds(100,13,200,40);
		
		label.setText("ADDITION & SUBTRACTION");
		
		// add to main container
		frame.add(t1);
		frame.add(t2);
		frame.add(result);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(label);
	
		
		// Actions on click
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 	String s1 = t1.getText();  
			        String s2 = t2.getText();  
			        int a=Integer.parseInt(s1);  
			        int b=Integer.parseInt(s2);  
			        int c=0;  
			        // identifying button
			        if(e.getSource()==btn1){  
			            c=a+b;  
			        }else if(e.getSource()==btn2){  
			            c=a-b;  
			        }  
			        String solution = String.valueOf(c);  
			        result.setText(solution);  
				
			}
			
		});
		
		// Try later to remove this extra codes
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 	String s1 = t1.getText();  
			        String s2 = t2.getText();  
			        int a=Integer.parseInt(s1);  
			        int b=Integer.parseInt(s2);  
			        int c=0;  
			        // identifying button
			        if(e.getSource()==btn1){  
			            c=a+b;  
			        }else if(e.getSource()==btn2){  
			            c=a-b;  
			        }  
			        String solution = String.valueOf(c);  
			        result.setText(solution);  
				
			}
			
		});
		
		
		// set frame property
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		} 
	}  