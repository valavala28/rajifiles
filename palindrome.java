import java.util.*;
class palindrome
{
    public static void main(String[] args)
    {
    int r,n,s=0,t;
    Scanner ab=new Scanner(System.in);
    System.out.println("enter number:");
    n=ab.nextInt();
    t=n;
    while(n>0)
    {
            r=n%10;
            s=s*10+r;
            n=n/10;
    }
    if(t==s)
    {
          System.out.println("palindrome");
    }
    else 
    {
          System.out.println("not palendrome");
    }
    }
}
