import java.awt.*;
public class MenuDemo extends Frame
{
	public static void main(String args[])
	{
		MenuDemo m=new MenuDemo();
		m.setVisible(true);
		MenuBar mbr=new MenuBar();
		m.setMenuBar(mbr);
		//Creating Menus
		Menu filemenu=new Menu("File");
		Menu editmenu=new Menu("Edit");
		Menu viewmenu=new Menu("View");
		//Adding Menus to MenuBar
		mbr.add(filemenu);
		mbr.add(editmenu);
		mbr.add(viewmenu);
		//CreatingmenuItem for file menu
		MenuItem new1=new MenuItem("New");
		MenuItem open1=new MenuItem("Open");
		//Adding these to the Filemenu
		filemenu.add(new1);
		filemenu.add(open1);
		
	}
}	