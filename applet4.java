import java.applet.*;
import java.awt.*;
/* <applet code="applet4" width="300" height="300"> </applet>
*/

public class applet4 extends Applet
{
	String msg;
	public void init()
	{
		msg="inside init() ...";
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void start()
	{
		msg+="inside start()...";
		
	}
	public void paint(Graphics g)
	{
		msg+="inside paint()...";
		g.drawString(msg,20,30);
	}
}