import javax.swing.*;
import java.awt.*;

public class myPasswordField {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creating frame.
        frame.setVisible(true); // Showing frame.

        frame.setTitle("My Frame"); // Used to set title of frame.
        frame.setBounds(100,100,700,400); // Setting window width and height.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Used to closed program, whenever we close th window.

        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,100,30);

        Font f = new Font("Arial",Font.BOLD,30);
        pass.setFont(f);

        pass.setBackground(Color.YELLOW);
        pass.setForeground(Color.RED);


        c.add(pass);


    }
}
