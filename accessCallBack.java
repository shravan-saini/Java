public class accessCallBack	{
	public static void main(String args[])
	{
		callBack c= new impCallBack();
		c.SayH("saini");
		c.SayB("mary");
		System.out.println(""+c.x);	//here the value of x inside the interface will be printed,ie x=9
		
		c=new impCallBack2();
		c.SayH("saini");
		c.SayB("marry");
		System.out.println(""+c.x);// x=9
	}
}