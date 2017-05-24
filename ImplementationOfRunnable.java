class newthread	implements Runnable
{
	Thread t;
	
	newthread()
	{
		t=new Thread(this,"my thread");
		System.out.println("thread :"+t.getName());
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread :"+i);
				t.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println("child thread interuupted");
		}
		System.out.println("child thread existing");
	}
}

public class impRunnable	{
	public static void main(String[] args)
	{
		new newthread();
		
		try{
			for(int  i=1;i<=5;i++)
			{
				System.out.println("main thread :"+i);
				Thread.sleep(1000);
				
			}
		}catch(InterruptedException e)
		{
			System.out.println("main thread interruptrd .");
		}
		System.out.println("existing main thread");
	}
}