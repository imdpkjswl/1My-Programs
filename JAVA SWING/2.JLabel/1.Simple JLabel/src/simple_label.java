import javax.swing.*;

public class simple_label {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JLabel");
		JLabel label1 = new JLabel("First Label");
		JLabel label2 = new JLabel("Second Label");
		
		label1.setBounds(100,100,150,30);
		label2.setBounds(100,120,150,30);
		
		frame.add(label1);
		frame.add(label2);
		
		
		frame.setSize(400,350);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		

	}

}
