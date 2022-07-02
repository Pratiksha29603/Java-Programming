/* 	*****************PROBLEMS **************************
					
STATEMENT: Addition of 2 Number using function.
**********************************************************************************
*/

import java.awt.*;

class GUI4
{
	public static void main(String arg[])
	{
			MarvellousWindow mobj1=new MarvellousWindow("First",550,500);
			MarvellousWindow mobj2=new MarvellousWindow("Pratiksha",400,500);
			
	}
}

class MarvellousWindow extends Frame
{
	public MarvellousWindow(String str, int x, int y)
	{
		super();
		setSize(x,y);
		setTitle(str);
		setVisible(true);
	}


}