class fixedStack implements intStack	{
	private int pos;
	private int arr[];
	public void push(int n)
	{
		if(pos==arr.length)
		{
			System.out.println("Stack Overflow.");
		}
		else
			arr[++pos]=n;
		
	}
	
	public int pop()
	{
		if(pos==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return arr[pos--]; 
	}
	
	fixedStack(int size)
	{
		pos=-1;
		arr = new int[size];
	}
}