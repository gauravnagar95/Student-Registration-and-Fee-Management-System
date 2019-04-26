import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JScrollPane;
import java.util.*;
import javax.swing.table.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



class tab2 extends JFrame 
{
		tab2()
		{	
									
			DefaultTableModel m1=new DefaultTableModel(new String[]{"Module","Fees"},0);
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
			
			Statement st = con.createStatement();
	
			ResultSet rs = st.executeQuery("select * from fstructure");
		
			
			while(rs.next())
			{
				String s1 = rs.getString("Module");
				String s2 = rs.getString("Fees");
				
				
				m1.addRow(new Object[]{s1,s2});
				
			}
			
			con.close();
			
		}catch(Exception e){System.out.println("Error"+e);}

		table.setModel(m1);
				
	}
}
class tablefee 
{
	public static void main(String args[])
	{
		tab2 t1=new tab2();
		t1.setSize(900,400);
		t1.setTitle("Fee Structure");
		t1.setLocation(new Point(0,0));
		t1.setVisible(true);
	}
}