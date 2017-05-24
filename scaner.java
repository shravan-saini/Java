import java.io.*;
import java.util.*;
class scaner {
    public static void main(String args[] ) {
	String stri="qwerti 126 23.332";
    Scanner sc = new Scanner(stri);
	String str = sc.next();
	int age=sc.nextInt();
	double d= sc.nextDouble();
    
	System.out.println("str ="+str);
	System.out.println("age = "+age);
	System.out.println("d ="+d);
	
	}
}
