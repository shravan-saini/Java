import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="applet5" width="300" height="300"> </applet>
*/

public class applet5 extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	Label l3;
	public void init()
	{
		l1=new Label("first no. ");
		l2=new Label("Second no. ");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");
		l3=new Label();
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(l3);
		setLayout(null);
		l1.setBounds(20,50,100,20);
		l2.setBounds(20,90,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,90,100,20);
		b1.setBounds(70,140,50,30);
		l3.setBounds(30,200,100,20);
		b1.addActionListener(new MyHandler());


	}
	public class MyHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,s;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			s=a+b;
			l3.setText("sum is ="+s);
		}
	}
	
}