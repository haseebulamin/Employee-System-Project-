import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remove implements ActionListener {
    JLabel label1,label2;
    JTextField textfield2;
    JButton button1,button2;
    JFrame RemoveDevframe;
    Remove(){
        label1 = new JLabel("Remove ");
        label1.setBounds(200, 10, 400, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));
        
        label2 = new JLabel("Enter ID");
        label2.setBounds(80, 130, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        textfield2 = new JTextField();
        textfield2.setBounds(210, 140, 200, 25);

        button1 = new JButton("Back");
        button1.setBounds(130, 250, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("Remove");
        button2.setBounds(265, 250, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        RemoveDevframe = new JFrame("Remove");
        RemoveDevframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RemoveDevframe.setResizable(false);
        RemoveDevframe.getContentPane().setBackground(new Color(0, 35, 76));
        RemoveDevframe.setSize(500, 380);
        RemoveDevframe.setLayout(null);
        RemoveDevframe.add(label1);
        RemoveDevframe.add(label2);
        RemoveDevframe.add(textfield2);
        RemoveDevframe.add(button1);
        RemoveDevframe.add(button2);
        RemoveDevframe.setLocationRelativeTo(null);
        RemoveDevframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            RemoveDevframe.dispose();
        }
        if (e.getSource() == button2) {

            if (textfield2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(RemoveDevframe, "Please Enter ID!");
            }
            else {
            JOptionPane.showMessageDialog(RemoveDevframe, "Removed successfully!");
            textfield2.setText("");
            }
        }
    }
}
