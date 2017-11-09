import java.util.Scanner;

public class pw1_03
{
   public static void main(String[] args)

   {
      Scanner input = new Scanner(System.in);

      int[] array1 = new int[10];
      int sum=0;
      double average;
      for (int i = 0; i < array1.length; i++)
      {
         System.out.println("type a value ");
         array1[i] = input.nextInt();
      }

      for (int i = 0; i < array1.length; i++)
      {
         sum += array1[i];
      }
      average=sum/10;
      for (int i = 0; i < array1.length; i++)
      {
         System.out.print(array1[i] + "  ");
      }
     
      System.out.println("average :" + average);
  
      input.close();}
  
}
