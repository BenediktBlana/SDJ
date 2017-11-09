
public class Website
{
   private String content;
   private URL url;
   
   public Website(URL url, String content)
   {
      this.url=url;
      this.content=content;
   }
   public String getURL()
   {  
      return url.toString();
   }
   public String getContent()
   {
      return content;
   }
   public void setContent(String content)
   {
      this.url=url;
   }
   public Website copy()
   {
      Website other = new Website( url,content);
      return other;
   }
}
