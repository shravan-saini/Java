import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static double rec(int n, float d)
	{
		double result;
		if(n==0)
			return 1/d;
		result=(n+1)/((rec(n-1,d)+1));
		return (double)result;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double p1=1,p2=1;
        int P1,P2;
        int q=scan.nextInt();
        for(int i=0;i<q;i++)
        {
            if(scan.nextInt()==1)
            {
                int l,r;
                float d;
                l=scan.nextInt();
                r=scan.nextInt();
                d=scan.nextFloat();
                for(int n=l;n<=r;n++)
                {
                    p1=p1*rec(n,d);
                }
                P1=(int)p1%(1000000007);
				System.out.println(P1+"");
            }
            else if(scan.nextInt()==2)
            {
                int n,m;
                float d;
                n=scan.nextInt();
                m=scan.nextInt();
                d=scan.nextFloat();
                for(int k=0;k<=m;k++)
                {
                    p2=p2*rec(n,d+k);
                }
                P2=(int)p2%(1000000007);
                System.out.println(P2+"");
                
                
            }
        }
    }
}
