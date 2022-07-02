import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="ExampleBox1" width=500 height=500>
</applet>
*/
 public class ExampleBox1 extends Applet implements ItemListener
 {
	Checkbox c1,c2,c3,c4;
	TextField t1;
	public void init()
	{
		c1=new Checkbox("1");
		add(c1);
		c1.addItemListener(this);
		c2=new Checkbox("2");
		add(c2);
		c2.addItemListener(this);
		c3=new Checkbox("3");
		add(c3);
		c3.addItemListener(this);
		c4=new Checkbox("4");
		add(c4);
		c4.addItemListener(this);
		t1=new TextField(20);
		add(t1);
	}
	public void itemStateChanged(ItemEvent e)
	{
		t1.setText("chech box"+((Checkbox)e.getItemSelectable()).getLabel()+"clicked!");
	}
	public static void main(String args[])
	{
		ExampleBox1 e1=new ExampleBox1();
	}
 }