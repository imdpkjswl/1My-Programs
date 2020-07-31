import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class notepad_menu {

	public static void main(String[] args) {
		
        JFrame frame = new JFrame("Menu and MenuItem Demo");  
          
        JMenu menu = new JMenu("File");  
        JMenu subMenu = new JMenu("Sub Menu");   
        JMenuBar menuBar = new JMenuBar(); // allocate menu at top
        JMenu edit = new JMenu("Edit"); // create second menu
        JMenu help = new JMenu("Help"); // create second menu
        
        // Create item box
        JMenuItem i1 = new JMenuItem("Item 1");  
        JMenuItem i2 = new JMenuItem("Item 2");  
        JMenuItem i3 = new JMenuItem("Item 3");  
        JMenuItem i4 = new JMenuItem("Item 4");  
        JMenuItem i5 = new JMenuItem("Item 5"); 
        
        
        
        // Add to File menu
        menu.add(i1); 
        menu.add(i2); 
        menu.add(i3);
        
        // Add to File-subMenu
        subMenu.add(i4); 
        subMenu.add(i5);  
        
        menu.add(subMenu); // add subMenu into main menu.  
        menuBar.add(menu);// add main menu to frame.   
        
        
        // Add others menu item
        JMenuItem i6 = new JMenuItem("Cut");  
        JMenuItem i7 = new JMenuItem("Copy");  
        JMenuItem i8 = new JMenuItem("Paste");
        JMenuItem i9 = new JMenuItem("selectAll");
        // Add to Edit menu
        edit.add(i6); 
        edit.add(i7); 
        edit.add(i8);
        edit.add(i9);
        
        // Add other menus into menuBar
        menuBar.add(edit);
        menuBar.add(help);
        
        
        // Create area to write text
        JTextArea ta = new JTextArea();    
        ta.setBounds(5,5,473,428);
        
        frame.setJMenuBar(menuBar); // add menuBar into frame.
        frame.add(ta);
        
        
        // make action on copy item
        i7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == i7)    
					ta.copy(); // copied text-area data
				JOptionPane.showMessageDialog(frame,"Copied"); // show message
				
				
				 // can be implement for others
			/*		if(e.getSource() == i6)    
						ta.cut();    
					if(e.getSource() == i8)    
						ta.paste();      
					if(e.getSource() == i9)    
						ta.selectAll();		*/
				
			}
        	
        });
        
        frame.setSize(500,500);  
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
