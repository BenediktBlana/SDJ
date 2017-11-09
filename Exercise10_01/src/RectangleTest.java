import java.util.Scanner;
public class RectangleTest
{
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   double x;
   double y;
   System.out.println("enter X");
   x=in.nextDouble();
   System.out.println("enter Y");
   y=in.nextDouble();
Rectangle box = new Rectangle(x,y);
System.out.println("The length is " + box.getLength());
System.out.println("The width is " + box.getWidth());
System.out.println("The area is " + box.getArea());
}
}