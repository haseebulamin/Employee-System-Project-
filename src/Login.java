import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textfield1;
    JPasswordField passfield1;
    JButton button1,button2;
    JFrame loginframe;
    Login()
    {
       label1 = new JLabel("Login");
        label1.setBounds(200, 10, 300, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));
        
        label2 = new JLabel("Username");
        label2.setBounds(80, 110, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        label3 = new JLabel("Password");
        label3.setBounds(80, 160, 80, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label3.setForeground(Color.white);

        textfield1 = new JTextField();
        textfield1.setBounds(190, 120, 200, 25);

        passfield1 = new JPasswordField();
        passfield1.setBounds(190,170,200,25);

        button1 = new JButton("Back");
        button1.setBounds(150, 250, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("Login");
        button2.setBounds(265, 250, 85, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        loginframe = new JFrame("LogIn");
        loginframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginframe.setResizable(false);
        loginframe.getContentPane().setBackground(new Color(0, 35, 76));
        loginframe.setSize(500, 360);
        loginframe.setLayout(null);
        loginframe.add(label1);
        loginframe.add(label2);
        loginframe.add(label3);
        loginframe.add(textfield1);
        loginframe.add(passfield1);
        loginframe.add(button1);
        loginframe.add(button2);
        loginframe.setLocationRelativeTo(null);
        loginframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
        loginframe.dispose();
    }
    if (e.getSource() == button2) {
        String user = textfield1.getText(); 
        String pass = new String(passfield1.getPassword()); 

        if (user.equals("haseeb") && pass.equals("12345")) {
            loginframe.dispose();
            new EmployeeType();
        } 
        else
        {
            JOptionPane.showMessageDialog(loginframe, "Invalid username or password");
        }
    }
}
}
