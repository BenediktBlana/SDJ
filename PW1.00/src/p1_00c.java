import java.util.Scanner;
   public class p1_00c
   {

      public static void main(String[] args)
      {
         Scanner input= new Scanner(System.in);
         int i,fact=1;  
         int number;
         System.out.println("enter integer :");   
         number=input.nextInt();
         for(i=1;i<=number;i++){    
             fact=fact*i;    
         }    
       
        System.out.println(number+"! :" + fact);
      }

   }