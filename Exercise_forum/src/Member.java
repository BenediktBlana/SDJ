public class Member
{
   private String name;
   private String password;

   public Member(String name, String password)
   {
      this.name=name;
      this.password=password;
   }
   public String getName() {
      return name;
   }
   public void setPassword(String password)
   {
      this.password=password;
   }
   public boolean checkPassword()
   {
      if(password.equals(password))
      {return true;}
      else
      {
         return false;
      }
   }
   public boolean equals(Object obj)// be careful
   {
      if (!(obj instanceof Member))
      {
         return false;
      }
      Member other = (Member) obj;

      return name == other.name && password == other.password;
            
   }
}
