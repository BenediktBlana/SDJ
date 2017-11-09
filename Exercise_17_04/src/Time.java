
public class Time
{
      private int hour;
      private int minute;
      private int second;
      
      public Time(int hour, int minute, int second)
      {
         this.hour=hour;
         this.minute=minute;
         this.second=second;
      }
      
      public Time(int timeInSeconds)
      {
         hour=timeInSeconds/3600;
         minute=(timeInSeconds-hour*3600)/60;
         second=timeInSeconds-hour*3600-minute*60;         
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
      
      public int getTimeInSeconds()
      {
         return hour*3600+minute*60+second;
      }
      
      public String toString()
      {
         String digitH="";
         String digitM="";
         String digitS="";
         if(hour>=0&&hour<10) digitH="0";
         if(minute>=0&&minute<10) digitM="0";
         if(second>=0&&second<10) digitS="0";
         return digitH+hour+":"+digitM+minute+":"+digitS+second;
      }
}
