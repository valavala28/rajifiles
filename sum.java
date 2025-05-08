import java.util.*;
class sum
{
    public static void main(String[] args)
    {
       int n=1,s=0,r=100;
       Scanner ab=new Scanner(System.in);
       System.out.println("sum of natural numbers is:");
       while(n<=r)
       {
         s=s+n;
         n=n+1;
         System.out.println(s);
       }
     }
}
