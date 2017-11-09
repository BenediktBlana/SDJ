import java.util.*;

public class Execerise_7_04
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String[] list = new String[8];
      int index;
      String element;
      System.out.println("Write 7 strings");
      for (int i = 0; i < list.length - 1; i++)
      {
         list[i] = keyboard.nextLine();
      }
      System.out.println("Type index and string");
      index = keyboard.nextInt();
      element = keyboard.next();
      if (index > 7 || index < 0)
      {
         System.out.println("ERROR");
      }

      for (int i = list.length - 1; i > index; i--)
      {
         list[i] = list[i - 1];
      }
      list[index] = element;
      for (int i = 0; i < list.length; i++)
      {
         System.out.println(list[i]);
      }
      keyboard.close();
   }

}
