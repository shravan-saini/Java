import java.util.Scanner;
public class foreach	{
	public static void main(String[] args)
	{
		int[] ints = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<ints.length;i++)
			ints[i]=input.nextInt();
		int  sum =0;
		for(int x : ints)
		{
			sum+=x;
		}
		System.out.println("sum of no's = "+sum);
	}
}