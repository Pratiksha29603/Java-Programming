/* 	*****************PROBLEMS ON FINAL CHARACTERISTICS**************************

STATEMENT:
 
**********************************************************************************
*/
class FinalChar
{
	public static void main(String arg[])
	{
		Demo obj=new Demo();
		System.out.println("Value of j:"+obj.j);
		//obj.j++; //j++ -> j=j+1  // NA
	}

}

class Demo
{
	public int i;
	public final int j;
	Demo()
	{
		i=20;
		j=11;
	}
}