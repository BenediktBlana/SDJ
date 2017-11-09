import java.security.Provider.Service;
import java.util.*;

public class ServiceBook
{
   private ArrayList<Service> services;

   public ServiceBook()
   {
      this.services = new ArrayList<>();
   }

   public void addService(Service service)
   {
      this.services.add(service);
   }

   public Service getService(int index)
   {
      return services.get(index);
   }

   public Service getAllService()
   {
      Service[] ser = new Service[services.size()];
      for (int i = 0; i < services.size(); i++)
      {
         ser[i] = services.get(i);
      }
      return ser;
   }

   public int[] getAllServiceMileages()
   {
      int[] wtf = new int[services.size()];
      for (int i = 0; i < services.size(); i++)
      {
         wtf[i] = services.get(i).getMileage();
      }
      return wtf;
   }

   public boolean hasServiceOnDate(Date date)
   {
      for (int i = 0; i < services.size(); i++)
      {
         if (date.equals(services.get(i).getDate()))
         {
            return true;
         }
      }
      return false;

   }

   public Date getDateOfLastService()
   {
      return services.get(services.size());
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof ServiceBook))
      {
         return false;
      }
      ServiceBook other = (ServiceBook) obj; 
      return services.equals(other.services);
   }
   public String toString() {
      String x="";
      for (int i = 0; i < services.size(); i++)
      {
         x += services.get(i).;
      }
      return x;
   }
   
}
