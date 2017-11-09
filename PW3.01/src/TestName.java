import java.util.Scanner;
public class TestName
{  
   public static void main(String[] args) {Scanner in = new Scanner(System.in);
       String firstName;
       String lastName;
       char gender;
       
       
       System.out.println("Enter first name :");
       firstName=in.nextLine();
       System.out.println("Enter last name :");
       lastName=in.nextLine();
       System.out.println("Gender M/F?");
       gender=i.nextChar();
       
       Name box = new Name( firstName,lastName);
       box.setFirstName(firstName);
       box.setLastName(lastName);
       
       System.out.println(box.getFullName());
      
       
}
}

