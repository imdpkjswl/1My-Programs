import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;  

public class combo_box {
	
	public static void main(String[] args) {    
		
		String country[] = {"India", "Canada", "USA", "England", "Newzealand"};
		JFrame frame = new JFrame("ComboBox Selector");        
	    JComboBox<String> comboBox = new JComboBox<>(country); // Generic used
	    JButton btn = new  JButton("Show");
	    JLabel label = new JLabel();
	    
	    comboBox.setBounds(50, 110,120,25);
	    btn.setBounds(50,150,90,25);
	    label.setBounds(50,60,200,25);
	    
	    // methods in comboBox
	    comboBox.addItem("China");
	    comboBox.removeItem("China");
	    comboBox.setEditable(true);
	    comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText(comboBox.getItemAt(comboBox.getSelectedIndex()));
			}
	    });
	    
	    
	    frame.add(comboBox);
	    frame.add(btn);
	    frame.add(label);
	    
	    // make action
	    btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = comboBox.getItemAt(comboBox.getSelectedIndex());  
				label.setText("You have selected: "+msg);
			}
	    	
	    });
	    
	    
	    frame.setLayout(null);    
	    frame.setSize(400,350);    
	    frame.setVisible(true);   
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
		
		}

}
