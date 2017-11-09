public class Grade
{
   private String courseName;
   private int grade;

   public Grade(String courseName, int grade)
   {
      this.courseName = courseName;
      this.grade = grade;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public int getGrade()
   {
      return grade;
   }

   public void setGrade(int grade)
   {
      this.grade = grade;
   }

   public String toString()
   {
      return courseName + " (" + grade + ")";
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Grade))
      {
         return false;
      }
      Grade other = (Grade) obj;
      return grade == other.grade && courseName.equals(other.courseName);
   }
}
