import java.util.*;
public class SiteCollection
{
   private int size;
   private Website [] website;
   
   public SiteCollection(int maxSites)
   {
   this.size = 0;
   this.website = new Website [maxSites];
   }
   public int getNumberOfSites()
   {
   return size;
   }
   public void addSite(Website website)
   {
   Website[maxSites] = website.copy();
   size++;
   }
   
   
}