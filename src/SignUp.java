import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp implements ActionListener {
    JLabel label1,label2,label3,label4;
    JTextField textfield2, textfield3;
    JPasswordField passfield1;
    JButton button1,button2;
    JFrame signupframe;
    SignUp(){
        label1 = new JLabel("SignUp");
        label1.setBounds(200, 10, 300, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));
        
        label2 = new JLabel("Email");
        label2.setBounds(80, 80, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        label3 = new JLabel("Username");
        label3.setBounds(80, 130, 80, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label3.setForeground(Color.white);

        label4 = new JLabel("Password");
        label4.setBounds(80, 180, 80, 40);
        label4.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label4.setForeground(Color.white);

        textfield2 = new JTextField();
        textfield2.setBounds(190, 90, 200, 25);

        textfield3 = new JTextField();
        textfield3.setBounds(190, 140, 200, 25);

        passfield1 = new JPasswordField();
        passfield1.setBounds(190,190,200,25);

        button1 = new JButton("Back");
        button1.setBounds(150, 250, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("SignUp");
        button2.setBounds(265, 250, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        signupframe = new JFrame("SignUp");
        signupframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signupframe.setResizable(false);
        signupframe.getContentPane().setBackground(new Color(0, 35, 76));
        signupframe.setSize(500, 360);
        signupframe.setLayout(null);
        signupframe.add(label1);
        signupframe.add(label2);
        signupframe.add(label3);
        signupframe.add(label4);
        signupframe.add(textfield2);
        signupframe.add(textfield3);
        signupframe.add(passfield1);
        signupframe.add(button1);
        signupframe.add(button2);
        signupframe.setLocationRelativeTo(null);
        signupframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
           signupframe.dispose();
        }
        if (e.getSource() == button2) {
            char[] passwordChars = passfield1.getPassword();
        String password = new String(passwordChars);

            if (textfield2.getText().isEmpty() || textfield3.getText().isEmpty() || password.isEmpty() ) {
                JOptionPane.showMessageDialog(signupframe, "Please Add details!");
            }
            else {
            JOptionPane.showMessageDialog(signupframe, "Account Created!");
            signupframe.dispose();
            }
        }
    }
}
