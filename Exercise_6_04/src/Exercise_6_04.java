import java.util.Scanner;
public class Exercise_6_04
{

   public static void main(String[] args)
   {
  
      Scanner keyboard=new Scanner(System.in);
      int[] numbers=new int[5];
      int max = 0, secondmax = 0;
      
      for(int i=0;i<numbers.length;i++)
      {
         numbers[i]=keyboard.nextInt();
         if (numbers[i]>max)
         {
            max=numbers[i];
      }
      }
         for(int i=0;i<numbers.length;i++)
         {
            if (numbers[i]>secondmax && numbers[i]<max)
            {
               secondmax=numbers[i];
            }
         }
      System.out.println(secondmax);
      keyboard.close();
      
   }

}


