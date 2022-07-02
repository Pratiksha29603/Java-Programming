import java.awt.*;
class Examplee 
{
	Examplee()
	{
	Frame f1=new Frame();
	Button B1=new Button("Hello");
	B1.setBounds(200,50,30,20);
	f1.setSize(505,505);
	f1.setLayout(new FlowLayout());
	f1.add(B1);
	f1.setVisible(true);
	}
	public static void main(String args[])
		{
			Examplee e1=new Examplee();
		}
}	