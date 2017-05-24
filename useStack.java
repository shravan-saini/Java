public class useStack	{
	public static void main(String args[])
	{
		intStack st = new fixedStack(5);
		for(int i=0;i<5;i++)
			st.push(i+1);
		
		System.out.println("The elements in the stack are...");
		for(int i=0;i<6;i++)
		{
			System.out.println(st.pop());
		}
	}
}