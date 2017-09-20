import java.util.Scanner;
public class PersonTest
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      Person box = new Person("CHUJ" , "11th September");
      System.out.println(" NAME " + box.getName());
      System.out.println("birthday "+box.getBirthday());
   }
}
