public class Website
{
   private String url;
   private boolean needsUpdate;

   public Website(String url)
   {
      this.url = url;
   }

   public String getUrl()
   {
      return url;
   }

   public boolean needsUpdate()
   {

      return needsUpdate;

   }

   public void markAsNotUpdated(boolean needsUpdate)
   {
      needsUpdate = true;

   }

   public void markAsUpdated(boolean needsUpdate)
   {
      needsUpdate = false;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Website))
      {
         return false;
      }
      Website other = (Website) obj;

      return url == other.url;

   }

   public String toString()
   {
      String updated;
      updated = "URl : " + url + " UPDATED";
      String notupdated;
      notupdated = "URl : " + url + " NOT UPDATED";
      if (needsUpdate = true)
         return notupdated;
      else
      {
         return updated;
      }
   }
}