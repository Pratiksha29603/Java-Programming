import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="LabelEx" width=200 height=200>
</applet>
*/
 public class LabelEx extends Applet
 {
	Label l1,l2,l3;
	public void init()
	{
		l1=new Label("Hey Pari...",Label.LEFT);
		l2=new Label("Hiii Mukta...",Label.CENTER);
		l3=new Label("Hello Guys!!!",Label.RIGHT);
		add(l1);
		add(l2);
		add(l3);
	}
	public static void main(String args[])
	{
		LabelEx le=new LabelEx();
	}
 }