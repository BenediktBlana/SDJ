import java.util.*;
public class Exercise_8_03
{
   public static void main(String[] atgs) {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<String> list= new ArrayList<>();
      
      String element;
      
      while(true) {
         element =keyboard.nextLine();
         if (element.equals("")) {
            break;
         }
         list.add(element);
      }
      String[] asd = new String[list.size()];
      
      for (int i = 0; i < list.size(); i++)
      {
         asd[i] = list.get(i);
      }
      
      
      for (int i = 0; i < asd.length; i++)
      {
         System.out.println(asd[i]);
      }
      
   }
}


