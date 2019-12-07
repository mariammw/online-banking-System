package onlineBanking;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Account {
	static String FirstName[] = {"John","Magi","juman","Hamad","ramzi","sara","ansaam","Mariam"};
	static String Passw[] = {"V=!-MkHHeZB$yT6L","zg!d89T=ef+-FCEX","v?AN!gM3Vr$Sa^2*","R2%k2d*^qTU9ZPkc","V6kyQk7&mT@XB7Vw","eZva^tP9NVN3F@Kb","h4cr^L?AgLcXXkub","*KPsUF9PT*&S6=a%"};
	static int Bank[] = {2332,435,21321,10,9200,24,222,1000000};
	static Font f1 = new Font("Sanskrit Text",Font.BOLD,13);
	static Color c1 = new Color(247, 255, 234);
	private static Object JLabel;
	public static void main(String arg[]){
		HashMap<String,String>Pas = new HashMap<String,String>();

		for (int  i = 0 ;i< FirstName.length;i++){
			Pas.put(FirstName[i],Passw[i]);
		}
		JFrame frame = new JFrame("Account Information");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("Account"));
        panel.setBounds(50, 30, 290, 500);
        panel.setBackground(c1);
        frame.add(panel);
 
        JLabel label1 = new JLabel("Hello Welcome !");
        JLabel label2 = new JLabel("First Name ");
        JLabel label3 = new JLabel("Password ");
        JLabel label4 = new JLabel("Your Balance ");
      
       // JLabel label9 = new JLabel("Email:");
        
        label1.setFont(f1);
        label2.setFont(f1);
        label3.setFont(f1);
        label4.setFont(f1);
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField(FirstName[0]);
        JLabel field4 = new JLabel(": "+Bank[0]+"$");
        
        
        JPasswordField field3 = new JPasswordField(Passw[0],'\0');
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
        JButton button = new JButton("Transfer Money");
        comboBox.setFont(f1);
        button.setFont(f1);
        label1.setFont(new Font("Sanskrit Text",Font.BOLD,20));

        label1.setBounds(50, 40, 200, 45);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        
        //field1.setBounds(120, 50, 130, 25);
        field2.setBounds(120, 90, 130, 25);
        field3.setBounds(120, 130, 130, 25);
        field4.setBounds(120, 170, 130, 25);
        
       //comboBox.setBounds(120, 210, 130, 25);
        button.setBounds(70, 215, 150, 45);
 
        panel.add(label1);
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
