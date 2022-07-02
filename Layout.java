import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Layout" width=400 height=200>
</applet>
*/
 public class Layout extends Applet 
 {
	TextField text1,text2,text3;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		text1=new TextField();
		add(text1);
		text2=new TextField();
		add(text2);
		text3=new TextField();
		add(text3);
	}
	public static void main(String args[])
		{
			Layout l=new Layout();
		}
 }