
public class Person
{
   private char gender;
   private Name name;

   public Person(Name name, char gender)
   {
      this.name = name;
      this.gender = gender;
   }

   public void setName(Name name)
   {
      this.name = name;
   }

   public void setName(String firstName, String lastName)
   {
      name.setFirstName(firstName);
      name.setLastName(lastName);
   }

   public String getFullName()
   {
      return name.getFullName();
   }

   public boolean isFemale()
   {
      boolean y = true;
      boolean f = false;
      if (y)
      {
         Boolean F = true;
         return F;
      }
      else
      {
         Boolean M = false;
         return M;
      }

   }
}
