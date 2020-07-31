import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*; 

public class food_order {
	   
	public static void main(String[] args) {    
	    JFrame frame = new JFrame("Food Ordering System");    
	    JLabel ad = new JLabel("Order your food:");
	    		
	    ad.setBounds(100,35, 150,50);
	    JCheckBox checkBox1 = new JCheckBox("Coffee @ 10");  
        checkBox1.setBounds(100,70, 150,50);  
        JCheckBox checkBox2 = new JCheckBox("Pizza @ 99");  
        checkBox2.setBounds(100,100, 150,50);
        JCheckBox checkBox3 = new JCheckBox("Burger @ 59");  
        checkBox3.setBounds(100,130, 150,50);
        JLabel label = new JLabel();
        label.setBounds(80,40, 200,50);
        
         JButton btn = new JButton("Order Now");
         btn.setBounds(100,190, 100,25);
        
         frame.add(btn);
         frame.add(ad);
	     frame.add(checkBox1); 
	     frame.add(checkBox2);
	     frame.add(checkBox3);
	     frame.add(label);
	     

	     btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 float amount = 0;  
			     String msg = "";
			     
			     if(checkBox1.isSelected()) {
			    	amount += 10;
			    	msg += "Coffee: 10\n";
			     }
			     if(checkBox2.isSelected()) {
				    	amount += 99;
				    	msg += "Pizza: 99\n";
				     }
			     if(checkBox3.isSelected()) {
				    	amount += 59;
				    	msg += "Burger: 59\n";
				     }
			     
			     msg += ".....................\nTotal amount:  "+amount;
				
			     if(!checkBox1.isSelected() && !checkBox2.isSelected() && !checkBox3.isSelected()) {
			    	 JOptionPane.showMessageDialog(frame, "Please select atleast one item");
			     }
			     else {	 
			    	 int input = JOptionPane.showOptionDialog(null, msg, "Confirm Your Order", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			    	 if(input == JOptionPane.OK_OPTION)
			    	 {
			    		 JOptionPane.showMessageDialog(frame,"Successfully Order Placed","Order accomplishment",JOptionPane.WARNING_MESSAGE);
			    	 }else
			    	 {
			    		 JOptionPane.showMessageDialog(frame,"Order cancelled"); 
			    	 }
			     }
			}
	    	 
	     });
	     
	     frame.setSize(500,400);    
	     frame.setLayout(null);    
	     frame.setVisible(true);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}  
}
