public class URL
{
   private String topdomain;
   private String subdomain;
   private String path;
   
   public URL (String topdomain,String subdomain,String path )
   {
      this.topdomain=topdomain;
      this.subdomain=subdomain;
      this.path=path;
   }
   public URL (String topdomain,String subdomain)
   {
      this.topdomain=topdomain;
      this.subdomain=subdomain;
      this.path=null;
   }
   public String getTopDomain()
   {
      return topdomain;
   }
   public String getSubDomain()
   {
      return subdomain;
   }
   public String getPath()
   {
      return path;
   }
   public String getDomain()
   {
      return this.subdomain+"."+this.topdomain;
   }
   public URL copy()
   {
      URL other = new URL( topdomain,subdomain,path);
      return other;
   }
   public boolean equals (Object obj)
   {
      if (!(obj instanceof URL))
      {
         return false;
      }
      URL other = (URL) obj;
      return topdomain.equals(other.topdomain) && subdomain.equals(other.subdomain) && path.equals(other.path);
   }
   public String toString()
   {
      String x;
      x =  "http://"+subdomain+"."+topdomain+"/"+path;
      return x;
   }
}
