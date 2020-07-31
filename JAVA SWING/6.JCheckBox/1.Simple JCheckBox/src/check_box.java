import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*; 

public class check_box {
	   
	public static void main(String[] args) {    
	    JFrame frame = new JFrame("CheckBox Demo");    
	     
	    JCheckBox checkBox1 = new JCheckBox("Python");  
        checkBox1.setBounds(100,70, 150,50);  
        JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,100, 150,50);
        JLabel label = new JLabel();
        label.setBounds(80,40, 200,50);
        
	     frame.add(checkBox1); 
	     frame.add(checkBox2);  
	     frame.add(label);
	     
	     checkBox1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
             
                if(e.getStateChange()==1)
                	label.setText("Python Checkbox: Checked");
                	else
                		label.setText("Python Checkbox: Unchecked");
                		
             }
 
          }); 
	     
	     frame.setSize(300,300);    
	     frame.setLayout(null);    
	     frame.setVisible(true);
	    
	}  
}
