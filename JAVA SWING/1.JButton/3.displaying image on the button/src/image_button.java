import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class image_button {
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Image Button");
		JButton btn = new JButton(new ImageIcon("D:\\#CODE SECTION\\1My-Programs\\JAVA SWING\\1.JButton\\3.displaying image on the button\\src\\btn.png"));
		
		btn.setBounds(100,100,100,40); // (X,Y,WIDTH,HEIGHT)
		
		frame.add(btn);
		
		// show result on button action 
		JLabel label = new JLabel();
		label.setBounds(115, 70, 180, 30);
		frame.add(label);
		
		// performing action on button click
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				label.setText("Image clicked");
			}
		});
		
		frame.setSize(400, 350);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
