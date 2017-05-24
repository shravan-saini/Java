import java.util.Scanner;
public class scanner	{
	public static void main(String[] args)	{
		
		int age;
		double sallary;
		String name;
		System.out.println("\nEnter your name- ");
		Scanner cin =new Scanner(System.in);
		name=cin.nextLine();
		System.out.println("\nEnter your age- ");
		age=cin.nextInt();
		System.out.println("\nEnter your sallary- ");
		sallary=cin.nextFloat();
		
		System.out.printf("\nname-%s\nAge-%d\nSallary-%f",name,age,sallary);
		
		
		
	}
}