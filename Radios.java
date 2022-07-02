import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Radios" width=500 height=500>
</applet>
*/
 public class Radios extends Applet implements ItemListener
{
		CheckboxGroup radios;
		Checkbox r1,r2,r3,r4;
		TextField t1;
		public void init()
		{
			radios=new CheckboxGroup();
			r1=new Checkbox("1",false,radios);
			add(r1);
			r1.addItemListener(this);
			r2=new Checkbox("2",false,radios);
			add(r2);
			r2.addItemListener(this);
			r3=new Checkbox("3",false,radios);
			add(r3);
			r3.addItemListener(this);
			r4=new Checkbox("4",false,radios);
			add(r4);
			r4.addItemListener(this);
			t1=new TextField(20);
			add(t1);
		}
		public void itemStateChanged(ItemEvent e)
		{
			t1.setText("Radio button" +((Checkbox) e.getItemSelectable()).getLabel() + "clicked!");
		}
		public static void main(String args[])
		{
			Radios r=new Radios();
		}
}