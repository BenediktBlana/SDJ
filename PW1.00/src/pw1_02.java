
public class pw1_02
{

   public static void main(String[] args)
   {
      double[] array1;
      array1 = new double[] { 0, 1, 2.71, 3.14 };

      for (int i = 0; i < array1.length; i++)
      {
         {
            if (i<=2)
            {
               System.out.print(array1[i] + " , ");
            }
            else
            {
               System.out.print(array1[i]);
            }
         }

      }
   }
}