import java.util.Scanner;
public class MyDateTest
{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int day;
      int month;
      int year;
      System.out.println("enter day");
      day=in.nextInt();
      System.out.println("enter month");
      month=in.nextInt();
      System.out.println("enter year");
      year=in.nextInt();
      
      MyDate box = new MyDate(day,month,year);
      System.out.println("date is "
            + "" + box.toString());
}

   
}

