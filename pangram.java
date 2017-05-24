import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =new Scanner(System.in);
        String s = scan.nextString();
        int flag=0;
        if(s.length()==0)
            System.out.println("not pangram");
        else
        {
            for(int i=0;i<26;i++)
            {
                char c=i+65;
                char b=i+65+32;
                int a,p;
                a=s.indexOf(c);
                p=s.indexOf(b);
                if(a>=0 || p>=0)
                {
                    flag=0;  
                    continue;              
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            (flag==1)?System.out.println("not pangram"):System.out.println("pangram");
            
        }
            
    }
}