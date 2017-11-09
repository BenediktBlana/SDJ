
public class ItemList
{
   public int size;
   public Item[] items;

   public ItemList(int initialCapacity)
   {
      this.size = 0;
      this.items = new Item[initialCapacity];
   }

   public int getSize()
   {
      return size;
   }

   public void addItem(Item items)
   {
      this.items[size] = items;
   }

   public Item getItem(int index)
   {
      return this.items[index];
   }

   public Item getItem2(String itemName)
   {
      for (int i = 0; i < size; i++)
      {
         if (items[i].getItemName().equals(itemName))
         {
            return items[i];
         }
      }
      return null;
   }
   
   public Item getItem3(int itemPrice)
   {
      for (int i = 0; i < size; i++)
      {
         if(items[i].getItemPrice() == itemPrice)
        return items[i];
      }
      return null;
   }
   public int itemCounter(String itemName)
   {
      for (int i = 0; i < size; i++)
      {
         if(items[i].getItemName().equals(itemName))
        return i ;
      }
      return -1;
   }
   
   public String toString()
   {
      String all = "";
      for (int i = 0; i < size; i++)
      {
         all += items[i] + "\n";
      }
      return all;
   }
   public void expandCapacity()
   {
      Item[] expand = new Item[items.length+1];
      for (int i = 0; i < size; i++)
      {
        expand[i]= items[i];
         
      }
   }
}
