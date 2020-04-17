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

        // Text field
        JTextField  myText = new JTextField();
        myText.setBounds(100,50,200,30);

        // Changing font of jTextField
        Font f = new Font("Arial",Font.BOLD,25);
        myText.setFont(f);


        // Backgound color setting
        myText.setBackground(Color.YELLOW);

        // Font color changing
        myText.setForeground(Color.RED);
        c.add(myText);
    }
}
