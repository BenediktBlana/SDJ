
public abstract class TwoDimensionalShape
{
   private double x;
   private double y;

   public TwoDimensionalShape(double x, double y)
   {
      super();
      this.x = x;
      this.y = y;
   }

   public double getX()
   {
      return x;
   }

   public double getY()
   {
      return y;
   }

   public void moveTo(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public abstract double getArea();
   public String toString() {
      return super.toString()+ "X : "+x+" Y :"+y;
   }
}