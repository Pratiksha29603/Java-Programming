import java.awt.*;
public class MenuD extends Frame
{
	public static void main(String args[])
	{
		MenuD m=new MenuD();
		m.setVisible(true);
		MenuBar mbr=new MenuBar();
		m.setMenuBar(mbr);
		//Creating Menus
		Menu m1=new Menu("Menu");
		Menu m2=new Menu("Home");
		
		//Adding Menus to MenuBar
		mbr.add(m1);
		mbr.add(m2);
		
		//CreatingmenuItem for file menu
		MenuItem i1=new MenuItem("Picture");
		MenuItem i2=new MenuItem("Paste");
		//Adding these to the Filemenu
		m1.add(i1);
		m2.add(i2);
		
	}
}	