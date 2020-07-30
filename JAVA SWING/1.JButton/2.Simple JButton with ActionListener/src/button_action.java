import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class button_action {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Button Action");
		JButton btn = new JButton("Click Me");
		//JTextField text = new JTextField();
		JLabel text = new JLabel();
		
		text.setBounds(100, 50, 190, 30);
		frame.add(text);
		
		btn.setBounds(100,80,100,25);
		frame.add(btn);
		
		// make action
		btn.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				text.setText("Button clicking action performed");
			}
			
		}); 
		
		
		// Basic frame codes
		frame.setSize(400, 350);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
