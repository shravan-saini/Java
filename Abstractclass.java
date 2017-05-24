abstract class absclass	{
	int a;
	abstract void show();
	abstract void greet();

}

class subclass extends absclass {
	
	void show()
	{
		System.out.println("a = "+a);
	}
	void greet()
	{
		System.out.println("Congo! u learned one more concept");
	}
}

public class Abstractclass {
	public static void main(String[] args)
	{
		subclass sb=new subclass();
		sb.a=7;
		sb.show();
		sb.greet();
	}
}