
public class Company
{
   private String name;
   private String adress;
   private Website website;
   
   public Company(String name,String adress)
   {
      this.name=name;
      this.adress=adress;
   }
   public void createWebsite(Website website)
   {
      this.website=website;
   }
   public String getUrl() 
   {
      return this.website.getURL();
   }
   public String getName()
   {
      return this.name;
   }
   public String getAdress()
   {
      return this.adress;
   }
}
