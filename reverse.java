import java.util.*;
class reverse
{
    public static void main(String[] args)
    {
       int r,n,s=0;
       Scanner ab=new Scanner(System.in);
       System.out.println("enter a value");
       n=ab.nextInt();
       while(n>0)
       {
          r=n%10;
          s=s*10+r;
          n=n/10;
       }
       System.out.println(s);
    }
}
