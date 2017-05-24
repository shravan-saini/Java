import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="keyEvent" width="300" height="300"></applet> */
public class keyEvent extends Applet implements KeyListener{
	String msg="hello";
	public void init()
	{
		addKeyListener(this);
	}
	
		public void keyPressed(KeyEvent ke)
		{
			showStatus("key down");
		}
		public void keyReleased(KeyEvent ke)
		{
			showStatus("key up");
		}
		public void keyTyped(KeyEvent ke)
		{
			msg+=ke.getKeyChar();
			repaint();
		}
	
	
	public void paint(Graphics g)
	{
		g.drawString(msg,50,80);
	}
	
}