
public class FootballPlayer
{
   private String name;
   private int skill;
   private int number;
   private String fieldPosition;
   private boolean isCaptain;
   
      public FootballPlayer(String name, int skill) {
         this.name=name;
         this.skill=skill;
      }
      public String getName() {
         return name;
      }
      public int getNumber() {
         return number;
         
      }
      public void assignNumber(int number) {
         this.number=number;
      }
      public int getSkill() {
         return skill;
      }
      public void train(int skill) {
         this.skill=skill;
      }
      public String getFieldPosition() {
         return fieldPosition;
      }
      public void setFieldPosition(String fieldPosition) {
         this.fieldPosition=fieldPosition;
         
      }
      public boolean getIsCaptain() {
      
       
         if(isCaptain==true) {
         return true;
         }
         else {
            return false;
         }
      }
      public void setIsCaptain(boolean isCaptain) {
         this.isCaptain=true;
      }
      public String toString() {
         
         String x="NAME :"+name+", NUMBER :"+number+", SKILL :"+skill+", POSITION :"+fieldPosition+",CAPTAIN : No";
         if(isCaptain==true) {
            x="NAME :"+name+", NUMBER :"+number+", SKILL :"+skill+", POSITION :"+fieldPosition+",CAPTAIN : YES";
         }
               return x;
      }
}
