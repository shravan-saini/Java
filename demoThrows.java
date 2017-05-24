class demoThrows	{
	static void throwOne() throws NullPointerException
	{
		System.out.println("inside the throwOne");
		throw new NullPointerException("its a null pointer");
		
	}
	
	public static void main(String[] args)
	{
		try
		{	
			throwOne();
		}	
		catch(NullPointerException e)
		{
			System.out.println("Exception : "+e);
		}
		
		System.out.println("inside main after the call of throwOne");
	}
}