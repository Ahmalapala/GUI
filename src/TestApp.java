import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestApp {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon("./images/stepbystep.png");
        JFrame frame = new JFrame();
        frame.setTitle("Step By Step Management System");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(188, 247, 206));

        JLabel label = new JLabel("This is a Label", SwingConstants.CENTER);
        label.setIcon(logo);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);
        /*JButton btn = new JButton("View");
        JButton btn2 = new JButton("Search");

        frame.add(btn);
        frame.add(btn2);
        frame.pack();*/
        frame.setVisible(true);





    }
}
