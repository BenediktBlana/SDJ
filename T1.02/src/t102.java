import java.util.Scanner;

public class t102
{
      public static void main(String[]args)
      
      {
         Scanner input= new Scanner(System.in);
         int[] array1= new int[4];
         int[] array2= new int[4];
         int[] temp= new int[4];
        
         for(int i=0;i<array1.length;i++)
         {System.out.println("type Array values. ");
               array1[i]=input.nextInt();
         }
         for(int i=0;i<array1.length;i++)
         {System.out.println("Array values: "+array1[i]);
         }
        for(int i =4; i>0; i--)
        {
         
            System.out.println("Reversed: "+array1[i-1]);
            System.out.println("TEST");
         }
         

      }
}
