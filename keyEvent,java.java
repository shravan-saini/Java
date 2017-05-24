import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class keyEvent extends Applet{
	String msg;
	public void init()
	{
		addKeyListener(new MyHandler());
	}
	public class MyHandler implements KeyListener
	{
		public void KeyPressed(KeyEvent ke)
		{
			showstatus("key down");
		}
		public void KeyReleased(KeyEvent ke)
		{
			showStatus("key up");
		}
		public void KeyTyped(KeyEvent ke)
		{
			msg+=ke.getKeyChar();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawPaint(msg,50,80);
	}
	
}