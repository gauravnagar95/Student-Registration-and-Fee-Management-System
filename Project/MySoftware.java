import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class pass extends JFrame
{
		JLabel l1,l2,l3,l4;
		JTextField t1;
		JButton b1;
		String s1=null,s2=null;
		private JPasswordField passwordField;
	
			
	pass()
	{
		setLayout(null);
			
	
		
		ImageIcon ii = new ImageIcon("pass.jpg");
		l1 = new JLabel("",ii,JLabel.CENTER);
		l1.setBounds(0,0,1200,700);
		add(l1);
			
		
		l2 = new JLabel("Student Registration and Fee Management System");
		l2.setBounds(150,100,1000,40);
		l2.setForeground(Color.WHITE);
		l1.add(l2);
		l2.setFont(new Font("Brush Script MT",Font.BOLD,40));
		
		l3 = new JLabel("User Name");
		l3.setBounds(350,300,400,40);
		l3.setFont(new Font("Console",Font.BOLD,30));
		l3.setForeground(Color.white);
		l1.add(l3);
		
		l4 = new JLabel("Password");
		l4.setBounds(350,400,400,40);
		l4.setFont(new Font("Console",Font.BOLD,30));
		l4.setForeground(Color.white);
		l1.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(550,300,390,40);
		t1.setFont(new Font("Console",Font.BOLD,20));
		l1.add(t1);
		
		b1 = new JButton("Login");
		b1.setBounds(550,500,200,40);
		b1.setFont(new Font("Brush Script MT",Font.BOLD,30));
		l1.add(b1);
		
	
		passwordField = new JPasswordField();
		passwordField.setBounds(550,400,390,40);
		passwordField.setFont(new Font("Console",Font.BOLD,20));
		l1.add(passwordField);
		
		actionhandler ah = new actionhandler();
		b1.addActionListener(ah);
		
	}		
		
class actionhandler implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		
		
		if(ae.getSource()==b1)
		{
			String a = t1.getText();
			String b = passwordField.getText();
		try{
			Class.forName("com.mysql.jdbc.Driver");
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery(" select * from login where user_name='"+a+"' ");
		 
		 while(rs.next())
		  { 
		    s1=rs.getString("user_name");
		    s2=rs.getString("password"); 
		  }
		  st.close();
		  con.close();
			if((a.equals(s1)) && (b.equals(s2)))
			{
				JOptionPane.showMessageDialog(null,"Successfull Login \n Valid user");
				dispose();
				hom h1 = new hom();
				h1.setDefaultCloseOperation(h1.EXIT_ON_CLOSE);
				h1.setLocation(new Point(0,0));
				h1.setResizable(false);
				h1.setTitle("HOME");
				h1.setSize(new Dimension(1200, 700));
				h1.setVisible(true);
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"You Entered a wrong Username or Password \n Please Check Caps Lock is on or not ","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) { System.out.println("Error "+e); }
	   }
	}
}
}
class MySoftware
{
	public static void main(String args[])
	{
		pass p= new pass();
		p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
		p.setLocation(new Point(0,0));
		p.setResizable(false);
		p.setTitle("Login Window");
		p.setSize(new Dimension(1200, 700));
		p.setVisible(true);
	}
}