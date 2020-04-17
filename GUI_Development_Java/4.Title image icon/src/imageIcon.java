import javax.swing.*;
import java.awt.*;

public class imageIcon {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creating frame.
        frame.setVisible(true); // Showing frame.

        frame.setTitle("My Frame"); // Used to set title of frame.
        frame.setSize(700,500); // Setting size of window.
        frame.setLocation(300,100); // Used to set location of window, when window gets open.
        frame.setBounds(100,100,1000,500); // Setting window width and height.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Used to closed program, whenever we close th window.

        Container c = frame.getContentPane(); // frame contain content pane.i.e. Here knowing object of Container.
        c.setBackground(Color.GRAY);

        ImageIcon icon = new ImageIcon("dj.jpg"); // Setting image icon
        frame.setIconImage(icon.getImage()); // ImageIcon get converted into image.

        // Restrict user to resize frame
        frame.setResizable(false); // False shows restriction.

    }
}
