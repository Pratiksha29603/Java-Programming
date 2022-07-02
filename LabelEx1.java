import java.awt.*;
import java.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="LabelEx1" width=400 height=200>
</applet>
*/
class LabelEx1 extends Frame Applet
{
	Label l1,l2,l3;
	LabelEx1()
	{
		super("Label Ex 1");
		setSize(500,500);
		l1=new Label();
		l2=new Label("PARI");
		l3=new Label("PRATIKSHA",Label.RIGHT);
		l1.setText("MUKTA");
		FlowLayout f=new FlowLayout();
		setLayout(f);
		l1.setBackground(Color.red);
		l2.setBackground(Color.green);
		l3.setBackground(Color.blue);
		add(l1);
		add(l2);
		add(l3);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new LabelEx1();
	}
}