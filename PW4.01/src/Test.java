
public class Test
{

   public static void main(String[] args)
   {
      URL url1 = new URL("com", "example", "home/index.html");
      System.out.println(url1.getDomain());
      System.out.println(url1.toString());
      URL url2 = new URL("dk", "via");
      System.out.println(url2.toString());
      
      
      Company company1 = new Company("via","horsens");
      Company company2 = new Company("via2","horsens2");
      company1.createWebsite(new Website(new URL("dk","via","path"),"content1"));
      company2.createWebsite(new Website(new URL("dk","via","path"),"content1"));
      
      System.out.println(company1.getUrl());
      System.out.println(company2.getUrl());
      
      if(company1.getUrl().equals(company2.getUrl()))
            {
         System.out.println("THEYRE EQUAL");
            }
   }

}
