
public class WebsiteTest
{

   public static void main(String[] args)
   {  
     
      Website object = new Website("www.google.com");
      Website object2 = new Website("www.youtube.com");
    
      System.out.println(object.needsUpdate());
     object.markAsNotUpdated(true);
     object2.markAsUpdated(false);
      System.out.println(object.toString());
      System.out.println(object2.toString());
      
      System.out.println(object.needsUpdate());
    if(object.equals(object2))
    {System.out.println("they're equal");
   }
    else {System.out.println("they're not equal");
    }
    }
}
