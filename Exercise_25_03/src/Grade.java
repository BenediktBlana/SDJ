import java.lang.*;
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

   public void setGrade(int grade) throws Exception{
      if () 
         throw new Exception("Illegal Argument");
      
     this.grade = grade;
   }
   

   public static boolean isLegalGrade(int grade)
   {
      if (grade == -3||grade == 0||grade == 2||grade == 4||grade == 7||grade == 10||grade == 12)
      {
         return true;

      }
      else {
         return false;
      }
   }

   public String toString()
   {
      String x;
      x = "Course name : " + courseName + " Grade : " + grade;
      return x;
   }
}
