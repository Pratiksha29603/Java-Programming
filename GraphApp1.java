import java.awt.*;
import java.*;
import java.awt.event.*;
class GraphApp1 extends Frame
{
	GraphApp1()
	{
		super("GraphApp1");
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,100,400,100);
		g.drawLine(100,100,100,400);
		g.drawLine(100,400,400,400);
		g.drawLine(400,100,400,400);
	}
	public static void main(String args[])
	{
		GraphApp1 g1=new GraphApp1();
	}
}