import javax.swing.*;
import java.awt.*;

public class snakeGame
{
    public static void main(String[] args)
    {
        JFrame obj = new JFrame(); // windows bana rha hu
        playGame gameplay = new playGame();

        obj.setBounds(10,10,905,700); // coordinate system
        obj.setTitle("SNAKE DEMO"); // title
        obj.setBackground(Color.darkGray); // frame ka background color hai
        obj.setResizable(false); // Resize restriction
        obj.setVisible(true); // Frame visible kar rha hu
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Cross button press karne par frame and prgm will be closed.

        obj.add(gameplay);// add ek function , jo saman(object) dalne ke liye use hota hai.
    }
}