class A{
	A()
	{
		System.out.println("A's Constractor");
	}
}

class B extends A{
	B()
	{
		System.out.println("B's Constractor");
	}
}

class C extends B{
	C()
	{
		System.out.println("C's Constractor");
	}
}

class constractor{
	public static void main(String[] args)
	{
		C c =new C();
	}
}