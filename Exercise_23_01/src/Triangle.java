
public class Triangle extends TwoDimensionalShape
{
   private double sideA;
   private double sideB;
   private double sideC;

   public Triangle(double x, double y, double sideA, double sideB, double sideC)
   {
      super(x, y);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;

   }
   public double getSideA() {
      return sideA;
   }
   public double getSideB() {
      return sideB;
   }
   public double getSideC() {
      return sideC;
   }
   public void setSides(double sideA, double sideB, double sideC) {
      this.sideA=sideA;
      this.sideB=sideB;
      this.sideC=sideC;
   }
   public double getArea() {
     
      return  Math.sqrt(0.5*(0.5-sideA)*(0.5-sideB)*(0.5-sideC));
   }
}
