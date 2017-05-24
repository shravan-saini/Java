import java.util.Scanner;
class This	{
	int a;
	float b;
	void fun()	{
		int a=0;
		a=15;
		a=5;
		b=56.6;
		System.out.println("a2 = "+a);
	}
}

public class useThis	{
	public static void main(String[] args)	{
		
		This ob = new This();
		ob.fun();
		System.out.println("a1 = "+ob.a);
		System.out.println("b = "+ob.b);
	}
}