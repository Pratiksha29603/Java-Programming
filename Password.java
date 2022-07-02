import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="Password" width=300 height=300>
</applet>
*/
 public class Password extends Applet implements ActionListener
{
	TextField t1,t2;
	public void init()
	{
		t1=new TextField(30);
		t2=new TextField(30);
		add(t1);
		add(t2);
		t1.setEchoChar('*');
		t1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==t1)
		{
			t2.setText(t1.getText());
		}
	}
	public static void main(String args[])
	{
		Password p=new Password();
	}
}