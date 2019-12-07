package onlineBanking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PcEntering extends JFrame {

	static Font f1 = new Font("Sanskrit Text",Font.PLAIN,19);
	static Color c1 = new Color(247, 255, 234);
	Container c ;
	JLabel label=new JLabel();
	PcEntering(){
		setBackground(c1);
		setSize(1500,1000);
		setLayout(new BorderLayout());
		c = getContentPane();
		JPanel panel = new JPanel(null);
		//label.setIcon(new ImageIcon(Main.class.getResource("BIT Money.png")));
		panel.setBackground(c1);
		panel.setBorder(BorderFactory.createTitledBorder("Login"));
		panel.setBounds(50,30,1000,800);
		c.add(panel,BorderLayout.CENTER);
		c.setBackground(c1);
		
		
		JLabel lab1 = new JLabel("First Name");
        JLabel lab2 = new JLabel("Last Name");
        JLabel lab3 = new JLabel("Password");
        JLabel lab4 = new JLabel("Rpassword");
        JLabel lab5 = new JLabel("Gender");
        JLabel lab6 = new JLabel("Country");
        JLabel lab7 = new JLabel("Email");
        JLabel lab8 = new JLabel("Phone No:");

        lab1.setFont(f1);
        lab2.setFont(f1);
        lab3.setFont(f1);
        lab4.setFont(f1);
        lab5.setFont(f1);
        lab6.setFont(f1);
        lab7.setFont(f1);
        lab8.setFont(f1);
        
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
        

        lab1.setBounds(550, 50+40, 100, 30);
        lab2.setBounds(550, 90+40, 100, 30);
        lab3.setBounds(550, 130+40, 100, 30);
        lab4.setBounds(550, 170+40, 100, 30);
        lab5.setBounds(550, 210+40, 100, 30);
        lab6.setBounds(550, 250+40, 100, 30);
        lab7.setBounds(550, 290+40, 100, 30);
        lab8.setBounds(550, 330+40, 100, 30);
        
        field1.setBounds(590+60+20, 50+40, 130, 30);
        field2.setBounds(590+60+20, 90+40, 130, 30);
        field3.setBounds(590+60+20, 130+40, 130, 30);
        field4.setBounds(590+60+20, 170+40, 130, 30);
        
        field5.setBounds(590+60+20, 250+40, 130, 30);
        field6.setBounds(590+60+20, 290+40, 130, 30);
        
        field8.setBounds(590+60+20, 340+40, 130, 30);
        comboBox.setBounds(590+60+20, 210+40, 130, 30);
        button.setBounds(550+60+20, 405+40, 130, 25);
 
        panel.add(lab1);
        panel.add(lab2);
        panel.add(lab3);
        panel.add(lab4);
        panel.add(lab5);
    
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        panel.add(field4);
        panel.add(lab6);
        panel.add(lab7);
        panel.add(lab8);
        
        panel.add(field3);
        panel.add(field4);
        panel.add(field5);
        panel.add(field6);
        panel.add(field8);
        panel.add(comboBox);
        panel.add(button);
        setVisible(true);
        
		
	}
	public static void main(String a[]){
		new PcEntering();
	}
}
