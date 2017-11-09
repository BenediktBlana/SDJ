
public class FootballTest
{

   public static void main(String[] args)
   {
     FootballClub barca= new FootballClub("FC Barcelona");
     FootballPlayer Messi= new FootballPlayer("Messi",99);
     FootballPlayer Neymar= new FootballPlayer("Neymar",98);
   
   
     Neymar.assignNumber(18);
     Messi.assignNumber(10);
     Neymar.setFieldPosition("Defender");
     Messi.setFieldPosition("Forward");
     Messi.setIsCaptain(true);
     
     
     
   
    
     barca.signPlayer(Neymar, "Defender", 18);
     barca.signPlayer(Messi, "Forward", 10);
     System.out.println(barca.toString());
     
  
   
   }

}
