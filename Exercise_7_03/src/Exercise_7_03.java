import java.util.Scanner;
public class Exercise_7_03
{
      public static void main(String[]args)
      
      {
         Scanner keyboard= new Scanner(System.in);
         String[] name= new String[8];
        
         for(int i=0;i<name.length;i++)
         {name[i]="Str"+i;
         }
         int keyin;
         String keyst;
         System.out.println("Give me index :");
         keyin=keyboard.nextInt();
         System.out.println("Give me String :");
         keyst=keyboard.next();
         
         for(int i=name.length-1;i>keyin;i++)
         {
            name[i]=name[i-1];
         }
         name[keyin] = keyst;
         
         for(int i=0; i<name.length;i++)
         {
           System.out.println(name[i]+" ,");
         }
         
          keyboard.close();
         
        
          
      }        
}
      

