import java.io.*;
import java.net.*;
public class UrlCon	{
	public static void main(String[] args)
	{
		try{
			URL url= new URL("http://www.lovecalculator.freevar.com");
			URLConnection urlcon = url.openConnection();
			
			InputStream stream = urlcon.getInputStream();
			
			int i;
			int count=0;
			while((i=stream.read())!=-1)
			{
				System.out.print((char)i);
				count++;
			}
			System.out.println("count = "+count);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}