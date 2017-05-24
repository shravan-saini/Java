public class impCallBack implements callBack	{
	public void SayH(String name)  //this methods must be public
	{
		System.out.println("hello, "+name+". Welcome to interfaces.");
	}
	
	public void SayB(String name) //this methods must be public
	{
		System.out.println("Good bye "+name);
	}
	public int x=10;
}