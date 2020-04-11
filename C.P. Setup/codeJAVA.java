

import javax.swing.*;

class codeJAVA {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("My Frame");
		
		JRadioButton jr1 = new JRadioButton("Male");
		jr1.setBounds(50, 100, 70, 30);
		jf.add(jr1);
		
		JRadioButton jr2 = new JRadioButton("Female");
		jr2.setBounds(50,140,70,30);
		jf.add(jr2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		
		

	}

}
