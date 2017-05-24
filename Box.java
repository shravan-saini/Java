class Box	{
	private int height;
	private int width,depth;
	
	Box()
	{
		height=-1;
		width=-1;
		depth=-1;
	}
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(int l)
	{
		width=l;
		height=1;
		depth=1;
	}
	
	public int volume()
	{
		return width*height*depth;
	}

}