
public class Test
{

   public static void main(String[] args)
   {
      Vehicle[] vehicles = new Vehicle[4];
      vehicles[0] = new Bicycle("Bob", 25.1, 5);
      vehicles[1] = new Car("Carl" , 8, "BZ34794");
      vehicles[2] = new SportsCar("Sally", 1, "SC21512", 290);
      vehicles[3] = new Van("Vallery", 9, "VC11222",9);
      for (int i=0; i< vehicles.length; i++)
      {
      System.out.println(vehicles[i].toString() );
      }
   

   }

}
