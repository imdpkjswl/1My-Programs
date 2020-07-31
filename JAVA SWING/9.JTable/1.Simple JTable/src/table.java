import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener; 

public class table {
	   
	public static void main(String[] args) {    
	    JFrame frame = new JFrame("JTable Demo");
	    String[] col = 			{"SEM", 	"USN",  		"NAME", 		"GPA"};
	    String[][] data = {
					    		{"I",  		"1A18CS010",	"DEEPAK J",	   "8.15"},
					    		{"II",  	"1A18CS010",	"DEEPAK J",    "8.20"},
					    		{"III", 	"1A18CS010",	"DEEPAK J",    "8.20"},
					    		{"IV",   	"1A18CS010",	"DEEPAK J",    "8.21"},
	    };
	    
	    // Create table and assign row and column
        JTable table = new JTable(data, col);
        
         JScrollPane sp = new JScrollPane(table);    
         sp.setBounds(0,0,290,200);
         frame.add(sp);
         
         
         // Make action
         table.setCellSelectionEnabled(true);  
         ListSelectionModel select = table.getSelectionModel();  
         // NOT WORKING : SelectionMode(ListSelectionModel.SINGLE_SELECTION);  
         select.addListSelectionListener(new ListSelectionListener() {  
        	 @Override
        	 public void valueChanged(ListSelectionEvent e) {  
             String Data = null;  
             int[] rows = table.getSelectedRows();  
             int[] columns = table.getSelectedColumns();  
             
             
             for (int i = 0; i < rows.length; i++) {  
            	 for (int j = 0; j < columns.length; j++) {  
            		 Data = (String) table.getValueAt(rows[i], columns[j]);  
            	 } 
             }  
             System.out.println("Table element selected is: " + Data);    
           }
        	 
         });  
	     
	    
	     frame.setSize(300,400);    
	     frame.setLayout(null);    
	     frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
}
