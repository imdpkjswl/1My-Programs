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

        ImageIcon icon = new ImageIcon("me.png");

        // Setting image in JLabel
        JLabel label = new JLabel(icon);
        label.setBounds(100,50,icon.getIconHeight(),icon.getIconWidth());

        c.add(label); // Putting in container



    }
}
