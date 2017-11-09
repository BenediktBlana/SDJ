
public class Time
{
   public class Clock
   {
      private int hour;
      private int minute;
      private int second;
      
    

      public Clock(int hour, int minute, int second)
      {
         this.hour = hour;
         this.minute = minute;
         this.second = second;
      }

      public Clock(int totalSeconds)
      {
         totalSeconds = getTotalSeconds();
      }

      public void set(int hour, int minute, int second)
      {
         this.hour = hour;
         this.minute = minute;
         this.second = second;
      }

      public void totalSeconds(int totalSeconds)
      {
         totalSeconds = getTotalSeconds();
      }

      public int getTotalSeconds()
      {
         return hour * 3600 + minute * 60 + second;
      }

      public int getHour()
      {
         return hour;
      }

      public int getMinute()
      {
         return minute;
      }

      public int getSecond()
      {
         return second;
      }

      public void Tick()
      {
         this.hour = hour;
         this.minute = minute;
         this.second = second + 1;

         if (second >= 60)
         {
            second = 0;
            minute = this.minute + 1;
         }
         if (this.minute >= 60)
         {
            minute = 0;
            this.hour = hour + 1;
         }
      }

      public Clock copy()
      {
         Clock other = new Clock(hour, minute, second);
         return other;
      }

      public boolean equals(Object obj)// be careful
      {
         if (!(obj instanceof Clock))
         {
            return false;
         }

         Clock other = (Clock) obj;

         return hour == other.hour && minute == other.minute
               && second == other.second;
      }

      public boolean isBefore(Clock box)
      {
         if(getTotalSeconds()<box.getTotalSeconds())
         {
            return true;
         }
         else {
            return false;
         }
      }
      
      public Clock timeTo(Clock other)
      { 
         Clock timeTo = new Clock(hour,minute,second);
        
        int diff = this.getTotalSeconds()-other.getTotalSeconds();
        timeTo.hour = diff / 3600;
        timeTo.minute = (diff % 3600) / 60;
        timeTo.second = diff % 60;
        return timeTo;
        
      }
      public String toString()
      {
         String all = "";

         if (hour < 10)
         {
            all += "0";
         }
         all += hour + ":";

         if (minute < 10)
         {
            all += "0";
         }
         all += minute + ":";

         if (second < 10)
         {
            all += "0";
         }
         all += second;
         return all;

      }
   }
}
