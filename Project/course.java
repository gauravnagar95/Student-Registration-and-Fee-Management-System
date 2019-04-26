import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JOptionPane;
class im extends JFrame
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b2;
	JPanel panel;
	Canvas cnv1,cnv2,cnv3,cnv4,cnv5,cnv6,cnv7,cnv8;
	im()
	{	
		JPanel boo = new JPanel();
		boo.setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		//setMaximizedBounds(new Rectangle(1200,700));
		panel.setBounds(0,0,1200,1100);
		panel.setPreferredSize(new Dimension(1200,1300));
		boo.add(panel);
		
		
		
		b2 = new JButton("Done");
		b2.setFont(new Font("Brush Script MT",Font.BOLD,30));
		b2.setBounds(950,1200,200,65);
		Color lk = new Color(250,240,150);
		b2.setBackground(lk);
		panel.add(b2);
		
		ImageIcon ii = new ImageIcon("1.png");
		l1 = new JLabel("    	C is a high-level and general purpose programming language.",ii,JLabel.LEFT);
		l1.setFont(new Font("SansSerif",Font.BOLD,20));
		l1.setBounds(0,15,1200,100);
		panel.add(l1);
		
		cnv1 = new Canvas();
		cnv1.setBounds(0,5,1200,120);
		cnv1.setBackground( Color.RED);
		panel.add(cnv1);
		
		
		
		ImageIcon ij = new ImageIcon("2.png");
		l2 = new JLabel("    	C++ is a general-purpose object-oriented programming(OOP) language.",ij,JLabel.LEFT);
		l2.setFont(new Font("SansSerif",Font.BOLD,20));
		l2.setBounds(0,150,1200,100);
		panel.add(l2);

		cnv2 = new Canvas();
		cnv2.setBounds(0,140,1200,120);
		cnv2.setBackground( Color.orange);
		panel.add(cnv2);
		
		
	 ImageIcon ik = new ImageIcon("3.jpeg");
		l3 = new JLabel("    	Java is a programming language and is commonly used for developing and delivering content on the Web.",ik,JLabel.LEFT);
		l3.setFont(new Font("Console",Font.BOLD,20));
		l3.setBounds(0,285,1200,100);
		panel.add(l3);
		
		
		cnv3 = new Canvas();
		cnv3.setBackground( Color.red);
		cnv3.setBounds(0,275,1200,120);
		panel.add(cnv3);
		
		ImageIcon il = new ImageIcon("4.jpeg");
		l4 = new JLabel("    	Python is a high-level, interpreted, interactive and object-oriented scripting language.",il,JLabel.LEFT);
		l4.setFont(new Font("Console",Font.BOLD,20));
		l4.setBounds(0,420,1200,100);
		panel.add(l4);
		
		cnv4 = new Canvas();
		cnv4.setBackground( Color.orange);
		cnv4.setBounds(0,410,1200,120);
		panel.add(cnv4);
		
		
		
		ImageIcon in = new ImageIcon("5.png");
		l5 = new JLabel("    	Android is a OS, developing applications on the Android platform using the Java programming language.",in,JLabel.LEFT);
		l5.setFont(new Font("Console",Font.BOLD,20));
		l5.setBounds(0,555,1200,100);
		panel.add(l5);
		
		
		cnv5 = new Canvas();
		cnv5.setBackground( Color.red);
		cnv5.setBounds(0,545,1200,120);
		panel.add(cnv5);
		
		
		ImageIcon io= new ImageIcon("6.jpeg");
		l6 = new JLabel("    	Php is a server-side scripting language.",io,JLabel.LEFT);
		l6.setFont(new Font("Console",Font.BOLD,20));
		l6.setBounds(0,690,1200,100);
		panel.add(l6);
		cnv6 = new Canvas();
		cnv6.setBackground( Color.orange);
		cnv6.setBounds(0,680,1200,120);
		panel.add(cnv6);
		
		ImageIcon ip = new ImageIcon("7.png");
		l7 = new JLabel("    	ASP.net is an open-source server-side web application framework.",ip,JLabel.LEFT);
		l7.setFont(new Font("Console",Font.BOLD,20));
		l7.setBounds(0,825,1200,100);
		panel.add(l7);
		
		cnv7 = new Canvas();
		cnv7.setBackground( Color.red);
		cnv7.setBounds(0,815,1200,120);
		panel.add(cnv7);
		
		
		ImageIcon iq = new ImageIcon("8.png");
		l8 = new JLabel("    	Web Development is broadly refers to the tasks associated with developing websites for hosting via intranet or internet.",iq,JLabel.LEFT);
		l8.setFont(new Font("Console",Font.BOLD,17));
		l8.setBounds(0,960,1200,100);
		panel.add(l8);
		
		cnv8 = new Canvas();
		cnv8.setBackground( Color.orange);
		cnv8.setBounds(0,950,1200,120);
		panel.add(cnv8);
		
		
		add(panel);
		JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  
		scrollBar.setBounds(1200,700,1200,700);
		add(scrollBar);
		
		
		Color col = new Color(250,240,120);
		panel.setBackground(col);
		
		actionhandler_b2 uu = new actionhandler_b2();
		b2.addActionListener(uu);
		
		
	}
	


class actionhandler_b2 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== b2)
		{
			
		dispose();
		}
	}
}
}
class course
{
	public static void main(String args[])
	{
		im i = new im(); 
		i.setVisible(true);
		i.setLocation(new Point(0,0));
		i.setTitle("COURSES");
		i.setSize(1200,700);
		i.setResizable(false);
		
		
		
	}
}