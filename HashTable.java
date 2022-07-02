/* 	*****************PROBLEMS ON DATA STRUCTURE - COLLECTION FRAMEWORK**************************
					
STATEMENT: HashTable()
**********************************************************************************
*/
import java.util.*;

class HashTable
{
	public static void main(String str[])
	{
			//       key     value
		Hashtable < String, Integer> hobj=new Hashtable<String, Integer>();
		
		hobj.put("PPA",150000);
		hobj.put("LB",14000);
		hobj.put("PML",12500);
		hobj.put("LSPUI",203215);
		hobj.put("Angular",12345);
		hobj.put("C#",15642);
		
		System.out.println(hobj.get("LB")); //data search with the key
		
		System.out.println("Size of hashtable is:"+hobj.size());
		System.out.println("Data from hashtable:");
		
		hobj.remove("C#"); //removing data
		Enumeration eobj= hobj.keys();
		
		while(eobj.hasMoreElements())
		{
			System.out.println(eobj.nextElement());
		}
		
		hobj.clear(); //clearing data from table
		hobj=null;  // clear memory space
	}
}
