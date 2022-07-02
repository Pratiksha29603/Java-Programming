/* 	*****************PROBLEMS ON DATA STRUCTURE - COLLECTION FRAMEWORK**************************
					
STATEMENT: Stack
**********************************************************************************
*/

import java.util.*;
class StackS
{
	public static void main(String arg[])
	{
		Stack <String>  sobj=new Stack<String> ();
		
		sobj.push("India");
		sobj.push("us");
		sobj.push("London");
		sobj.push("China");
		
		System.out.println(sobj);
		//sobj.pop();
		System.out.println(sobj);
		
		Iterator <String> iobj= sobj.iterator();
		
		while(iobj.hasNext())
		{
			System.out.println(iobj);
		}
		sobj=null;
	}
}