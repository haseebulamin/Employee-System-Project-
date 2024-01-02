import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update implements ActionListener {
    JLabel label1,label2,label3,label4,label5;
    JTextField textfield2, textfield3,textfield4,textfield5;
    JButton button1,button2;
    JFrame UpdateDevframe;
    Update(){
        label1 = new JLabel("Update");
        label1.setBounds(200, 10, 400, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));
        
        label2 = new JLabel("ID");
        label2.setBounds(80, 80, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        label3 = new JLabel("Name");
        label3.setBounds(80, 130, 80, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label3.setForeground(Color.white);

        label4 = new JLabel("Email");
        label4.setBounds(80, 180, 80, 40);
        label4.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label4.setForeground(Color.white);

        label5 = new JLabel("Phone Number");
        label5.setBounds(80, 230, 150, 40);
        label5.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label5.setForeground(Color.white);

        textfield2 = new JTextField();
        textfield2.setBounds(210, 90, 200, 25);

        textfield3 = new JTextField();
        textfield3.setBounds(210, 140, 200, 25);

        textfield4 = new JTextField();
        textfield4.setBounds(210,190,200,25);

        textfield5 = new JTextField();
        textfield5.setBounds(210,240,200,25);

        button1 = new JButton("Back");
        button1.setBounds(150, 300, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("Update");
        button2.setBounds(265, 300, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        UpdateDevframe = new JFrame("Update");
        UpdateDevframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UpdateDevframe.setResizable(false);
        UpdateDevframe.getContentPane().setBackground(new Color(0, 35, 76));
        UpdateDevframe.setSize(500, 380);
        UpdateDevframe.setLayout(null);
        UpdateDevframe.add(label1);
        UpdateDevframe.add(label2);
        UpdateDevframe.add(label3);
        UpdateDevframe.add(label4);
        UpdateDevframe.add(label5);
        UpdateDevframe.add(textfield2);
        UpdateDevframe.add(textfield3);
        UpdateDevframe.add(textfield4);
        UpdateDevframe.add(textfield5);
        UpdateDevframe.add(button1);
        UpdateDevframe.add(button2);
        UpdateDevframe.setLocationRelativeTo(null);
        UpdateDevframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            UpdateDevframe.dispose();
        }
        if (e.getSource() == button2) {

            if (textfield2.getText().isEmpty() || textfield3.getText().isEmpty() && textfield4.getText().isEmpty() && textfield5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(UpdateDevframe, "Please Add details!");
            }
            else {
            JOptionPane.showMessageDialog(UpdateDevframe, "Updated successfully!");
            textfield2.setText("");
            textfield3.setText("");
            textfield4.setText("");
            textfield5.setText("");
            }
        }
        
    }
    public static void main(String[] args) {
        new Update();
    }
}
