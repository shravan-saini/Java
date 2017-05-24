
public class tryCatch	{
	public static void main(String args[])
	{
		
		int a= args[0].length();
		int b=23;
		int arr[] = {4};
		try
		{
			int c=b/a;
			System.out.println("c = "+c);
			
			
			try
			{
				if(a==1) c = a/(a-a);
				
				if(a==2)
					arr[23]=a;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("index is out of bounds");
			}
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("fef");
		}
		catch(Exception e)
		{
			System.out.println("its an exception");
		}
		
		System.out.println("Say bye to tryCatch");
	}
	
}