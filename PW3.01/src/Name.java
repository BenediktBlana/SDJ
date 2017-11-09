
public class Name
{
   private String firstName;
   private String lastName;

   public Name (String firstName,String lastName)
   {
      this.firstName= firstName;
      this.lastName= lastName;
   }
   public void setFirstName(String firstName)
   {
      this.firstName=firstName;
   }
   public void setLastName(String lastName)
   {
      this.lastName=lastName;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return firstName;
   }
   public String getFullName()
   {
      String x="";
      x=firstName+" "+lastName;
            return x;
   }
   public Name copy()
   {
      Name other = new Name(firstName, lastName);
      return other;
   }

   public boolean equals(Object obj)// be careful
   {
      if (!(obj instanceof Name))
      {
         return false;
      }

      Name other = (Name) obj;

      return firstName == other.firstName && lastName == other.lastName;
           
   }
   
   
   
}
