import java.io.*;
import java.net.*;
public class read_writeServer	{
	public static void main(String[] args)
	{
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		ServerSocket ss = new ServerSocket(3344);
		Socket s= ss.accept();
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String fname=(String)din.readUTF();
		String str="",str2="";
		System.out.println("Enter your name: ");
		String name=br.readLine();
		dout.writeUTF(name);
		while(!str.equals("stop"))
		{
			str=din.readUTF();
			System.out.println(str+" < "+fname);
			str2=br.readLine();
			System.out.println("you > "+str2);
			dout.writeUTF(str2);
		}
		din.close();
		dout.close();
		ss.close();
		}catch(Exception e)	{
			System.out.println(e);
		}
	}
}