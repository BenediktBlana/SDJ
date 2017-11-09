import java.util.Scanner;

public class pw1_00d
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int i;
      int number=2;
      int exp;
      int sum=1;
      System.out.println("enter exponent  :");
      exp = input.nextInt();
      for (i = 1; i <= exp; i++)
      {
         sum*=2;
      }

      System.out.println(sum);
   }
}
