import java.io.*;
import java.net.*;
public class Inetaddress	{
	public static void main(String[] args)
	{
		try{
			
			InetAddress ip = InetAddress.getLocalHost();
			
			System.out.println("host name :"+ip.getHostName());
			System.out.println("add :"+ip.getHostAddress());

		
		}catch(Exception e)	{
			System.out.println(e);
		}
	}
}