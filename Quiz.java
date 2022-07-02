import java.awt.*;
import java.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Quiz" width=500 height=500>
</applet>
*/
 public class Quiz extends Applet implements ItemListener
{	
	CheckboxGroup cb;
	Checkbox c1,c2,c3,c4;
	Label l1;
	TextField t1;
	String st;
	public void init()
	{
		l1=new Label("What does AWT stands for ?");
		cb=new CheckboxGroup();
		c1=new Checkbox("All Writing Tools",cb,true);
		c2=new Checkbox("Abstract Window Toolkit",cb,true);
		c3=new Checkbox("Abstract Writing Toolkit",cb,true);
		c4=new Checkbox("All Window Tool",cb,true);
		t1=new TextField(20);
		add(l1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(t1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);	
		c4.addItemListener(this);	
    }
	public void itemStateChanged(ItemEvent e)
	{
			//t1.setText(" " +((Checkbox) e.getItemSelectable()).getLabel() + " ");
			if(c1.getState())
				t1.setText("Answer is Wrong");
			else if(c2.getState())
				t1.setText("Answer is Correct");
			else if(c3.getState())
				t1.setText("Answer is Wrong");
			else if(c4.getState())
				t1.setText("Answer is Wrong");
	}
	public static void main(String args[])
	{
		Quiz q=new Quiz();
	}
}