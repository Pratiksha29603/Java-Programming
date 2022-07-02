/* 	*****************PROBLEMS ON DATA STRUCTURE - COLLECTION FRAMEWORK**************************
					
STATEMENT: Vector()
**********************************************************************************
*/
import java.util.*;

class HashTable
{
	public static void main(String str[])
	{
			Vector <Integer>vobj1=new Vector<Integer>();
			System.out.println("Size of vobj1 is:"+ vobj1.size());
			System.out.println("Capacity of vobj1 is:"+ vobj1.capacity());
			
			Vector <Integer>vobj2=new Vector<Integer>(20); //capacity
			System.out.println("Size of vobj2 is:"+ vobj2.size());
			System.out.println("Capacity of vobj2 is:"+ vobj2.capacity());
			
			Vector <Integer>vobj3=new Vector<Integer>(40,30); // 40-capacity size, 30-refill size
			System.out.println("Size of vobj3 is:"+ vobj3.size());
			System.out.println("Capacity of vobj3 is:"+ vobj3.capacity());
			
			vobj1.add(11);
			vobj1.add(21);
			vobj1.add(51);
			vobj1.add(41);
			vobj1.add(1031);
			vobj1.add(141);
			vobj1.add(131);
			vobj1.add(151);
			vobj1.add(171);
			vobj1.add(141);
			vobj1.add(1);
			
			System.out.println("Capacity of vobj1 is:"+ vobj1.capacity());
			
			Iterator <Integer> iobj= vobj1.iterator();
			while(iobj.hasNext())
			{
				System.out.println(iobj.next());
			}
			vobj1.clear();
	}
}
