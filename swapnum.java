import java.util.*;
class swapnum
{
    public static void main(String[] args)
    {
      int x,y;
      System.out.println("enter x and y");
      Scanner ab=new Scanner(System.in);
      x=ab.nextInt();
      y=ab.nextInt();
      System.out.println("before swaping\n x=" +x +"\n y="+y);
      x=x+y;
      y=x-y;
      x=x-y;
      System.out.println("after swapping \n x=" +x +"\ny="+y);
    }
}
