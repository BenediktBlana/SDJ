
public class Name
{
   private String firstName;
   private String lastName;
   
   public Name(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String getFirstName() {
      return this.firstName;
   }
   
   public String getLastName() {
      return this.lastName;
   }
   
   public void setFirstName() {
      this.firstName = firstName;
   }
   
   public void setLastName() {
      this.lastName = lastName;
   }
   
   public String getFullName() {
      return this.firstName + " " + this.lastName;
   }
   
   public Name copy(){
      Name other = new Name(firstName,lastName) ;
      return other;
   }
   
   public boolean equals(Object obj) {
      if (!(obj instanceof Name)) {
         return false;
      }
      else {
         Name other = (Name)obj;
         return firstName.equals(other.firstName) && lastName.equals(other.lastName);
      }
   }
   
}
