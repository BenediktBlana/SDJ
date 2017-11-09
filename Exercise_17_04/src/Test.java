
public class Test
{
   public static void main(String[] args)
   {
      
      Mp3Player one = new Mp3Player();

      one.addSong(new Song("(shiva)", "Kasabian", new Time(0, 1, 07)));
      one.addSong(new Song("bumblebee", "Kasabian", new Time(0, 4, 01)));
      one.addSong(new Song("stevie", "Kasabian", new Time(0, 4, 45)));
      one.addSong(new Song("(mortis)", "Kasabian", new Time(0, 0, 48)));
      one.addSong(new Song("doomsday", "Kasabian", new Time(0, 3, 40)));
      one.addSong(new Song("treat", "Kasabian", new Time(0, 6, 53)));
      one.addSong(new Song("glass", "Kasabian", new Time(0, 4, 48)));
      one.addSong(new Song("explodes", "Kasabian", new Time(0, 4, 18)));
      one.addSong(new Song("(levitation)", "Kasabian", new Time(0, 1, 19)));
      one.addSong(new Song("clouds", "Kasabian", new Time(0, 4, 45)));
      one.addSong(new Song("eez-eh", "Kasabian", new Time(0, 3, 00)));
      one.addSong(new Song("bow", "Kasabian", new Time(0, 4, 27)));
      one.addSong(new Song("s.p.s.", "Kasabian", new Time(0, 4, 22)));
      
      System.out.println(one.getLength());
      System.out.println(one.getSong(10));
      System.out.println(one.getNumberOfSongs());
      System.out.println(one);
      System.out.println("Number of songs longer than 200 seconds : "+one.getNumberOfSongsLongerThan(length));
     
   }
}
