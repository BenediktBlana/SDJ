import java.util.Scanner;

public class t103
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int[] x = new int[5];
      int index = 0;
      int min=x[0];
      int smlpos=0;
      
      

      for (int i = 0; i < x.length; i++)
      {
         System.out.print("type an integer"+"#"+i+":");
         x[i] = keyboard.nextInt();
      }
      for (int i = 0; i < x.length; i++)
      {
         if(x[i] <x[i+1])
            smlpos = x[i];
    else if (x[i] > smlpos)
            smlpos = x[i];
      }
   }
}