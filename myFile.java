import java.io.*;
import java.net.*;
public class myFile	{
	public static void main(String[] args)
	{
		try{
			
			Socket s = new Socket("localhost",4454);
			
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			
			dout.writeUTF("hello server");
			
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e)	{
			System.out.println(e);
		}
	}
}