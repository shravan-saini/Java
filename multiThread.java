class newthread	implements Runnable
{
	Thread t;
	String tname;
	newthread(String str)
	{
		tname=str;
		t=new Thread(this,str);
		System.out.println(str +": "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(tname +":"+i);
				Thread.sleep(3000);
			}
		}catch(InterruptedException e)	{
			System.out.println(tname +"interrupted");
		}
		System.out.println("existing thread :"+tname);
	}
}
public class multiThread	{
public static void main(String[] args)
	{
		newthread t1=new newthread("thread_1");
		newthread t2=new newthread("thread_2");
		newthread t3=new newthread("thread_3");
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread: "+i);
				Thread.sleep(10000);
			}
		}catch(InterruptedException e){
			System.out.println("main interrupted");
		}
		System.out.println("existing main");
		
		
		
	}
}