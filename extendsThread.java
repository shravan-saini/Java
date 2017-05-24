class newthread	extends Thread	
{
	newthread()
	{
		super("my thread");
		System.out.println("thread : "+this);
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread :"+i);
				Thread.sleep(0);
				
			}
		}catch(InterruptedException e)	{
			System.out.println("child thread interrupted");
		}
		System.out.println("existing child thread");
	}

}

public class extendsThread	{
	public static void main(String[] args)
	{
		new newthread();
		
		try
		{
			System.out.println("thread : "+Thread.currentThread());
			for(int i=1;i<=5;i++)
			{
				
				System.out.println("main thread :"+i);
				Thread.sleep(0);
			}
		}catch(InterruptedException e)	{
			System.out.println("main thread interrupted");
		}
		System.out.println("existing main thread");
	}
}