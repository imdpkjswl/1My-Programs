import javax.swing.*;

public class mySwing {
    public static void main(String []args){

        JFrame jF = new JFrame("My Frame");

        JLabel jL1 = new JLabel("Hello");
        jL1.setBounds(50,100,70,30);
        jF.add(jL1);

        JLabel jL2 = new JLabel(" Java");
        jL2.setBounds(85,100,100,30);
        jF.add(jL2);

        jF.setSize(700,500);
        jF.setLayout(null);
        jF.setVisible(true);
    }
}
