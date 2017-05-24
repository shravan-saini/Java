class queue 	{
	
	private int front,rear;
	private int[] arr;
	private int size;
	
	queue(int length)
	{
		arr=new int[length];
		front=-1;
		rear=-1;
		size=length;
	}
	void insert(int x)
	{
		if((rear==front-1) || (rear==size-1 && front==0))
		{
			System.out.println("queue is full");
			return;
		}
		
		if(front==-1 && rear==-1)
		{
			front=0;
			
		}
		if(rear==size-1)
			rear=-1;
		arr[++rear]=x;
		
	}
	void remove()	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		int temp=arr[front];
		if(rear==front)
		{
			rear=-1;
			front=-1;
		
		}
		if(front==size-1)
			front=0;
		front++;
		System.out.println("removed item :"+temp);
		
		
		
	}
	
	void display()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		int p=front;
		if(rear>=front)
		{
			while(p<=rear)
				System.out.printf(arr[p++]+" ");
		}
		else
		{
			while(p<=size-1)
				System.out.printf(arr[p++]+" ");
			p=0;
			while(p<=rear)
				System.out.printf(arr[p++]+" ");
				
		}
	}
	
}


