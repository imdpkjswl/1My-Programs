import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creating frame.
        frame.setVisible(true); // Showing frame.

        frame.setTitle("My Frame"); // Used to set title of frame.
        frame.setBounds(100,100,1000,500); // Setting window width and height.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Used to closed program, whenever we close th window.

        Container c = frame.getContentPane();
        c.setLayout(null);

        // Creating Radio Button
        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100,50,100,40);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200,50,100,40);

        // For not selecting both at a time
        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);

        //  For disable button
        radio1.setEnabled(false);

        c.add(radio1);
        c.add(radio2);
    }
}
