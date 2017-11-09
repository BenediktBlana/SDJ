import java.util.Scanner;

public class ClockTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int hour;
      int minute;
      int second;
      System.out.println("enter hour :");
      hour = in.nextInt();
      System.out.println("enter minute :");
      minute = in.nextInt();
      System.out.println("enter second :");
      second = in.nextInt();

      Clock box1 = new Clock(hour, minute, second);
      box1.getHour();
      box1.getMinute();
      box1.getSecond();
      box1.toString();
      box1.getTotalSeconds();
      System.out.println("the time is :" + box1.toString());
      System.out.println("total seconds :" + box1.getTotalSeconds());
      box1.Tick();
      System.out.println("after tick " + box1);
      System.out.println("copied clock  " + box1.copy());

      int hour2;
      int minute2;
      int second2;
      
      System.out.println("enter new hour :");
      hour2 = in.nextInt();
      System.out.println("enter new minute :");
      minute2 = in.nextInt();
      System.out.println("enter new second :");
      second2 = in.nextInt();

      Clock box2 = new Clock(hour2, minute2, second2);
      System.out.println("NEW CLOCK  "+box2);

      if (box1.equals(box2))
      {
         System.out.println("clock are the same");
      }
      else
      {
         System.out.println("Clock are NOT the same");
      }
      
      if(box1.isBefore(box2))
      {
         System.out.println("Clock 1 is before clock 2");
      }
      else
      {
         System.out.println("Clock 1 is NOT before clock 2");
      }
     
   
      Clock box3 = box1.timeTo(box2);
      System.out.println("time from clock 1 to clock 2  :"+box1.timeTo(box2));
     
     in.close();
   }
}