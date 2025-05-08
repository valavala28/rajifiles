import java.util.*;
class sumdigits
{
  public static void main(String[] args)
  {
       int num=0,sum=0,r;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       num=sc.nextInt();
       while(num>0)
       {
          r=num%10;
          sum=sum+r;
          num=num/10;
       }
       System.out.println("sum of digits:"+sum);
  }
}
