import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="ExampleBOx" width=500 height=500>
</applet>
*/
 public class ExampleBox extends Applet implements ItemListener
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
		if(e.getItemSelectable()==c1)
		{
		t1.setText("Check box 1 clicked!");
		}
		else if(e.getItemSelectable()==c2)
		{
		t1.setText("Check box 2 clicked!");
		}
		else if(e.getItemSelectable()==c3)
		{
		t1.setText("Check box 3 clicked!");
		}
		else if(e.getItemSelectable()==c4)
		{
		t1.setText("Check box 4 clicked!");
		}
	}
	public static void main(String args[])
	{
		ExampleBox c=new ExampleBox();
	}
 }