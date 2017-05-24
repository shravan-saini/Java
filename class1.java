class classcount	{
	private int  sno;
	static int count=1;
	
	classcount()
	{
		sno=count++;
	}
	void showSrNo()
	{
		System.out.println("I am object no"+sno);
	}
	
}

class class1{
	public static void main(String[] args)
	{
		
		new classcount().showSrNo();
		new classcount().showSrNo();
		new classcount().showSrNo();
	}
}