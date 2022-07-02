/* 	*****************PROBLEMS on GUI **************************
					
STATEMENT: Annonyms Inner Class
**********************************************************************************
*/

import java.awt.*;
import java.awt.event.*;

class GUI9
{
	public static void main(String arg[])
	{
			MarvellousWindow mobj1=new MarvellousWindow("First",550,500);		
	}
}

class MarvellousWindow 
{
	Frame fobj;
	public MarvellousWindow(String str, int x, int y)
	{
			fobj=new Frame(str);
			fobj.setSize(x,y);
			
			fobj.setVisible(true);
			
			fobj.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent obj)
				{
					System.exit(0);
				}				
			});
			
	}
}