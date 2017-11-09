
public class Champion
{
   private String championName;
   private boolean isAD;
   private boolean hasSkillShot;
   private String weakOrStrongAgainst;

   public Champion(String championName, boolean isAD, boolean hasSkillShot,
         String weakOrStrongAgainst)
   {
      this.championName = championName;
      this.isAD = isAD;
      this.hasSkillShot = hasSkillShot;
      this.weakOrStrongAgainst = weakOrStrongAgainst;
   }
   public String getChampionName()
   {
      return championName;
   }
   public boolean isAD()
   {
      return this.isAD;
   }
   public void setIsAD(boolean isAD)
   {
      this.isAD=isAD;
   }
   public boolean isSkillShot()
   {
      return this.hasSkillShot;
   }
   public void setSkillShot(boolean isSkillShot)
   {
      this.hasSkillShot = isSkillShot;
   }
   public String getWeakOrStrongAgainst()
   {
      return this.weakOrStrongAgainst;
   }
   public void setWeakOrStrongAgainst(String weakOrStrongAgainst)
   {
      this.weakOrStrongAgainst=weakOrStrongAgainst;
   }
   public void buyItem(Item item)
   {
      this.buyItem(item);
   }
   
   
   

}
