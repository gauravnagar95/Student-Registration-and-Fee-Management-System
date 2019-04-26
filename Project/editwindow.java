import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.BevelBorder;
class EDT extends JFrame
{
	
	JLabel   stu_name,college_name,stu_f_name,mobile_number,permanent_addr,email_id,gender,dob,quali_pursuing,module_enrolled_in,fee_option_selected,amount,due_fees	;
	JTextField  stu_name_t1,college_name_t2,stu_f_name_t3,mobile_number_t4,permanent_addr_t5,email_id_t6,dob_t7,quali_pursuing_t8,amount_t9,due_fees_t10;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
	String mo,fe,du,gf;
	JButton b1;
	 
	CheckboxGroup  cbg = null;
	Checkbox cb1,cb2;
	CheckboxGroup  cbg1 = null;
	Checkbox cb3,cb4;
	Choice ch1;
	int x1 = 0;
	int y1 = 30;
	int x=0;
	int y=-30;
	String q;
	EDT()
	{
		setLayout(null);
		
		q = JOptionPane.showInputDialog(null,"Enter the Student Mobile Number");
		
		stu_name = new JLabel("Student Name");
		stu_name_t1 = new JTextField(20);
		stu_name.setBounds(50+x,50+y,150,20) ;
		stu_name.setFont(new Font("Console",Font.BOLD,15));
		add(stu_name);
		stu_name_t1.setBounds(50+x,70+y,450,20);
		add(stu_name_t1);
		
		college_name = new JLabel("College Name");
		college_name_t2 = new JTextField(20);
		college_name.setBounds(50+x,100+y,150,20);
		college_name.setFont(new Font("Console",Font.BOLD,15));
		add(college_name);
		college_name_t2.setBounds(50+x,120+y,450,20);
		add(college_name_t2);
		
		
		stu_f_name = new JLabel("Father's Name");
		stu_f_name_t3 = new JTextField(20);
		stu_f_name.setBounds(50+x,150+y,150,20);
		stu_f_name.setFont(new Font("Console",Font.BOLD,15));
		add(stu_f_name);
		stu_f_name_t3.setBounds(50+x,170+y,450,20);
		add(stu_f_name_t3);
		
		mobile_number = new JLabel("Mobile Number");
		mobile_number_t4 = new JTextField(20);
		mobile_number.setBounds(50+x,200+y,150,20);
		mobile_number.setFont(new Font("Console",Font.BOLD,15));
		add(mobile_number);
		mobile_number_t4.setBounds(50+x,220+y,450,20);
		add(mobile_number_t4);
		
		permanent_addr = new JLabel("Permanent Address");
		permanent_addr_t5 = new JTextField(20);
		permanent_addr.setBounds(50+x,250+y,150,20);
		permanent_addr.setFont(new Font("Console",Font.BOLD,15));
		add(permanent_addr);
		permanent_addr_t5.setBounds(50+x,270+y,450,20);
		add(permanent_addr_t5);
		
		email_id = new JLabel("EMAIL-ID");
		email_id_t6 = new JTextField(20);
		email_id.setBounds(50+x,300+y,150,20);
		email_id.setFont(new Font("Console",Font.BOLD,15));
		add(email_id);
		email_id_t6.setBounds(50+x,320+y,450,20);
		add(email_id_t6);
		
		gender  = new JLabel("Gender");
		gender.setBounds(50+x,350+y,90,20);
		gender.setFont(new Font("Console",Font.BOLD,15));
		add(gender);
		cbg = new CheckboxGroup();
		cb1 = new Checkbox("Male",cbg,false);
		cb1.setFont(new Font("Console",Font.BOLD,15));
		cb2 = new Checkbox("Female",cbg,false);
		cb2.setFont(new Font("Console",Font.BOLD,15));
		cb1.setBounds(150+x,353+y,90,20);
		cb2.setBounds(250+x,353+y,90,20);
		add(cb1);
		add(cb2);
		
		dob = new JLabel("Date of Birth");
		dob_t7 = new JTextField(20);
		dob.setBounds(50+x,383+y,90,20);
		dob.setFont(new Font("Console",Font.BOLD,15));
		add(dob);
		dob_t7.setBounds(50+x,403+y,280,20);
		add(dob_t7);
		
		quali_pursuing = new JLabel("Qualification:/Pursuing");
		quali_pursuing_t8 = new JTextField(20);
		quali_pursuing.setBounds(50+x,433+y,200,20);
		quali_pursuing.setFont(new Font("Console",Font.BOLD,15));
		add(quali_pursuing);
		quali_pursuing_t8.setBounds(50+x,453+y,280,20);
		add(quali_pursuing_t8);
		
		module_enrolled_in = new JLabel("Module Enrolled In");
		module_enrolled_in.setBounds(50+x,483+y,200,20);  
		module_enrolled_in.setFont(new Font("Console",Font.BOLD,15));
		add(module_enrolled_in);
		ch1=new Choice();
		//ch1.setVisibleRowCount(3);
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
		ch1.setBounds(50+x,503+y,280,20);   
		ch1.setFont(new Font("Console",Font.BOLD,12));
		add(ch1);
		
		fee_option_selected = new JLabel("Fee Option Selected");
		fee_option_selected.setFont(new Font("Console",Font.BOLD,15));
		fee_option_selected.setBounds(50+x,533+y,280,20);
		add(fee_option_selected);
		cbg1 = new CheckboxGroup();
		cb3 = new Checkbox("Full Payment",cbg1,false);
		cb4 = new Checkbox("Two Instalments",cbg1,false);
		cb3.setBounds(50+x,563+y,120,20);
		cb3.setFont(new Font("Console",Font.BOLD,14));
		cb4.setFont(new Font("Console",Font.BOLD,14));
		cb4.setBounds(170+x,563+y,130,20);
		add(cb3);
		add(cb4);
		
		
		amount = new JLabel("Fee Amount");
		amount_t9 = new JTextField(20);
		amount.setBounds(50+x1,533+y1,200,20);   
		amount.setFont(new Font("Console",Font.BOLD,15));
		add(amount);
		amount_t9.setBounds(50+x1,553+y1,280,20);  
		add(amount_t9);
		
		
		due_fees = new JLabel("Due Fees");
		due_fees_t10 = new JTextField(20);
		due_fees.setBounds(50+x1,583+y1,280,20);
		due_fees.setFont(new Font("Console",Font.BOLD,15));
		due_fees_t10.setBounds(50+x1,603+y1,280,20);
		add(due_fees);
		add(due_fees_t10);
		
		
		b1 = new JButton("Save update");
		b1.setBounds(400,480,200,150);
		b1.setFont(new Font("Console",Font.BOLD,20));
		add(b1);
		
		
		/*this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);//FRAME*/
	
		actionhandler_b1 asb = new actionhandler_b1();
		b1.addActionListener(asb);
		
		actionhandler_choice acho = new actionhandler_choice();
		ch1.addItemListener(acho);
		
		actionhandler_radio_fee arf = new actionhandler_radio_fee();
		cb4.addItemListener(arf);
		cb3.addItemListener(arf);
		
		try
		{
			 
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			
			Statement st = con.createStatement();
			
			
			
			ResultSet rs = st.executeQuery("select * from soft where MobileNumber ='"+q+"' ");
		
			
			while(rs.next())
			{
				
				 s1 = rs.getString("StudentName");
				 s2 = rs.getString("CollegeName");
				 s3 = rs.getString("FatherName");
				 s4 = rs.getString("MobileNumber");
				 s5 = rs.getString("PermanentAddress");
				 s6 = rs.getString("EmailID");
				 s7 = rs.getString("Gender");
				 s8 = rs.getString("DateOfBirth");
				 s9 = rs.getString("QualificationPursuing");
				 s10 = rs.getString("ModuleEnrolledIn");
				 s11 = rs.getString("FeeOptionSelected");
				 s12 = rs.getString("FeeAmount");	
				 s13 = rs.getString("DueFees");
				 
				 
				
				stu_name_t1.setText(s1);
				college_name_t2.setText(s2);
				stu_f_name_t3.setText(s3);
				mobile_number_t4.setText(s4);
				permanent_addr_t5.setText(s5);
				email_id_t6.setText(s6);
				
				 if(s7.equals("Male"))
				 {
					 cbg.setSelectedCheckbox(cb1);
				 }
				 if(s7.equals("Female"))
				 {
					 cbg.setSelectedCheckbox(cb2);
				 }
				 
				dob_t7.setText(s8);
				quali_pursuing_t8.setText(s9);
				ch1.select(s10);
				
				
				if(s11.equals("Two Instalments"))
				 cbg1.setSelectedCheckbox(cb4);
				if(s11.equals("Full Payment"))
				cbg1.setSelectedCheckbox(cb3);
			
				amount_t9.setText(s12);
				due_fees_t10.setText(s13);
			
				 
			}
			
				
			st.close();
			con.close();
			
		}catch(Exception e){System.out.println("Error"+e);}	
}
	
	
class actionhandler_b1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
	
		if(ae.getSource() == b1)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			
					String ss1	 =   stu_name_t1.getText();
					String ss2	 = 	 college_name_t2.getText();
					String ss3	 = 	 stu_f_name_t3.getText();
					String ss4	 = 	 mobile_number_t4.getText();
					String ss5	 = 	 permanent_addr_t5.getText();
					String ss6	 = 	 email_id_t6.getText();
					Checkbox temp1 = cbg.getSelectedCheckbox();
					String ss7   =  temp1.getLabel();
					String ss8	 = 	 dob_t7.getText();
					String ss9	 = 	 quali_pursuing_t8.getText();
					String ss10	 =	 ch1.getSelectedItem();
					Checkbox temp2 = cbg1.getSelectedCheckbox();
					String ss11 =    temp2.getLabel();
					String ss12	 = 	 amount_t9.getText();
					String ss13  =   due_fees_t10.getText();
					 
			
				Statement st = con.createStatement();
				st.executeUpdate("UPDATE soft SET StudentName = '"+ss1+"', CollegeName = '"+ss2+"' , FatherName = '"+ss3+"', MobileNumber = '"+ss4+"' , PermanentAddress = '"+ss5+"' , EmailID = '"+ss6+"' , Gender = '"+ss7+"' , DateOfBirth = '"+ss8+"' , QualificationPursuing = '"+ss9+"' ,  ModuleEnrolledIn = '"+ss10+"' ,FeeOptionSelected = '"+ss11+"' ,  FeeAmount = '"+ss12+"' , DueFees = '"+ss13+"' " + "WHERE MobileNumber = '"+q+"' ");
		
				st.close();
				con.close();
			
		  }catch(Exception e){System.out.println(e);}
		
		JOptionPane.showMessageDialog(null,"Update Successfully Save");
		dispose();
		}
			
		
	}
}


class actionhandler_choice implements ItemListener
{
	public void itemStateChanged(ItemEvent ie)
	{
	
		if(ie.getSource() == ch1)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			
				Statement st = con.createStatement();
	
			
				ResultSet rs = st.executeQuery("select * from fstructure");
			
		
				while(rs.next())
				{
					 mo = rs.getString("Module");
					 fe = rs.getString("Fees");
					
				}
					amount_t9.setText(fe);
					due_fees_t10.setText("0.0");
					cbg1.setSelectedCheckbox(cb3);
				
				st.close();
				con.close();
			
		   }catch(Exception e){System.out.println("Error"+e);}
		
	   }
	}
}

class actionhandler_radio_fee implements ItemListener
{
	public void itemStateChanged(ItemEvent ie)
	{
		
		if(ie.getSource() == cb4)
		{
			
			String gg=JOptionPane.showInputDialog(null,"Enter The Amount");
			int am = Integer.parseInt(gg);
			int v = Integer.parseInt(fe);
			int value;
			value = v-am;
			String sd = String.valueOf(value);
			due_fees_t10.setText(sd);
			amount_t9.setText(gg);
			System.out.println("due fee ="+sd);
			
		}
		if(ie.getSource() == cb3)
		{	
			int p=0;
			
			if(p == 0)
			{
			
		
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from fstructure");
					
			
					while(rs.next())
					{
					  mo = rs.getString("Module");
					  fe = rs.getString("Fees");
					
					if(s10.equals(mo))
						break;
					}
					
					amount_t9.setText(fe);
					due_fees_t10.setText("0.0");
				
				
				}catch(Exception e){System.out.println("Error"+e);}
				p++;
		}
	}
}
}

}
class editwindow
{
	public static void main(String args[])
	{
		EDT ed = new EDT();
		ed.setVisible( true );
		ed.setTitle("EDIT");
		ed.setLocation(new Point(200,10));
		ed.setResizable(false);
		ed.setSize(665,700);
		//ed.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
	}
}