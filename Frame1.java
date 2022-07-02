import java.awt.*;
class Frame1 extends Frame
{
	Frame1()
	{
		
		setSize(500,500);
		
		Label l1=new Label("Marksheet");
		Label l2=new Label("JPR");
		Label l3=new Label("STE");
		Label l4=new Label("MAN");
		Label l5=new Label("TOTAL");
		Button b1=new Button("Print");
		Button b2=new Button("Cancel");
		Textfield t1=new Textfield();
		Textfield t2=new Textfield();
		Textfield t3=new Textfield();
		Textfield t4=new Textfield();
		l1.setBounds(250,50,30,20);
		//l2.setBounds();
		//l3.setBounds();
		//l4.setBounds();
		//l5.setBounds();
		//t1.setBounds();
		//t2.setBounds();
		//t3.setBounds();
		//t4.setBounds();
		//b1.setBounds();
		//b2.setBounds();
		add(l1);
		//add();
		//add();
		//add();
		//add();
		//add();
		//add();
		//add();
		//add();
		//add();
		//add();
		setVisible(true);
	}
	public static void main(String args[])
	{
		Frame1 f1=new Frame1();
	}
}
