import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add implements ActionListener {
    JLabel label1,label2,label3,label4,label5;
    JTextField textfield2, textfield3,textfield4,textfield5;
    JButton button1,button2;
    JFrame AddDevframe;
    Add(){
        label1 = new JLabel("Add");
        label1.setBounds(200, 10, 300, 70);
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

        button2 = new JButton("Add");
        button2.setBounds(265, 300, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        AddDevframe = new JFrame("Add");
        AddDevframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        AddDevframe.setResizable(false);
        AddDevframe.getContentPane().setBackground(new Color(0, 35, 76));
        AddDevframe.setSize(500, 380);
        AddDevframe.setLayout(null);
        AddDevframe.add(label1);
        AddDevframe.add(label2);
        AddDevframe.add(label3);
        AddDevframe.add(label4);
        AddDevframe.add(label5);
        AddDevframe.add(textfield2);
        AddDevframe.add(textfield3);
        AddDevframe.add(textfield4);
        AddDevframe.add(textfield5);
        AddDevframe.add(button1);
        AddDevframe.add(button2);
        AddDevframe.setLocationRelativeTo(null);
        AddDevframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
           AddDevframe.dispose();
        }
        if (e.getSource() == button2) {

            if (textfield2.getText().isEmpty() || textfield3.getText().isEmpty() || textfield4.getText().isEmpty() || textfield5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(AddDevframe, "Please Add details!");
            }
            else {
            JOptionPane.showMessageDialog(AddDevframe, "Added successfully!");
            textfield2.setText("");
            textfield3.setText("");
            textfield4.setText("");
            textfield5.setText("");
            }
        }

    }
}
