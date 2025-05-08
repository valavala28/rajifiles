import java.util.*;
class QuadraticEqn
{
  public static void main(String[] args)
  {
    int a,b,c;
    double root1,root2,d;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a value");
    a=s.nextInt();
    System.out.println("enter b value");
    b=s.nextInt();
    System.out.println("enter c value");
    c=s.nextInt();
    d=b*b-4*a*c;
    System.out.println(d);
    if(d>0)
    {
        System.out.println("roots are real and unequal");
        root1=(-b+Math.sqrt(d)/(2*a));
        root2=(-b-Math.sqrt(d)/(2*a));
        System.out.println("first root is:"+root1);
        System.out.println("first root is:"+root2);
    }
    else if(d==0)
    {
        System.out.println("roots are real and equal");
        root1=root2=(-b+Math.sqrt(d)/(2*a));
        System.out.println("first root is:"+root1);
        System.out.println("first root is:"+root2);
    }
    else
    {
      System.out.println("roots are imaginary");
    }
 }
}
