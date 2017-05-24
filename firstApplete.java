import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class firstApplete extends JFrame{
	public static void main(String[] args)
	{
		new firstApplete();
	}
	public firstApplete()
	{
		this.setTitle("To Do List");
		this.setSize(400,400);
		Toolkit tk= Toolkit.getDefaultToolkit();
		Dimension dim=tk.getScreenSize();
		int xpos=(dim.width/2)-(this.getWidth()/2);
		int ypos=(dim.height/2)-(this.getHeight()/2);
		this.setLocation(xpos,ypos);
		int buttonClicked=0;
			
		
		
	
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}
	
	
		
}