
public class TestGrade
{
      public static void main(String[]args)
      {
         GradeList list = new GradeList(4);
         
         list.addGrade(new Grade("SDJ1", 12));
         list.addGrade(new Grade("RWD1", 10));
         list.addGrade(new Grade("MSE", 7));
         list.addGrade(new Grade("SEP1", 12));
         
         System.out.println(list);
         System.out.println("Average grade; " + list.getAverage());
         
      }
}
