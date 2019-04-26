import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
class hom extends JFrame
{
		JLabel l1,l2;
		JButton b4,b5;
		JMenuItem  a_item2,e_item1,e_item2,e_item3,d_item1,d_item2,u_item1;
		//int y=-50;
		
			
	hom()
	{
		setLayout(null);
		
		ImageIcon ii = new ImageIcon("back.jpg");
		l2 = new JLabel("",ii,JLabel.CENTER);
		l2.setBounds(0,0,1200,700);
		add(l2);
		l1 = new JLabel("Student Registration and Fee Management System");
		l1.setBounds(150,100,900,50);
		l1.setForeground(Color.WHITE);
		l2.add(l1);
		l1.setFont(new Font("Brush Script MT",Font.BOLD,35));
			
		b4 = new JButton();
		ImageIcon jk= new ImageIcon("logout.jpg");
		b4 = new JButton(jk);
		b4.setBounds(1080,30,80,80);
		b4.setToolTipText("Logout");
		l2.add(b4);
	
		//JMenu Code........
		
		JMenuBar obj = new JMenuBar();
		setJMenuBar(obj);
		
		JMenu entry = new JMenu("Entry");
		entry.add(e_item1 = new JMenuItem("New Entry"));
		entry.add(e_item2 = new JMenuItem("Delete Entry"));
		entry.addSeparator();
		entry.add(e_item3 = new JMenuItem("Exit"));
		entry.setFont(new Font("Console",Font.BOLD,16));
		obj.add(entry);
		
		actionhandler_entry_1 e1 = new  actionhandler_entry_1();
		e_item1.addActionListener(e1);
		actionhandler_entry_2 e2 = new  actionhandler_entry_2();
		e_item2.addActionListener(e2);
		actionhandler_entry_3 e3 = new  actionhandler_entry_3();
		e_item3.addActionListener(e3);
		
		
		JMenu detail = new JMenu("Detail");
		detail.add(d_item1 = new JMenuItem("Fee Structure"));
		detail.add(d_item2 = new JMenuItem("Students General Detail"));
		detail.setFont(new Font("Console",Font.BOLD,16));
		obj.add(detail);
		
		actionhandler_detail_1 d1 = new  actionhandler_detail_1();
		d_item1.addActionListener(d1);
		actionhandler_detail_2 d2 = new  actionhandler_detail_2();
		d_item2.addActionListener(d2);
		
		JMenu update = new JMenu("Update");
		update.setFont(new Font("Console",Font.BOLD,16));
		update.add(u_item1 = new JMenuItem("Update Student Data"));
		obj.add(update);
		
		actionhandler_update_1 u1 = new  actionhandler_update_1();
		u_item1.addActionListener(u1);
		
	
		JMenu about = new JMenu("About");
		about.setFont(new Font("Console",Font.BOLD,16));
		about.add(a_item2 = new JMenuItem("Courses"));
		obj.add(about);
		actionhandler_about_2 a2 = new  actionhandler_about_2();
		a_item2.addActionListener(a2);
		
		
		actionhandler_b4 j = new actionhandler_b4();
		b4.addActionListener(j);

		
	}

class actionhandler_b4 implements ActionListener
{
	public void actionPerformed(ActionEvent ap)
	{
		if(ap.getSource() == b4)
		{
			dispose();
			
		pass p= new pass();
		p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
		p.setLocation(new Point(0,0));
		p.setResizable(false);
		p.setTitle("Login Window");
		p.setSize(new Dimension(1200, 700));
		p.setVisible(true);
		
		}
	}
}

class actionhandler_entry_1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == e_item1)
		{
		reg ed = new reg();
		ed.setVisible( true );
		ed.setTitle("Registration");
		ed.setLocation(new Point(200,0));
		ed.setResizable(false);
		ed.setSize(665,750);
		}
	}
	
} 

class actionhandler_entry_2 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == e_item2)
		{
			
			String l= JOptionPane.showInputDialog(null,"Enter the Student Mobile Number");
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			Statement st = con.createStatement();
			st.executeUpdate("DELETE  from soft where MobileNumber = '"+l+"' ");
			st.close();
			con.close();
			}catch(Exception e){System.out.println("Error"+e);}	
		}
	}
	
} 
class actionhandler_entry_3 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == e_item3)
		{
			System.exit(0);
		}
	}
	
} 

class actionhandler_detail_1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == d_item1)
		{
		tab2 t1=new tab2();
		t1.setSize(900,400);
		t1.setTitle("Fee Structure");
		t1.setLocation(new Point(0,0));
		t1.setVisible(true);	
	
		}
	}
	
} 

class actionhandler_detail_2 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == d_item2)
		{
			
		tab1 t1=new tab1();
		t1.setSize(1200,500);
		t1.setTitle("Registration Data");
		t1.setLocation(new Point(0,0));
		t1.setVisible(true);
	
		}
	}
} 
class actionhandler_update_1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == u_item1)
		{
		EDT ed = new EDT();
		ed.setVisible( true );
		ed.setTitle("EDIT");
		ed.setLocation(new Point(200,10));
		ed.setResizable(false);
		ed.setSize(665,700);
		}
	}
	
} 




class actionhandler_about_2 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == a_item2)
		{
			im i = new im(); 
			i.setVisible(true);
			i.setLocation(new Point(0,0));
			i.setTitle("COURSES");
			i.setSize(1200,700);
			i.setResizable(false);
		}
	}
	
} 

}

class home
{
	public static void main(String args[])
	{
		hom h1 = new hom();
		h1.setDefaultCloseOperation(h1.EXIT_ON_CLOSE);
		h1.setLocation(new Point(0,0));
		h1.setResizable(false);
		h1.setTitle("HOME");
		h1.setSize(new Dimension(1200, 700));
		h1.setVisible(true);
	}
}