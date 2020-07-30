import javax.swing.JButton;
import javax.swing.JFrame;

public class simple_button {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simple Button"); // set frame name 
		
		JButton btn = new JButton("Click here"); // set button name
		
		btn.setBounds(120,140,150, 40); // button configuration - (Xf, Yf, Xb, Yb).   
		
		frame.add(btn); // adding one component to another.
	
		frame.setSize(400, 350);
		frame.setLayout(null); // make frame layout null to showing button. 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		

	}

}
