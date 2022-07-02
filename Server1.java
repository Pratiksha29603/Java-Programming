import java.net.*;
import java.io.*;
public class Server1
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(3456);
			Sockct s1=ss.accept();
			System.out.println("Got client");
			InputStream is=s1.getInputStream();
			OutputStream os=s1.getOutputStream();
			DataInputStream dis=new DataInputStream(is);
			DataOutputStream dos=new DataOutputStream(os);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				String line=dis.readUTF();
				System.out.println(line);
				System.out.println("Enter data");
				String str=br.readLine();
				dos.writeUTF(str);
			}
		}catch(exception e)
		{
		}
	}
}