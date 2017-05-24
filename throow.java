class throow	{
	static void Exthrow()	{
		try
		{
			throw new ArithmeticException("your program is trying to divide by zero");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught in catch");
			throw e;
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		try
		{
			Exthrow();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e);
		}
	}
}