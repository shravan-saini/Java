import java.util.Scanner;
class factorial	{
	int fact(int n)
	{
		if(n==1)return 1;
		int result;
		result=fact(n-1)*n;
		return result;
	}
}
public class factbyrec	{
	public static void main(String[] args)
	{
		System.out.printf("Enter a no. to cal it's factorial - ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.printf("factorial = %d",new factorial().fact(n));
	}
}