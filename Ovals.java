import java.awt.*;
import java.applet.*;
/*<applet>
<applet code="Ovals.class" width=600 height=600>
</applet>*/
	public class Ovals extends Applet
	{
		public void init()
		{
			setBackground(Color.BLACK);
		}	
		public void paint(Graphics g)
		{
			g.drawOval(200,200,200,200);
			g.setColor(Color.black);
		}
	}
	
