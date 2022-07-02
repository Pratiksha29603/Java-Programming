import java.awt.*;
class Example extends Frame
{
	Example()
	{
		setSize(500,500);
		//Label l1=new Label("cm6g");
		Label l2=new Label("Name");
		//Label l3=new Label("age");
		//Textfield T1= new Textfield();
		//Textfield T2= new Textfield();
		l2.setBounds(250,100,50,20);
		//setBound(10,10,100,30);
		//setBound(10,50,100,30);
		//add(l1);
		add(l2);
		//add(l3);
		setVisible(true);

		}
		public static void main(String args[])
		{
			Example e1=new Example();
		}
}