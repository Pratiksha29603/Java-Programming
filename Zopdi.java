import java.awt.*;
import java.applet.*;
/*<applet>
<applet code="Zopdi.class" width=600 height=600>
</applet>*/
	public class Zopdi extends Applet
	{
		public void init()
		{
			setBackground(new Color(128,200,0));
		}	
		public void paint(Graphics g)
		{
			g.drawRect(150,300,100,100);
			g.drawRect(350,300,100,50);
			g.drawLine(200,100,400,100);
			g.drawLine(200,100,100,200);
			g.drawLine(200,100,300,200);
			g.drawLine(400,100,500,200);
			g.drawLine(100,200,100,400);
			g.drawLine(300,200,300,400);
			g.drawLine(500,200,500,400);
			g.drawLine(100,400,500,400);
			g.drawLine(100,200,500,200);
		}
	}
	
	