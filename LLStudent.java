/* 	*****************PROBLEMS ON DATA STRUCTURE - COLLECTION FRAMEWORK**************************
					
STATEMENT: LinkedList
**********************************************************************************
*/
import java.util.*;

class LLStudent
{
	public static void main(String str[])
	{
			LinkedList <Students> lobj=new LinkedList<Students>();
			lobj.add(new Students("Amit",121,21));
			lobj.add(new Students("Pooja",221,25));
			lobj.add(new Students("Saai",152,26));
			
			
			Students ref=null;
			
			Iterator <Students> iobj=lobj.iterator();
			while(iobj.hasNext())
			{
				ref=iobj.next();
				ref.Display();
			}
			lobj=null;
			iobj=null;
			ref=null;
	}
}
class Students
{
	public String name;
	public int RID;
	public int Age;
	
	public Students(String a, int b, int c)
	{
		this.name=a;
		this.RID=b;
		this.Age=c;
	}
	
	public void Display()
	{
		System.out.println("Student Name"+ this.name + "RID:"+ this.RID + "Age:"+ this.Age);
	}
}

