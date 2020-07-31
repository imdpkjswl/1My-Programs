import javax.swing.*;

public class menu {

	public static void main(String[] args) {
		
        JFrame frame = new JFrame("Menu and MenuItem Demo");  
          
        JMenu menu = new JMenu("Menu");  
        JMenu subMenu = new JMenu("Sub Menu");   
        JMenuBar menuBar = new JMenuBar(); // allocate menu at top
        JMenu v = new JMenu("View");
        
        // Create item box
        JMenuItem i1 = new JMenuItem("Item 1");  
        JMenuItem i2 = new JMenuItem("Item 2");  
        JMenuItem i3 = new JMenuItem("Item 3");  
        JMenuItem i4 = new JMenuItem("Item 4");  
        JMenuItem i5 = new JMenuItem("Item 5");  
        
        // Add to main menu
        menu.add(i1); 
        menu.add(i2); 
        menu.add(i3);
        
        // Add to subMenu
        subMenu.add(i4); 
        subMenu.add(i5);  
        
        menu.add(subMenu); // add subMenu into main menu.  
        menuBar.add(menu);// add main menu to frame.   
        menuBar.add(v);
        
        frame.setJMenuBar(menuBar); // add menuBar into frame.  
        
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
