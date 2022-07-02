import java.sql.*;
class Ps_Insert
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver loaded");
			String url="jdbc:odbc:insert1";
			Connection con=DriverManager.getConnection(url);
			System.out.println("Connection created");
			int r1=11,r2=22;
			String s1="Madras",s2="Dehli";
			String str="Insert into if6g values(?,?)";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1,r1);
			ps.setString(2,s1);
			int i1=ps.executeUpdate();
			System.out.println("data Inserted"+i1);
			String str1="Insert into if6g values(?,?)";
			PreparedStatement ps1=con.prepareStatement(str);
			ps.setInt(1,r2);
			ps.setString(2,s2);
			int i2=ps1.executeUpdate();
			System.out.println("data Inserted"+i2);
			con.close();
			ps.close();
			

		}catch(Exception e)
		{
		}
	}
}