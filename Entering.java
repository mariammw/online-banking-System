package onlineBanking;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Entering {
	static Font f1 = new Font("Sanskrit Text",Font.BOLD,13);
	static Color c1 = new Color(247, 255, 234);
	private static Object JLabel;
	public static void main(String arg[]){
		JFrame frame = new JFrame("JPanel demo");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("Add User"));
        panel.setBounds(50, 30, 290, 500);
        panel.setBackground(c1);
        frame.add(panel);
 
        JLabel label1 = new JLabel("First Name");
        JLabel label2 = new JLabel("Last Name");
        JLabel label3 = new JLabel("Password");
        JLabel label4 = new JLabel("Repassword");
        JLabel label5 = new JLabel("Gender");
        JLabel label6 = new JLabel("Country");
        JLabel label7 = new JLabel("Email");
        JLabel label8 = new JLabel("Phone No:");
       // JLabel label9 = new JLabel("Email:");
        
        label1.setFont(f1);
        label2.setFont(f1);
        label3.setFont(f1);
        label4.setFont(f1);
        label5.setFont(f1);
        label6.setFont(f1);
        label7.setFont(f1);
        label8.setFont(f1);
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field5 = new JTextField();
        JTextField field6 = new JTextField();
        JTextField field7 = new JTextField();
        JTextField field8 = new JTextField();
        
        JPasswordField field3 = new JPasswordField();
        JPasswordField  field4 = new JPasswordField() ;
        
        field1.setFont(f1);
        field2.setFont(f1);
        field3.setFont(f1);
        field4.setFont(f1);
        field5.setFont(f1);
        field6.setFont(f1);
        field7.setFont(f1);
        field8.setFont(f1);
       // field9.setFont(f1);
        JComboBox comboBox = new JComboBox(new String[]{ "Male", "Female"});
        JButton button = new JButton("Sign in");
        comboBox.setFont(f1);
        button.setFont(f1);
        
        label1.setBounds(30, 50, 100, 25);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        label5.setBounds(30, 210, 100, 25);
        label6.setBounds(30, 250, 100, 25);
        label7.setBounds(30, 290, 100, 25);
        label8.setBounds(30, 330, 100, 25);
        
        field1.setBounds(120, 50, 130, 25);
        field2.setBounds(120, 90, 130, 25);
        field3.setBounds(120, 130, 130, 25);
        field4.setBounds(120, 170, 130, 25);
        
        field5.setBounds(120, 250, 130, 25);
        field6.setBounds(120, 290, 130, 25);
        
        field8.setBounds(120, 340, 130, 25);
        comboBox.setBounds(120, 210, 130, 25);
        button.setBounds(80, 405, 130, 25);
 
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
       
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        panel.add(field4);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);
        
        panel.add(field3);
        panel.add(field4);
        panel.add(field5);
        panel.add(field6);
        panel.add(field8);
        panel.add(comboBox);
        panel.add(button);
        frame.setVisible(true);

	}
}
