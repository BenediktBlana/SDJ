
public class Bicycle extends Vehicle
{
   private int gears;
   
   public Bicycle(String owner, double price,int gears) {
      super(owner,price);
      this.gears=gears;
   }
   public void setGears(int gears) {
      this.gears=gears;
   }
   public int getGears() {
      return gears;
   }
   public String toString()
   {
      return super.toString() + ", GEARS :" + gears;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Bicycle))
         return false;
      Bicycle other = (Bicycle) obj;
      return super.equals(obj) && gears==other.gears;
   }
}
