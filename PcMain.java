package onlineBanking;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PcMain extends JFrame{

	Container c ;
	JLabel label=new JLabel();
	PcMain(){
		setBackground(c1);
		setSize(1500,1000);
		setLayout(new BorderLayout());
		c = getContentPane();
		JPanel panel = new JPanel(null);
		label.setIcon(new ImageIcon(Main.class.getResource("BIT Money.png")));
		panel.setBackground(c1);
		panel.setBorder(BorderFactory.createTitledBorder("Login"));
		panel.setBounds(50,30,290,500);
		c.add(panel,BorderLayout.CENTER);
		c.setBackground(c1);
		
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
		lab1.setBounds(550,70,100,25);
		lab2.setBounds(550, 120, 100, 25);
		field1.setBounds(590+60, 70, 130, 25);
		pass.setBounds(590+60, 120, 130, 25);
		j1.setBounds(550,190,240,35);
		j2.setBounds(550, 300, 160, 25);
		Font f2 = new Font("Arial",Font.ITALIC,15);
		lab3.setForeground(Color.BLUE);		
		lab4.setForeground(Color.BLUE);
		lab3.setFont(f2);
		lab4.setFont(f2);

		lab3.setBounds(550,440,440,30);
		lab4.setBounds(550,460,440,30);
		panel.add(lab1);
		panel.add(lab2);
		panel.add(field1);
		panel.add(pass);
		panel.add(j1);
		panel.add(lab3);
		panel.add(lab4);
		//c.add(label,BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	static Font f1 = new Font("Sanskrit Text",Font.PLAIN,19);
	static Color c1 = new Color(247, 255, 234);
	private static Object JLabel;
	public static void main(String arg[]){
		new PcMain();
	}
}
