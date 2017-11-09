
public class Car extends Vehicle
{
   private String regNo;

   public Car(String theOwner, double thePrice, String regNo)
   {
      super(theOwner, thePrice);
      this.regNo = regNo;
   }
   public String getRegistrationNumber() {
      return regNo;
   }
   public void getRegistrationNumber(String regNo) {
      this.regNo=regNo;
   }

   public String toString()
   {
      return super.toString() + ", regNo=" + regNo;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Car))
         return false;
      Car other = (Car) obj;
      return super.equals(obj) && regNo.equals(other.regNo);
   }

}
