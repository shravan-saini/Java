import java.io.*;
import java.net.*;
public class read_writeClient	{
	public static void main(String[] args)
	{
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name=br.readLine();
		
		Socket s= new Socket("localhost",3344);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF(name);
		String fname=(String)din.readUTF();
		String str="",str2="";
		
		while(!str.equals("stop"))
		{
			str=br.readLine();
			System.out.println("you > "+str);
			dout.writeUTF(str);
			str2=(String)din.readUTF();
			System.out.println(str2+" < "+fname);
		}
		din.close();
		dout.close();
		s.close();
		}catch(Exception e)	{
			System.out.println(e);
		}
	}
}