import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Scrollbar" width=500 height=500>
</applet>
*/
public class Scrollbar extends Applet implements AdjustmentListener
{
	ScrollBar hs,vs;
	public void init()
	{
		hs=new ScrollBar(ScrollBar.HORIZONTAL,1,1,1,100);
		vs=new ScrollBar(ScrollBar.VERTICAL,1,1,1,100);
		setLayout(null);
		hs.setBounds(100,300,200,30);
		vs.setbounds(300,100,30,200);
		add(hs);
		add(vs);
		hs.addAdjustmentListener(this);
		vs.addAdjustmentListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawOval(100,100 hs.getvalue();vs.getvalue());
	}
	public static void main(String args[])
	{
		Scrollbar s=new Scrollbar();
	}
}