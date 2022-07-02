import java.awt.*;
import java.*;
import java.awt.event.*;
class GraphApp2 extends Frame
{
	GraphApp2()
	{
		super("GraphApp2");
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,100,400,100);
		g.drawLine(100,100,100,400);
		g.drawLine(100,400,400,400);
		g.drawLine(400,100,400,400);
		g.drawRect(110,110,280,280);
		g.fillRect(120,120,260,260);
		g.setColor(Color.red);
		g.fillRect(130,130,240,240);
		g.setColor(Color.green);
		g.fillRect(140,140,220,220);
		g.setColor(Color.blue);
		g.fillRect(150,150,200,200);
		Color c1=new Color(0.001f,0.255f,0.8f);
		g.setColor(c1);
		g.fillOval(160,160,180,180);
	}
	public static void main(String args[])
	{
		GraphApp2 g2=new GraphApp2();
	}
}	