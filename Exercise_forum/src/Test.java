
public class Test
{

   public static void main(String[] args)
   {
      Member one = new Member("name", "password");
      Member one2 = new Member("name", "password");
     
      
      one.setPassword("123456");
      one2.setPassword("123456");
      System.out.println(one.getName());
      if(one.equals(one2))
      {
         System.out.println("object one and one2 are equal");
      }
      else
      {
         System.out.println("theyre not eql");
      }
   
   
   
   }
   
}
