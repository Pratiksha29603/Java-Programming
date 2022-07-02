import java.applet.*;
import java.awt.*;
/*
<applet code="Textfield.class" width=300 height=300>
</applet>*/
public class Textfield extends Applet
{
	public void init()
	{
		Label l1,l2;
		l1=new Label("enter user name");
		l2=new Label("enter password");
		TextField t1,t2;
		t1=new TextField(12);
		t2=new TextField(14);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
	}	
}