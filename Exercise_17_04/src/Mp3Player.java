import java.util.ArrayList;

public class Mp3Player
{
   private ArrayList<Song> songs;

   public Mp3Player()
   {
      songs = new ArrayList<Song>();
   }

   public Time getLength()
   {
      int totalTime = 0;
      for (int i = 0; i < songs.size(); i++)
      {
         totalTime += songs.get(i).getLength().getTimeInSeconds();
      }
      Time total = new Time(totalTime);
      return total;
   }

   public Song getSong(int index)
   {
      return songs.get(index);
   }

   public void addSong(Song song)
   {
      songs.add(song);
   }

   public int getNumberOfSongs()
   {
      return songs.size();
   }
   

   public Song getSongsLongerThan(Time length)
   {
      
      length = new Time(210);
      for (int i = 0; i < songs.size(); i++)
      {
         if( > )
         {
            
         }
      }
      return getSongsLongerThan;
   }


   public String toString()
   {
      String s = "Song list:\n";
      for (int i = 0; i < songs.size(); i++)
      {
         s += (i + 1) + ": " + songs.get(i);
         if (i < songs.size() - 1)
            s += "\n";
      }
      return s;
   }
}
