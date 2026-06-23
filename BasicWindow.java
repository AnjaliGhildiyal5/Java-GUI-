import java.awt.Color;
import javax.swing.JFrame;

public class BasicWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Swing Window");

        frame.setSize(400, 300);
        frame.getContentPane().setBackground(
    new Color(135, 206, 235)
);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
