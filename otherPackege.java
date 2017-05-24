package p2;
class otherPackage	{
	otherPackage()
	{
		p1.protection p = new p1.protection();
		System.out.println("Other package constructor");
		System.out.println("p.n ="+p.n); // not accessible
		System.out.println("p.n_pri ="+p.n_pri); //not accessible
		System.out.println("p.n_pub ="+p.n_pub); //accessible
		System.out.println("p.n_pro ="+p.n_pro); // not accessible
		
		
	}
}