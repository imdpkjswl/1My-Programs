import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class jButton {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // Creating frame.
        frame.setVisible(true); // Showing frame.

        frame.setTitle("My Frame"); // Used to set title of frame.
        frame.setSize(700,500); // Setting size of window.
        frame.setLocation(300,100); // Used to set location of window, when window gets open.
        frame.setBounds(100,100,1000,500); // Setting window width and height.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Used to closed program, whenever we close th window.

        Container c = frame.getContentPane(); // frame contain content pane.i.e. Here knowing object of Container.
        c.setLayout(null);


    /*
        // setting image on button
        ImageIcon icon = new ImageIcon("me.jpg");

        // Creating Button
        JButton btn = new JButton(icon);
       // btn.setBounds(100,50,100,40);

        btn.setText("Button");

        // Keeping button size as the size of image size
        btn.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());

        */

        JButton btn = new JButton("Click");
        btn.setSize(100,40);
        btn.setLocation(100,50);

        // Creating JButton Font style and font size
        Font f = new Font("Arial",Font.BOLD,25);
        btn.setFont(f);

        // Setting font color and background color
        btn.setBackground(Color.BLUE);
        btn.setForeground(Color.WHITE);


        // Setting different type of cursor button on JButton
        //Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        //Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
        Cursor cur = new Cursor(Cursor.WAIT_CURSOR);


        btn.setCursor(cur);

        c.add(btn);
        c.setBackground(Color.YELLOW);

    }

}