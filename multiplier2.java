import java.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="multiplier2" width=400 height=200>
</applet>
*/
 public class multiplier2 extends Applet implements ActionListener
 {
	TextField text1,text2,text3;
	Label multiplylabel;
	Button b1;
	public void init()
	{
		setLayout(new GridLayout(5, 1));
		text1=new TextField(10);
		add(text1);
		multiplylabel=new Label("*",Label.CENTER);
		add( multiplylabel);
		text2=new TextField(10);
		add(text2);
		b1=new Button("=");
		add(b1);
		b1.addActionListener(this);
		text3=new TextField(10);
		add(text3);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int product=Integer.parseInt(text1.getText())*
			Integer.parseInt(text2.getText());
			text3.setText(String.valueOf(product));
		}
	}
	public static void main(String args[])
		{
			multiplier2 m2=new multiplier2();
		}
 }