import java.util.*;
class fibonacci
{
    public static void main(String[] args)
    {
      int i,n,a=0,b=1,c=1;
      Scanner ab=new Scanner(System.in);
      System.out.println("enter a number");
      n=ab.nextInt();
      for(i=1;i<=n;i++)
      {
        System.out.println(c);
        a=b;
        b=c;
        c=a+b;
      }
    }
}
