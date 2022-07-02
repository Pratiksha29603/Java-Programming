import java.net.*;
class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
		try
		{
		URL netAddress=new URL("http://www.sun.com:8080//index.html");
		System.out.println("Protocol :"+netAddress.getProtocol());
		System.out.println("Port :"+netAddress.getPort());
		System.out.println("Host :"+netAddress.getHost());
		System.out.println("File :"+netAddress.getFile());
		}catch(Exception e)
		{
		}
	}
}