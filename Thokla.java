import java.awt.*;
import java.applet.*;
/*<applet>
<applet code="Thokla.class" width=600 height=600>
</applet>*/
	public class Thokla extends Applet
	{
		public void init()
		{
			setBackground(new Color(128,200,0));
		}	
		public void paint(Graphics g)
		{
			g.drawRect(100,100,200,200);
			g.drawRect(200,200,200,200);
			g.drawLine(100,100,200,200);
			g.drawLine(300,100,400,200);
			g.drawLine(100,300,200,400);
			g.drawLine(300,300,400,400);
		}
	}
	
	