import java.util.*;
class perfect
{
    public static void main(String[] args)
    {
    int a=1,fs=0,n;
    Scanner ab=new Scanner(System.in);
    System.out.println("enter a number");
    n=ab.nextInt();
    while(a<n)
    {
        if(n%a==0)
        {
        fs=fs+a;
        }
        a=a+1;
    }
    if(fs==n)
    System.out.println("perfect number");
    else
    System.out.println("not perfect");
    }
}
