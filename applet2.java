import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="applet2" width=300 height=400>
	</applet>
 */
public class applet2 extends Applet
{
	Label Name,Age;
	Button submit;
	TextField namei,agei;
	Label l3;
	public void init()
	{
		l3=new Label("");
		Name = new Label("Enter your name :");
		Age= new Label("Enter your age :");
		submit = new Button("Submit");
		namei= new TextField();
		agei = new TextField();
		add(Name);
		add(Age);
		add(submit);
		add(namei);
		add(agei);
		add(l3);
		setLayout(null);
		Name.setBounds(30,50,150,20);
		Age.setBounds(30,100,150,20);
		namei.setBounds(190,50,100,20);
		agei.setBounds(190,100,100,20);
		submit.setBounds(120,150,100,20);
		l3.setBounds(20,200,200,50);
		submit.addActionListener(new myHandler());
	}
	
	public class myHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			l3.setText("Hello "+namei.getText());
		}
	}
	
}