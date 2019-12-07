package onlineBanking;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Transfer {

	static Font f1 = new Font("Sanskrit Text",Font.BOLD,13);
	static Color c1 = new Color(247, 255, 234);
	public static void main(String arg[]){
		
		JFrame frame = new JFrame("Account Information");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("Transfer Service"));
        panel.setBounds(50, 30, 290, 500);
        panel.setBackground(c1);
        frame.add(panel);
 
        JLabel label2 = new JLabel("ID to transfer money ");
        JLabel label3 = new JLabel("Password ");
        JLabel label4 = new JLabel("Price ");
      
       // JLabel label9 = new JLabel("Email:");
        
      //  label1.setFont(f1);
        label2.setFont(f1);
        label3.setFont(f1);
        label4.setFont(f1);
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField("");
        JTextField field4 = new JTextField("");
        
        
        JPasswordField field3 = new JPasswordField("");
        //JPasswordField  field4 = new JPasswordField() ;
        
        field1.setFont(f1);
        field2.setFont(f1);
        field3.setFont(f1);
        field4.setFont(f1);
        //field5.setFont(f1);
//        field6.setFont(f1);
//        field7.setFont(f1);
//        field8.setFont(f1);
       // field9.setFont(f1);
        JComboBox comboBox = new JComboBox(new String[]{ "Male", "Female"});
        JButton button = new JButton("Accept");
        comboBox.setFont(f1);
        button.setFont(f1);
       // label1.setFont(new Font("Sanskrit Text",Font.BOLD,20));

       // label1.setBounds(50, 40, 200, 45);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        
        //field1.setBounds(120, 50, 130, 25);
        field2.setBounds(120, 90, 130, 25);
        field3.setBounds(120, 130, 130, 25);
        field4.setBounds(120, 170, 130, 25);
        
       //comboBox.setBounds(120, 210, 130, 25);
        button.setBounds(70, 215, 150, 45);
 
      //  panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
      
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        panel.add(field4);
     
        panel.add(field3);
        panel.add(field4);
       // panel.add(field5);
       
        panel.add(comboBox);
        panel.add(button);
        frame.setVisible(true);
	}
	
}
