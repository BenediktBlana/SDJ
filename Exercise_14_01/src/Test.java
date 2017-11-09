import java.util.Scanner;
public class Test
{

   public static void main(String[] args)
   { Scanner in = new Scanner(System.in);
   int hour;
   int minute;
   int second;
   String artist;
   String title;
   
   
   System.out.println("enter artist :");
   artist=in.nextLine();
   System.out.println("enter title :");
   title=in.nextLine();
   System.out.println("enter hour :");
   hour=in.nextInt();
   System.out.println("enter minute :");
   minute=in.nextInt();
   System.out.println("enter second :");
  second=in.nextInt();
   
     Time time = new Time( hour, minute, second);
  Song song=new Song(title,artist,time);
  System.out.println("time is "+time.toString());
  System.out.println("time in seconds is "+time.getTimeInSeconds());
  System.out.println(song.toString());
  
  in.close();
  
  
     

   }

}
