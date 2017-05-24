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
	
	int volume()
	{
		return width*height*depth;
	}

}


class BoxWeight extends Box	{
	double weight;
	
	BoxWeight(int w,int h,int d,double m)
	{
		super(w,h,d);
		weight=m;
	}
	BoxWeight(int l,double m)
	{
		super(l);
		weight=m;
	}
	BoxWeight(double m)
	{
		super();
		weight=m;
	}
	BoxWeight()
	{
		super();
		weight=-1;
	}
}