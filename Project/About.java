import javax.swing.*;
import java.awt.*;
import javax.swing.JScrollPane;
import java.io.*;
class abt extends JFrame
{
	
	  JTextArea textArea1;
		JLabel l1;
		JButton b1;
		
		
	abt()
	{
 
	setLayout(null);
	l1 = new JLabel("SRV HR&IT Solution");
	b1 = new JButton("Done");

		

	
     Box box = Box.createHorizontalBox(); // create box
      String demo = "The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n" +"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n" +"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user.\n"+"The simplest way to create a graphical window in Java is to have an option pane pop up. An option pane is a simple message box that appears on the screen and presents a message or a request for input to the user." ;

	
      textArea1 = new JTextArea(demo); // create textarea1
	  textArea1.setFont(new Font("Console",Font.BOLD,20));
    box.add( new JScrollPane( textArea1 ) ); // add scrollpane
		box.setBounds(50,70,600,300);
	add(box);

 l1.setBounds(50,20,600,40);
 l1.setFont(new Font("console",Font.BOLD,19));
 add(l1);
 
 b1.setBounds(500,400,150,40);
 add(b1);
	}	
}
class About
{
	public static void main(String args[])
	{
		abt p= new abt();
		p.setSize(725,500);
		p.setVisible(true);
	}
}