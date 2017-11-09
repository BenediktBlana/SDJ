import java.util.Scanner;

public class Exception
{

   public static void main(String[] args)
   {
      int[] myIntArray = new int[5];
      System.out.println("type an integer 10-99 : ");
      int x;
      int counter=0;
      
      Scanner in = new Scanner(System.in);
      do
      {
         try {
            
         
            x = in.nextInt();
            if (x >= 10 && x <= 99)
            {
              System.out.println("Enter next number:");
              
              myIntArray[counter]=x;
              counter++;
            }
            else
            {
               System.out.println("  Wrong number");
            }
         }
         catch(java.util.InputMismatchException e){
            System.out.println("Wrong value");
            in.next();
            
         }
         
         

      }while(counter<5);
     for(int i=0;i<myIntArray.length;i++)
     {
        System.out.println(myIntArray[i]);
     }
      
         
   }
}