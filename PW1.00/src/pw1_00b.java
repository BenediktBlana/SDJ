import java.util.Scanner;
   public class pw1_00b
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
         sum= sum+=i/(i+1);
         
         
      }
       
       
        System.out.println("result :" + sum);
      }

   }

