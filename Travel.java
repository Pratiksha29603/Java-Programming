import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Travel" width=500 height=500>
</applet>
*/
 public class Travel extends Applet implements ItemListener
 {
	Checkbox c1,c2,c3;
	Label l1;
	public void init()
	{
		c1=new Checkbox("BEED");
		c2=new Checkbox("PUNE");
		c3=new Checkbox("LATUR");
		l1=new Label();
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(l1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String st="U selected:-";
		if(c1.getState())
		st+=c1.getLabel()+",";
		
		if(c2.getState())
		st+=c2.getLabel()+",";
		
		if(c3.getState())
		st+=c3.getLabel();
		l1.setText(st);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("BEED:-"+c1.getState(),100,100);
		g.drawString("PUNE:-"+c2.getState(),100,120);
		g.drawString("LATUR:-"+c3.getState(),100,140);
	}
	public static void main(String args[])
	{
		Travel t=new Travel();
	}
 }