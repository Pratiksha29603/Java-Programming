import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/* 
<applet code="ListEx" width=500 height=500>
</applet>
*/
public class ListEx extends Applet implements ActionListener,ItemListener
{
	List l1,l2;
	Button b1,b2;
	TextField t1;
	public void init()
	{
		l1=new List(4,true);
		l2=new List(4);
		t1=new TextField(10);
		b1=new Button("Add");
		b2=new Button("Copy");
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		l2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		l1.add(t1.getText());
		else if(e.getSource()==b2)
		l2.removeAll();
		String[]s=l1.getSelectedItems();
		for(int i=0;i<s.length;i++)
		l2.add(s[i]);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String st=l2.getSelectedItem();
		t1.setText(st);
	}
	public static void main(String args[])
	{
		ListEx l=new ListEx();
	}
}