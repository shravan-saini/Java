package p1;
public class Derived extends Protection	{
	public Derived()
	{
		System.out.println("derived class constructor");
		System.out.println("n ="+n);
		//System.out.println("n_pri ="+n_pri);
		System.out.println("n_pro ="+n_pro);
		System.out.println("n_pub ="+n_pub);
	}
}