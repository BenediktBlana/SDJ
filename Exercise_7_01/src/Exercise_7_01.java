import java.util.Scanner;

public class Exercise_7_01
{
      public static void main(String[]args)
      
      {
         Scanner input= new Scanner(System.in);
         int[] array1= new int[4];
         int[] array2= new int[4];
         int sum=0;
         int[] arraySum= new int[4];
         for(int i=0;i<array1.length;i++)
         {System.out.println("type Array 1 values. ");
               array1[i]=input.nextInt();
         }
         for(int i=0;i<array2.length;i++)
         {System.out.println("type Array 2 values. ");
            array2[i]=input.nextInt();
            
         }
         for(int i=0;i<arraySum.length;i++)
         {
          arraySum[i]=array1[i]+array2[i];
         
         }
         
         for(int i=0;i<arraySum.length;i++)
         { System.out.println("The sum of the arrays is "+arraySum[i]);
         }
         
      }
      

}
