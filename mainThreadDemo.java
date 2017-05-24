class mainThreadDemo	{
	public static void main(String[] args)
	{
		
		Thread t =Thread.currentThread();
		
		System.out.println("thread : "+t);
		t.setName("My thread");
		System.out.println("thrread :"+t);
		
		System.out.println("name :"+t.getName());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("sleep is interrupted");
			}
		}
		
	}
}