
public class GradeList
{
   private int size;
   private Grade[] grades;

   public GradeList(int maxNumberOfGrades)
   {
      this.size = 0;
      this.grades = new Grade[maxNumberOfGrades];
   }

   public int getSize()
   {
      return size;

   }

   public Grade getGrade(int index)
   {
      return grades[index];
   }

   public void addGrade(Grade grade)
   {
      if (size < grades.length)
      {
         grades[size] = grade;
         size++;
      }
   }

   public Grade[] getAllGrades()
   {
      Grade[] allGrades = new Grade[size];
      for (int i = 0; i < size; i++)
      {
         allGrades[i] = grades[i];
      }
      return allGrades;
   }

   public double getAverage()
   {
      int sum = 0;
      for (int i = 0; i < size; i++)
      {
         sum += grades[i].getGrade();
      }
      double average = (double) sum / size;
      return average;
   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i < size; i++)
      {
         s += grades[i];
         if (i < size - 1)
         {
            s += ", ";
         }
      }

      return s;
   }
}
