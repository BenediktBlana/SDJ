public class MyDate
{
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public void setDay(int day)
   {
      this.day = day;
      if(day<1)
      {
         this.day=1;
      }
      if(day>numberOfDaysInMonth())
      {
         this.day=numberOfDaysInMonth();
      }
      
   }

   public void setMonth(int month)
   {
      this.month = month;
      if(month<1)
      {
         this.month=1;
      }
      if(month>12)
      {
         this.month=12;
      }
   }

   public void setYear(int year)
   {
      this.year=year;
      if(year<1)
      {
         this.year = year*-1 ;
      }
    
   }

   public int getDay()
   {
      return day ;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public boolean isLeapYear()
   {
      boolean y = true;
      boolean f = false;
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
      {
         Boolean b = true;
         return b;
      }
      else
      {
         Boolean n = false;
         return n;
      }
   }

   public int numberOfDaysInMonth()
   {  
    
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
      {
         int a = 31;
         return 1;
      }
      if (month == 2 || isLeapYear())
      {
         int b = 29;
         return b;
      }

      if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         int d = 30;
         return d;
      }
      else
      {
         int c = 28;
         return c;
      }
   }
   
   public String toString()
   {
      String all = "";
      if (day < 10)
      {
         all += "0";
      }
      all += day + "/";
      if (month < 10)
      {
         all += "0";
      }
      all += month + "/" + year;

      return all;
   }
}
