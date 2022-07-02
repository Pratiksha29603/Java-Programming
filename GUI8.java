/* 	*****************PROBLEMS **************************
					
STATEMENT: Addition of 2 Number using function.
**********************************************************************************
*/

import java.awt.*;
import java.awt.event.*;

class GUI8
{
	public static void main(String arg[])
	{
			MarvellousWindow mobj1=new MarvellousWindow("First",550,500);		
	}
}

class MarvellousWindow extends WindowAdapter 
{
	Frame fobj;
	public MarvellousWindow(String str, int x, int y)
	{
			fobj=new Frame(str);
			fobj.setSize(x,y);
			fobj.addWindowListener(this);
			fobj.setVisible(true);
			
	}
	
	public void windowClosing(WindowEvent obj)
	{
		System.exit(0);
	}
}