package onlineBanking;
import java.awt.*;

import javax.swing.*;
	
public class Main{

	static Font f1 = new Font("Sanskrit Text",Font.BOLD,13);
	static Color c1 = new Color(247, 255, 234);
	private static Object JLabel;
	public static void main(String arg[]){
		JFrame frame = new JFrame("BIT Bank");
		frame.setBackground(c1);
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JPanel panel = new JPanel(null);
		panel.setBackground(c1);
		panel.setBorder(BorderFactory.createTitledBorder("Login"));
		panel.setBounds(50,30,290,500);
		
		frame.add(panel);
		JLabel lab1 = new JLabel("User ID:");
		JLabel lab2 = new JLabel("Password:");
		JLabel lab3 = new JLabel("forget my password ?");
		JLabel lab4 = new JLabel("not register ?");
		//lab1.setIcon(new ImageIcon(Main.class.getResource("images/s.jpeg")));
		JTextField field1 = new JTextField("User Name");
		JPasswordField pass = new JPasswordField("Password");
		JButton j1 = new JButton("Submit");
		JButton j2 = new JButton("Forget Password");
		//j1.setBackground(new Color(247, 255, 234));
		lab1.setFont(f1);
		lab2.setFont(f1);
		field1.setFont(f1);
		j1.setFont(f1);
		j2.setFont(f1);
		lab1.setBounds(30,70,100,25);
		lab2.setBounds(30, 120, 100, 25);
		field1.setBounds(120, 70, 130, 25);
		pass.setBounds(120, 120, 130, 25);
		j1.setBounds(30,190,240,35);
		j2.setBounds(80, 300, 160, 25);
		Font f2 = new Font("Arial",Font.ITALIC,12);
		lab3.setForeground(Color.BLUE);		
		lab4.setForeground(Color.BLUE);
		lab3.setFont(f2);
		lab4.setFont(f2);

		lab3.setBounds(80,440,440,30);
		lab4.setBounds(80,460,440,30);
		panel.add(lab1);
		panel.add(lab2);
		panel.add(field1);
		panel.add(pass);
		panel.add(j1);
		panel.add(lab3);
		panel.add(lab4);
		frame.setVisible(true);
	}
}
