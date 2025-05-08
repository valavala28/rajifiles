import java.util.*;
class strong
{
    public static void main(String[] args)
    {
    int r,n,s=0,t;
    Scanner ab=new Scanner(System.in);
    System.out.println("enter a number");
    n=ab.nextInt();
    t=n;
    while(n>0)
    {
       r=n%10;
       s=r*r*r+s;
       n=n/10;
    }
    if(t==s)
    System.out.println("armstrong");
    else
    System.out.println("not armstrong");
    }
}
