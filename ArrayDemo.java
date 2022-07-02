class ArrayDemo
{
	public static void main(String arg[])
	{
		int arr[]=new int [5];  //1st way
		arr[0]=11;
		arr[1]=21;
		arr[2]=51;
		arr[3]=101;
		arr[4]=111;
		
		System.out.println("Length of Array is:"+arr.length);
		
		int brr[]={11,21,51,101,111}; //2nd way
		System.out.println("Length of Array is:"+brr.length);
		
		int crr[]=new int[] {11,21,51,101,111,102}; //3rd way
		System.out.println("Length of Array is:"+crr.length);
		
System.out.println("***********************FOR LOOP*********************");
		
		for(int iCnt=0;iCnt<arr.length;iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
		
  System.out.println("*******************WHILE LOOP*************************");
		
		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}
		
System.out.println("****************DO WHILE****************************");
		 
		 int j=0;
		 
		 do
		 {
			System.out.println(arr[j]);
			j++;
		 }
		 while(j<arr.length);
		 
 System.out.println("****************FOR EACH LOOP****************************");
	
		for(int no:arr)
		{
			System.out.println(no);
		}
	}
	

}

