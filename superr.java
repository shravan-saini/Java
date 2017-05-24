import java.util.*;




class superr	{
	public static void main(String[] args)
	{
		BoxWeight w1=new BoxWeight(7,2,3,4.0);
		System.out.println("the Volumeof w1 is ="+w1.volume()+" and weight = "+w1.weight);
		
		System.out.println("the volume of another box is ="+new BoxWeight().volume());
		
		System.out.println("the volume of another box is ="+new BoxWeight(5,4.4).volume());
	}
}