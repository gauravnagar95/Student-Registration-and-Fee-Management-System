import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
//import javax.swing.BorderFactory.*;
import javax.swing.border.BevelBorder;



class xz extends JFrame
{
	
	JLabel   had_label,stu_name,college_name,stu_f_name,mobile_number,permanent_addr,email_id,gender,dob,quali_pursuing,amount,module_enrolled_in ;
	JTextField  stu_name_t1,college_name_t2,stu_f_name_t3,mobile_number_t4,permanent_addr_t5,email_id_t6,dob_t7,quali_pursuing_t8,amount_t9;
	JButton submit_b1,cancel_b2,reset_b3;
	CheckboxGroup  cbg;
	Checkbox cb1,cb2;
	Choice ch1;
  
	int x=0;
	int y=20;
	xz()
	{
		setLayout(null);
		
	
		
		JLabel p1 = new JLabel();
		p1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));//LOWERED
		p1.setBounds(350,390,250,230);
		add(p1);		
		
		had_label = new JLabel("Registration Form");
		stu_name = new JLabel("Student Name");
		college_name = new JLabel("College Name");
		stu_f_name = new JLabel("Father's Name");
		mobile_number = new JLabel("Mobile Number");
		permanent_addr = new JLabel("Permanent Address");
		email_id = new JLabel("EMAIL-ID");
		gender  = new JLabel("Gender");
		dob = new JLabel("Date of Birth");
		quali_pursuing = new JLabel("Qualification:/Pursuing");
		amount = new JLabel("Fee Amount");
		module_enrolled_in = new JLabel("Module Enrolled In");
	
		
		 stu_name_t1 = new JTextField(10);
		 college_name_t2 = new JTextField(10);
		 stu_f_name_t3 = new JTextField(10);
		 mobile_number_t4 = new JTextField(10);
		 permanent_addr_t5 = new JTextField(10); 
		 email_id_t6 = new JTextField(10);
		 dob_t7 = new JTextField(10);
		 quali_pursuing_t8 = new JTextField(10);
		 amount_t9 = new JTextField(10);
		
		 
		
		 
	//****************************************************************SetBounds()
	
		had_label.setBounds(300,15,280,40);
		had_label.setFont(new Font("Brush Script MT",Font.BOLD,40));
		add(had_label);
		
		stu_name.setBounds(50+x,50+y,150,20) ;
		stu_name.setFont(new Font("Console",Font.BOLD,15));
		add(stu_name);
		stu_name_t1.setBounds(50+x,70+y,450,20);
		add(stu_name_t1);
		
		
		college_name.setBounds(50+x,100+y,150,20);
		college_name.setFont(new Font("Console",Font.BOLD,15));
		add(college_name);
		college_name_t2.setBounds(50+x,120+y,450,20);
		add(college_name_t2);
		
		stu_f_name.setBounds(50+x,150+y,150,20);
		stu_f_name.setFont(new Font("Console",Font.BOLD,15));
		add(stu_f_name);
		stu_f_name_t3.setBounds(50+x,170+y,450,20);
		add(stu_f_name_t3);
		
		mobile_number.setBounds(50+x,200+y,150,20);
		mobile_number.setFont(new Font("Console",Font.BOLD,15));
		add(mobile_number);
		mobile_number_t4.setBounds(50+x,220+y,450,20);
		add(mobile_number_t4);
		
		permanent_addr.setBounds(50+x,250+y,150,20);
		permanent_addr.setFont(new Font("Console",Font.BOLD,15));
		add(permanent_addr);
		permanent_addr_t5.setBounds(50+x,270+y,450,20);
		add(permanent_addr_t5);
		
		email_id.setBounds(50+x,300+y,150,20);
		email_id.setFont(new Font("Console",Font.BOLD,15));
		add(email_id);
		email_id_t6.setBounds(50+x,320+y,450,20);
		add(email_id_t6);
		
		gender.setBounds(50+x,350+y,90,20);
		gender.setFont(new Font("Console",Font.BOLD,15));
		add(gender);
		cbg = new CheckboxGroup();
		
		cb1 = new Checkbox("Male",cbg,true);
		cb1.setFont(new Font("Console",Font.BOLD,15));
		
		cb2 = new Checkbox("Female",cbg,false);
		cb2.setFont(new Font("Console",Font.BOLD,15));
		
		cb1.setBounds(150+x,353+y,90,20);
		cb2.setBounds(250+x,353+y,90,20);
		add(cb1);
		add(cb2);
		
		dob.setBounds(50+x,383+y,90,20);
		dob.setFont(new Font("Console",Font.BOLD,15));
		add(dob);
		dob_t7.setBounds(50+x,403+y,280,20);
		add(dob_t7);
		
		quali_pursuing.setBounds(50+x,433+y,200,20);
		quali_pursuing.setFont(new Font("Console",Font.BOLD,15));
		add(quali_pursuing);
		quali_pursuing_t8.setBounds(50+x,453+y,280,20);
		add(quali_pursuing_t8);
		
		amount.setBounds(50+x,533+y,200,20); 
		amount.setFont(new Font("Console",Font.BOLD,15));
		add(amount);
		amount_t9.setBounds(50+x,553+y,280,20);
		add(amount_t9);
		
		module_enrolled_in.setBounds(50+x,483+y,200,20); 
		module_enrolled_in.setFont(new Font("Console",Font.BOLD,15));
		add(module_enrolled_in);
		
		ch1=new Choice();
	//	ch1.setVisibleRowCount(3);
		//ch1.setMaximumRowCount(5);
		ch1.add("Select Language");
		ch1.add("C");
		ch1.add("C++");
		ch1.add("Core Java");
		ch1.add("Adv/Java");
		ch1.add("Python");
		ch1.add("Android");
		ch1.add("PHP");
		ch1.add("ASP.net");
		ch1.add("Web Devlopment");
		ch1.setBounds(50+x,503+y,280,17);
		ch1.setFont(new Font("Console",Font.BOLD,15));
		add(ch1);
		
	/*	Object arr[] = {"Select_Module","C","C++","Java","Python","Android","PHP","ASP.net","Web Devlopment"};
		jcb = new JComboBox(arr);
		jcb.setMaximumRowCount(5);
		jcb.setBounds(50+x,557+y,280,20);
		add(jcb);*/
		
		submit_b1 = new JButton("Done");
		cancel_b2 = new JButton("Cancel");
		reset_b3  = new JButton("Reset");
		
		submit_b1.setBounds(25,20,200,50);
		submit_b1.setFont(new Font("Console",Font.BOLD,15));
		p1.add(submit_b1);
		cancel_b2.setBounds(25,90,200,50);
		cancel_b2.setFont(new Font("Console",Font.BOLD,15));
		p1.add(cancel_b2);
		reset_b3.setBounds(25,160,200,50);
		reset_b3.setFont(new Font("Console",Font.BOLD,15));
		p1.add(reset_b3);
		
		this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);//PLAIN_DIALOG
	
		actionhandler_submit_b1 asb = new actionhandler_submit_b1();
		submit_b1.addActionListener(asb);
		
		
		actionhandler_cancel_b2 acb = new actionhandler_cancel_b2();
		cancel_b2.addActionListener(acb);
		actionhandler_reset_b3 arb = new actionhandler_reset_b3();
		reset_b3.addActionListener(arb);
		
		
		
	}
	
class actionhandler_submit_b1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
	
		if(ae.getSource()== submit_b1)
		{
		
	
			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			PreparedStatement pst = con.prepareStatement("insert into soft values(?,?,?,?,?,?,?,?,?,?,?)");
			
			String s1	 =   stu_name_t1.getText();
			String s2	 = 	 college_name_t2.getText();
			String s3	 = 	 stu_f_name_t3.getText();
			String s4	 = 	 mobile_number_t4.getText();
			String s5	 = 	 permanent_addr_t5.getText();
			String s6	 = 	 email_id_t6.getText();
			String s7	 = 	 dob_t7.getText();
			String s8	 = 	 quali_pursuing_t8.getText();
			String s9	 = 	 amount_t9.getText();
			String s10 = "";
			s10	 =	 ch1.getSelectedItem();
			
			Checkbox temp =  cbg.getSelectedCheckbox();
			String s11 = temp.getLabel();
			
		pst.setString(1,s1);
		pst.setString(2,s2);
		pst.setString(3,s3);
		pst.setString(4,s4);
		pst.setString(5,s5);
		pst.setString(6,s6);
		pst.setString(7,s11);
		pst.setString(8,s7);
		pst.setString(9,s8);
		pst.setString(10,s9);
		pst.setString(11,s10);
		
			pst.execute();
		
			pst.close();
			con.close();
			
		}catch(Exception e){System.out.println(e);}	
		JOptionPane.showMessageDialog(null,"Update Successfully Save...");
		 System.exit(0);
		}
			
		
	}
}


class actionhandler_cancel_b2 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== cancel_b2)
		{
			System.exit(0);
			
		}
	}
}
class actionhandler_reset_b3 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== reset_b3)
		{
			stu_name_t1.setText("");
			college_name_t2.setText("");
			stu_f_name_t3.setText("");
			mobile_number_t4.setText("");
			permanent_addr_t5.setText("");
			email_id_t6.setText("");
			dob_t7.setText("");
			quali_pursuing_t8.setText("");
			amount_t9.setText("");
			
		}
	}
}


}
class update{
	public static void main(String args[])
	{
		xz obj = new xz();
		obj.setVisible( true );
		obj.setTitle("Registration Form");
		obj.setLocation(new Point(200,10));
		obj.setResizable(false);
		obj.setSize(665,700);
		obj.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
	}
}