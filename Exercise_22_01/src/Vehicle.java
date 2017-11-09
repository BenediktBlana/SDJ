
   public class Vehicle extends Object
   {
   private String owner;
   private double price;
   public Vehicle(String owner, double price)
   {
   super();
   this.owner = owner;
   this.price = price;
   }
   public String getOwner(){
      return owner;
   }
   public void setOwner(String theOwner) {
      this.owner=owner;
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(Double price) {
      this.price=price;
   }
   public String toString() {
      return super.toString()+ "OWNER : "+owner+" PRICE : "+price;
   }
   public boolean equals(Object obj)
   {
   if (!(obj instanceof Vehicle))
   return false;
   Vehicle other = (Vehicle)obj;
   return owner.equals(other.owner) && (price == other.price);
   }

   
}
