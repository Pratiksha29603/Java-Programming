import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="flow" width=500 height=500>
</applet>
*/
 public class flow extends Applet 
 {
	TextField t1,t2,t3;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		t1=new Textfield(10);
		add(t1);
		t2=new Textfield(10);
		add(t2);
		t3=new Textfield(10);
		add(t3);
	}
	public static void main(String args[])
		{
			flow f=new flow();
		}
 }