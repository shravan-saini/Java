import java.awt.*;
import java.applet.*;

/*
	<applet code="sample1" height=300 width=500>
	</applet>
	*/

public class sample1 extends Applet
{
	String str="";
	public void init()
	{
		str+="inside init() -----";
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start()
	{
		str+="inside start() -----";
	}
	public void paint(Graphics g)
	{
		str+="inside paint()----";
		g.drawString(str,10,20);
	}
	
	public void stop()
	{
		super.stop();
	}
}