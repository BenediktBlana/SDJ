
public class SportsCar extends Car
{
   private int maxVelocity;
   
   public SportsCar(String theOwner,double thePrice,String regNo,int maxVelocity) {
      super(theOwner,thePrice,regNo);
      this.maxVelocity=maxVelocity;
   }
   public int getMaxVelocity() {
      return maxVelocity;
   }
   public String toString()
   {
      return super.toString() + ", MAX VELOCITY :" + maxVelocity;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof SportsCar))
         return false;
      SportsCar other = (SportsCar) obj;
      return super.equals(obj) && maxVelocity==other.maxVelocity;
   }
}
