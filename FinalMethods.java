class A	{
	int x;
	final void show()
	{
		System.out.println("this is show method of class A");
	}

}

class B extends A	{
	/*void show()   //error. can't override a final method.
	{
		System.out.println("this is show of B");
	}*/
}

public class finalMethods	{
	public static void main(String[] args)
	{
		B b= new B();
		b.show();
		A a= new A();
		a.show();
	}
}