import java.io.*;
import java.net.*;
public class Url	{
	public static void main(String[] args)
	{
		try{
			URL url= new URL("https://www.lovecalculator.freevar.com/index.php");
			System.out.println("host name :"+url.getHost());
			System.out.println("port name :"+url.getPort());
			System.out.println("protocol :"+url.getProtocol());
			System.out.println("file name :"+url.getFile());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}