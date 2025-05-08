import java.util.*;
class prime
{
   public static void main(String[] args)
   {
      int n,a=1,fc=0;
      Scanner ab=new Scanner(System.in);
      System.out.println("enter a number:");
      n=ab.nextInt();
      while(a<=n)
      {
         if(n%a==0)
         fc=fc+1;
         a=a+1;
      }
         if(fc==2)
         System.out.println("prime");
         else
         System.out.println("not prime");
   }
}
