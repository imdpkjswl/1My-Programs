import javax.swing.*;

public class myFirstFrame {
        public static void main(String[] args) {

                JFrame frame = new JFrame(); // Creating frame.
                frame.setVisible(true); // Showing frame.
                frame.setTitle("My Frame"); // Used to set title of frame.

                frame.setSize(700,500); // Setting size of window.
                frame.setLocation(300,100); // Used to set location of window, when window gets open.
                frame.setBounds(100,100,1000,500); // Setting window width and height.
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Used to closed program, whenever we close th window.

        }
}
