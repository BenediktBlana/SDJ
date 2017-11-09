
public class Person
{
   private char gender;
   private Name name;
   
   public Person(Name name,char gender) {
      this.name = name;
      this.gender = gender;
   }
   
   public void setName(Name name) {
      this.name = name;
   }
   
   public void setName(String fistName, String lastName) {
      this.name.setFirstName();
      this.name.setLastName();
   }
   
   public Name getName() {
      return this.name.copy();
   }
   
   public String getFullName() {
      return this.name.getFullName();
   }
   
   public boolean isFemale() {
      return (gender == 'F');

   }
   
   public String toString() {
      String all = name.getFullName();
      if (isFemale()) {
         all+=" female";
      }
      else all+=" male";
      return all;
   }
   
   public boolean equals(Object obj) {
      if (!(obj instanceof Person)) {
         return false;
      }
      Person other = (Person)obj;
      return name.equals(other.getFullName()) && gender == other.gender;
   }
}
