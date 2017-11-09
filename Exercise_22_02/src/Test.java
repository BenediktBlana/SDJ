
public class Test
{

   public static void main(String[] args)
   {
     Education[] list = new Education[2];
      list[0] = new Programme("123", "whatever", "very low level");
      list[1] = new School("321" , "what", "asd");
    Education education=new School("bitch","kurwa",School.INFANT_SCHOOL);
      for (int i=0; i< list.length; i++)
      {
      System.out.println(list[i].toString() );
      }
System.out.println(education.toString());
   }

}
