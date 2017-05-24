class A {
	void show()
	{
		System.out.println("hello A");
	}
}

class B extends A{
	void show()
	{
		super.show();
		System.out.println("hello B");
	}
}

class overriding	{
	public static void main(String[] args)
	{
		B b=new B();
		b.show();
		/*
		A a= new A();
		a.show();
		a=b;
		b.show();
		*/
	}
}