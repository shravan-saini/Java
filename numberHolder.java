public class numberHolder	{
	public class NumberHolder	{
		public int aInt;
		public float aFloat;
	}

	public static void main(String[] args)	{
		NumberHolder nh;
		nh=new NumberHolder();
		nh.aInt = 33;
		nh.aFloat = 22.389;
		System.out.println("\n aInt = "+ nh.aInt+ "\n aFloat = "+ nh.aFloat);
		
	}
}
