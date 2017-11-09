
public class Item
{
      private String itemName;
      private int itemPrice;
      private String itemDescription;
      
  public Item(String itemName,int itemPrice,String itemDescription)
  {
     this.itemName=itemName;
     this.itemPrice=itemPrice;
     this.itemDescription=itemDescription;
  }
  public Item(String itemName,int itemPrice)
  {
     this.itemName=itemName;
     this.itemPrice=itemPrice;
  }
  public String getItemName()
  {
     
     return itemName;
  }
  public int getItemPrice()
  {
     return itemPrice;
  }
  public String getItemDescription()
  {
     
     return itemDescription;
  }
  public void setItemName(String itemName)
  {
     this.itemName=itemName;
  }
  public void setItemPrice(int itemPrice)
  {
     this.itemPrice = itemPrice;
  }
  public void setItemDescription(String itemDescription)
  {
     this.itemDescription=itemDescription;
  }
  public void set(String itemName, int itemPrice, String itemDescription)
  {
     this.itemName=itemName;
     this.itemPrice=itemPrice;
     this.itemDescription=itemDescription;
  }
  public String toString()
  {
     String x;
     x="ITEM NAME : "+itemName+" ITEM PRICE : "+itemPrice+" ITEM DESCRIPTION : "+itemDescription;
     return x;
  }
  public String getFullDescription()
  {
     return toString();
  }
}
