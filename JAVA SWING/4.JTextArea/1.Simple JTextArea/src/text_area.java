import javax.swing.*;

public class text_area {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("TextArea Demo");
		JTextArea ta = new JTextArea();
		JLabel label = new JLabel();
		
		label.setBounds(120,70,100,30);
		ta.setBounds(120,100,300,100);
		label.setText("Write something");
		ta.append("Hi there");
		frame.add(ta);
		frame.add(label);
		
		
		
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

}
