import java.util.ArrayList;

public class Forum
{
   private String name;
   private ArrayList<Post> myArrayList;

   public Forum(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void addPost(String content,MyDate date, Member member)
   {  
      Post other = new Post(content,date,member);
      myArrayList.add(other);
     
   }

   public void removePost(String content,MyDate date, Member member)
   {   
     Post other = new Post(content,date,member);
     myArrayList.remove(other);
   }

  
}
