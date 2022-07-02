import java.util.*;
public class Vectordemo
{
	public static void main(String args[])
	{
		Vector v=new Vector(3,2);
		System.out.println("initial size"+v.size());
		System.out.println("initial capacity"+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Double(5.45));
		v.addElement(new Float(9.4));
		v.addElement(new Character('c'));
		v.addElement(new String("ab"));
		int s=v.size();
		for(int i=0;i<s;i++)
		{
			System.out.println("element is vector");
			System.out.println(v.elementAt(i));
		}
	}
}
