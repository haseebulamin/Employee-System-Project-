import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {
    JLabel Heading, NavLogo, label3, label4, logoLabel;
    JButton button1, button2;
    JFrame frame;

    MainFrame() {
        frame = new JFrame("SQA Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.setSize(1360, 770);
        frame.setLayout(null);

        NavLogo = new JLabel("SQACIRCLES");
        NavLogo.setBounds(50, 20, 100, 40);
        NavLogo.setFont(new Font("Tahoma", Font.BOLD, 15));
        NavLogo.setForeground(Color.white);

        Heading = new JLabel("SQA Circles");
        Heading.setBounds(80, 280, 800, 100);
        Heading.setFont(new Font("Tahoma", Font.BOLD, 100));
        Heading.setForeground(new Color(0, 35, 76));

        label3 = new JLabel("Tomorrow in Our.");
        label3.setBounds(80, 380, 130, 40);
        label3.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
        label3.setForeground(Color.white);

        label4 = new JLabel("\"When I Grow Up\" Spirit Day!");
        label4.setBounds(80, 400, 500, 40);
        label4.setFont(new Font("Tahoma", Font.BOLD, 30));
        label4.setForeground(Color.white);

        ImageIcon logoIcon = new ImageIcon("about.jpg");
        int imageWidth = 400; 
        int imageHeight = -1; 
        logoLabel = new JLabel(new ImageIcon(logoIcon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT)));
        logoLabel.setBounds(800, 1, imageWidth, logoIcon.getIconHeight());

        button1 = new JButton("LogIn");
        button1.setBounds(1100, 20, 100, 40);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setContentAreaFilled(false);
        button1.setOpaque(false);
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("SignUp");
        button2.addActionListener(this);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));
        button2.setBounds(1230, 20, 100, 40);
        button2.setContentAreaFilled(false);
        button2.setOpaque(false);
        button2.setForeground(Color.white);
        button2.setFocusable(false);

        frame.add(Heading);
        frame.add(NavLogo);
        frame.add(label3);
        frame.add(label4);
        frame.add(button1);
        frame.add(button2);
        frame.add(logoLabel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            new Login();
        }
        if (e.getSource() == button2) {
            new SignUp();
        }
    }
 public static void main(String[] args) {
    new MainFrame();
 }
}
