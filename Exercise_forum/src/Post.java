public class Post
{
   private String content;
   private MyDate date;
   private Member member;
   
   public Post(String content,MyDate date, Member member)
   {
      this.content=content;
      this.date=date;
      this.member=member;
   }
   public String getContent()
   {
      return content;
   }
   public Member getMember()
   {
      return member;
   }
   public MyDate getDate()
   {
      return date;
   }
   public void edit(String newContent)
   {
      this.content=newContent;
   }
   public String toString()
   {
      String x = "Content : "+ content + " date :"+date+" member: "+member;
      return x;
   }
   
}
