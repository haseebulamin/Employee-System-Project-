import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameDeveloper implements ActionListener {
    JLabel label1;
    JButton button1,button2, button3,button4,button5;
    JFrame frame;
    GameDeveloper(){
        label1 = new JLabel("Game Developer");
        label1.setBounds(130, 7, 300, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));

        button1 = new JButton("Add");
        button1.setBounds(190, 80, 100, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("Update");
        button2.setBounds(190, 140, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        button3 = new JButton("Search");
        button3.setBounds(190, 200, 100, 35);
        button3.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button3.setFocusable(false);
        button3.setBackground(new Color(238, 135, 30));
        button3.setForeground(Color.white);
        button3.addActionListener(this);

        button4 = new JButton("Remove");
        button4.setBounds(190, 260, 100, 35);
        button4.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button4.setFocusable(false);
        button4.setBackground(new Color(238, 135, 30));
        button4.setForeground(Color.white);
        button4.addActionListener(this);

        button5 = new JButton("Back");
        button5.setBounds(190, 320, 100, 35);
        button5.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button5.setFocusable(false);
        button5.setBackground(new Color(238, 135, 30));
        button5.setForeground(Color.white);
        button5.addActionListener(this);

        frame = new JFrame("Game Developer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0, 35, 76));
        frame.setSize(500, 380);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            new Add();
        }
        else if (e.getSource() == button2) {
            new Update();
        }
        else if (e.getSource() == button3) {
            new Search();
        }
        else if (e.getSource() == button4) {
            new Remove();
        }
        else if (e.getSource() == button5) {
            frame.dispose();
        }
    }
}

