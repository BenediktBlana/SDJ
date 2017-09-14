import java.util.*;

public class Exercise_8_05
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<Integer> positiveList = new ArrayList<>();
      ArrayList<Integer> negativeList = new ArrayList<>();

      int number, pos = 0, neg = 0, max = 0, min = 0;
      while (true)
      {
         number = keyboard.nextInt();

         if (number == 0)
         {
            break;
         }

         if (number > 0)
         {
            positiveList.add(number);
            pos++;
         }

         else if (number < 0)
         {
            negativeList.add(number);
            neg++;
         }

      }
      for (int i = 0; i <positiveList.size(); i++)
      {
         if (max < positiveList.get(i))
         {max= positiveList.get(i);
            
         }
         if (min > negativeList.get(i))
         {min= negativeList.get(i);
            
         }
      }
      System.out
            .println(" Positive numbers :" + pos + " Negative numbers :" + neg
                  + " Biggest number :"+max+" Lowest number :"+min);
   }
}
