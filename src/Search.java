import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search implements ActionListener {
    JLabel label1,label2,label3,label4,label5;
    JTextField textfield2, textfield3,textfield4,textfield5;
    JButton button1,button2;
    JFrame SearchDevframe;
    Search(){
        label1 = new JLabel("Search");
        label1.setBounds(200, 5, 400, 70);
        label1.setFont(new Font("Tahoma",Font.BOLD,30));
        label1.setForeground(new Color(238, 135, 30));
        
        label2 = new JLabel("Search ID");
        label2.setBounds(80, 80, 80, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label2.setForeground(Color.white);

        label3 = new JLabel("Name");
        label3.setBounds(80, 180, 80, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label3.setForeground(Color.white);

        label4 = new JLabel("Email");
        label4.setBounds(80, 230, 80, 40);
        label4.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label4.setForeground(Color.white);

        label5 = new JLabel("Phone Number");
        label5.setBounds(80, 280, 150, 40);
        label5.setFont(new Font("Tahoma", Font.BOLD,15  ));
        label5.setForeground(Color.white);

        textfield2 = new JTextField();
        textfield2.setBounds(210, 90, 200, 25);

        textfield3 = new JTextField();
        textfield3.setBounds(210, 190, 200, 25);

        textfield4 = new JTextField();
        textfield4.setBounds(210,240,200,25);

        textfield5 = new JTextField();
        textfield5.setBounds(210,290,200,25);

        button1 = new JButton("Back");
        button1.setBounds(130, 130, 80, 35);
        button1.setFocusable(false);
        button1.setFont(new Font("Tahoma", Font.BOLD, 15));
        button1.setBackground(new Color(238, 135, 30));
        button1.setForeground(Color.white);
        button1.addActionListener(this);

        button2 = new JButton("search");
        button2.setBounds(265, 130, 100, 35);
        button2.setFont(new Font("Tahoma", Font.BOLD, 15));     
        button2.setFocusable(false);
        button2.setBackground(new Color(238, 135, 30));
        button2.setForeground(Color.white);
        button2.addActionListener(this);

        SearchDevframe = new JFrame("Search");
        SearchDevframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SearchDevframe.setResizable(false);
        SearchDevframe.getContentPane().setBackground(new Color(0, 35, 76));
        SearchDevframe.setSize(500, 380);
        SearchDevframe.setLayout(null);
        SearchDevframe.add(label1);
        SearchDevframe.add(label2);
        SearchDevframe.add(label3);
        SearchDevframe.add(label4);
        SearchDevframe.add(label5);
        SearchDevframe.add(textfield2);
        SearchDevframe.add(textfield3);
        SearchDevframe.add(textfield4);
        SearchDevframe.add(textfield5);
        SearchDevframe.add(button1);
        SearchDevframe.add(button2);
        SearchDevframe.setLocationRelativeTo(null);
        SearchDevframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            SearchDevframe.dispose();
        }
        if (e.getSource() == button2) {
            if (textfield2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(SearchDevframe, "Please Enter ID!");
            }
        }
    }
}
