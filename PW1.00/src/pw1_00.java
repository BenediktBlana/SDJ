import java.util.Scanner;
public class pw1_00
{

   public static void main(String[] args)
   {
      Scanner input= new Scanner(System.in);
      int n;
      int sum=0;
      System.out.println("enter an integer");
     n=input.nextInt();
    
     for (int i = 1; i <= n; i++)
   {
      sum+= i;
   }
    
     System.out.println("result :" + sum);
   }

}
