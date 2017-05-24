package p2;
class protection2 extends p1.protection	{
	protection2() {
		System.out.println("protection 2 constructor");
		System.out.println("n ="+n); // not accessible
		System.out.println("n_pri ="+n_pri); //not accessible
		System.out.println("n_pro ="+n_pro); //accessible
		System.out.println("n_pub ="+n_pub); // accessible
	}
}