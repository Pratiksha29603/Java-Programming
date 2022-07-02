import java.applet.*;
import java.awt.event.*;
/*
applet code="InnerClassDemo"width=200 height=200>
</applet>
*/
public class InnerClassDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter());
	}
	class MyMouseAdapter extends MouseAdapter
	{
	public void mousePressed(MouseEvent me)
	{
	showStatus("Mouse Pressed");
	}
	}
}
public static void main(String args[])
{
InnerClassDemo i=new InnerClassDemo();
}