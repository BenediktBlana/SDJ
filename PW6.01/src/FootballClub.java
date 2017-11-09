import java.util.*;

public class FootballClub
{
   private String name;
   private FootballPlayer player;
   private ArrayList<FootballPlayer> team;

   public FootballClub(String name)
   {
      this.name = name;
      this.team = new ArrayList<FootballPlayer>();
   }

   public void signPlayer(FootballPlayer player, String fieldPosition,
         int number)
   {
      this.team.add(player);
      player.setFieldPosition(fieldPosition);
      player.assignNumber(number);
   }

   public void trainGoalkeepers(int skill)
   {
      for (int i = 0; i < team.size(); i++)
      {
         if (team.get(i).getFieldPosition() == "Goalkeeper")
         {
            this.player.train(skill + 10);
         }
      }
   }

   public void trainOutfieldPlayers(int skill)
   {
      for (int i = 0; i < team.size(); i++)
      {
        
         if (team.get(i).getFieldPosition().equals("Defender"))
         {
            this.player.train(skill + 10);
         }
         if (team.get(i).getFieldPosition().equals("MidFielder"))
         {
            this.player.train(skill + 10);
         }
         if (team.get(i).getFieldPosition().equals("Forward"))
         {
            this.player.train(skill + 10);
         }
      }

   }

   public FootballPlayer getCaptain()
   {
      
      for (int i = 0; i < team.size(); i++)
      {
         if (team.get(i).getIsCaptain() == true)
         {
           
            return team.get(i) ;
         }
      }
      return null;
      
   }
   public void setNewCaptain(int number) {
      
      for (int i = 0; i < team.size(); i++) {
         if (team.get(i).getIsCaptain() == true)
         {
            this.team.get(i).setIsCaptain(false);
         }
      }
      this.team.get(number).setIsCaptain(true);
      
   }
   public ArrayList<FootballPlayer> getPlayersInPosition(String fieldPosition){
      ArrayList<FootballPlayer> list = new ArrayList<>();
      for (int i = 0; i < team.size(); i++) {
         if(team.get(i).getFieldPosition().equals(fieldPosition)) {
            team=list;
         }
      }
    return list;
   }
   public String toString() {
      String newLine = System.getProperty("line.separator");
      String all="NAME OF THE CLUB :"+name+newLine;
      
      for (int i = 0; i < team.size(); i++)
      {
         all+= team.get(i).toString()+newLine;
      }
       
      
      return all;
   }
}
