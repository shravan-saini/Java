final class A {
	int a;
	void show()	{
		System.out.println("this is A's show");
	}
}

class B extends A {    // error. can't inherit a final class 
	void show()
	{
		System.out.println("this is B's show");
	}
}

public class finalClass	{
	public static void main(String[] args)
	{
		B b = new B();
		b.show();
		A a = new A();
		a.show();
	}
} 