import java.awt.*;
public class MenuEx extends Frame
{
	public static void main(String args[])
	{
		MenuEx m=new MenuEx();
		m.setVisible(true);
		MenuBar mbr=new MenuBar();
		m.setMenuBar(mbr);
		//Creating Menus
		Menu m1=new Menu("PageLayout");
		Menu m2=new Menu("Referances");
		Menu m3=new Menu("Mailing");
		//Adding Menus to MenuBar
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		
	}
}	