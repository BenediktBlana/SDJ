
public class PersonTest
{

   public static void main(String[] args)
   {
      Person person1 = new Person(new Name("KOKOT","PICA"),'F');
      Person person2 = new Person(new Name("SUKIN","SYN"),'M');
      
      System.out.println(person1.getName());
      System.out.println(person1.getFullName());
      System.out.println(person2.toString());
      
      if (person1.equals(person2)) {
         System.out.println("EQUAL");
      }
      else {
         System.out.println("NOT EQUAL");
      }
      
   }

}
