import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet>
<applet code="OvalEx.class" width=600 height=600>
</applet>*/
	public class OvalEx extends Applet
	{
		public void init()
		{
			Random rnd=new Random();
		}	
		public void paint(Graphics g)
		{
			for(int i=0;i<500;i++)
			{
				g.clearRect(0,0,600,600);
				g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
				g.fillOval(i,i,100,100);
				try
				{
				  thread.sleep(100);
				}catch(Exception e);
				{}
			}
			
		}
	}
	
	