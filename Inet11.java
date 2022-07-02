import java.net.*;
class Inet11
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress Address=InetAddress.getLocalHost();
		System.out.println(Address);
		Address=InetAddress.getByName("osborne.com");
		System.out.println(Address);
		InetAddress SW[]=InetAddress.getAllByName("www.nba.com");
		for(int i=0;i<SW.length;i++)
			System.out.println(SW[i]);
		
	}
}