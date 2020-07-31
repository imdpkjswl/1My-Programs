import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class list {

	public static void main(String[] args) {

		JFrame frame = new JFrame("List");
		JButton btn = new JButton("Show");
		JLabel label = new JLabel();
		
		DefaultListModel<String> str = new DefaultListModel<>();  
        str.addElement("Item1");
        str.addElement("Item2");
        str.addElement("Item3");
        str.addElement("Item4");
        str.addElement("Item5");
        str.addElement("Item6");
		
        JList<String> list = new JList<>(str);
		
        list.setBounds(50,20, 200,140);
        btn.setBounds(100,250,80,20);
		
         frame.add(btn);
		 frame.add(list);
		 frame.add(label);
		 
		 // make action
		 btn.addActionListener(new ActionListener() {  
			 @Override
			 public void actionPerformed(ActionEvent e) {   
                String data = "";  
                if (list.getSelectedIndex() != -1) {                       
                   data = "Selected item:  " + list.getSelectedValue();   
                   label.setText(data);  
                }  
                  
             }
          });   
		
		
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
