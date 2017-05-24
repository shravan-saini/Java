import java.io.*;
import java.net.*;
public class httpUrlConnection	{
	public static void main(String[] args)
	{
		try{
			
				URL url = new URL("http://www.lovecalculator.freevar.com");
				HttpURLConnection huc = (HttpURLConnection)url.openConnection();
				
				for(int i=1;i<=8;i++)
				{
					System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
				}
			
		}catch(Exception e)	{
			System.out.println(e);		}

		
	}
}