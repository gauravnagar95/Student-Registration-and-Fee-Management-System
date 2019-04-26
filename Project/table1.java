import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JScrollPane;
import java.util.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



class tab1 extends JFrame
{
		tab1()
		{	
		

			DefaultTableModel m1=new DefaultTableModel(new String[]{"StudentName","FatherName","MobileNumber","Gender","ModuleEnrolledIn","FeeAmount","DueFees"},0);
			JTable table=new JTable(m1);
			
			
			
			JTableHeader header = table.getTableHeader();
			header.setBackground(Color.yellow);
			
			JScrollPane pane = new JScrollPane(table);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(pane);
			
			
			table.setBackground(Color.decode("#ff8080"));
			table.setFont(new Font("Console",Font.BOLD,15));
			table.setRowHeight(50);
			
			
			header.setFont(new Font("Console",Font.BOLD,22));
			header.setPreferredSize(new Dimension(130,50));
			pane.add(header);
			
			this.setUndecorated(true);
		    this.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysoft","root","root");
			
			ResultSet rs = st.executeQuery("select * from soft");
		
			
			while(rs.next())
			{
				String s1 = rs.getString("StudentName");
				String s2 = rs.getString("FatherName");
				String s3 = rs.getString("MobileNumber");
				String s4 = rs.getString("Gender");
				String s5 = rs.getString("ModuleEnrolledIn");
				String s6 = rs.getString("FeeAmount");
				String s7 = rs.getString("DueFees");
				
				
				
				m1.addRow(new Object[]{s1,s2,s3,s4,s5,s6,s7});
				
			}
			
			con.close();
			
		}catch(Exception e){System.out.println("Error"+e);}

		table.setModel(m1);
	}
}
class table1 
{
	public static void main(String args[])
	{
		tab1 t1=new tab1();
		t1.setSize(1200,500);
		t1.setTitle("Registration Data");
		t1.setLocation(new Point(0,0));
		t1.setVisible(true);
	}
}