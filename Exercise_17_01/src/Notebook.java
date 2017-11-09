import java.util.ArrayList;

public class Notebook
{
   private ArrayList<PriorityNote> notes;

   public Notebook()
   {
      notes = new ArrayList<>();
   }

   public int getSize()
   {
      return notes.size();
   }

   public void addNote(PriorityNote note)
   {
      notes.add(note.copy());
   }

   public void addHighPriorityNote(String note)
   {
      PriorityNote myNote = new PriorityNote(note);
      myNote.setHighPriority();
      notes.add(myNote);
   }
   public int maxSize(int max)
   {  
      max = 0;
      return notes.size;
   }

   public String getNote()
   {
      return notes.add();
   }

   public boolean isHighPriorityNote(int index)
   {
      return notes[index].isHighPriorityNote();
   }

   public int indexOfMostImportantNote()
   {
      for (int i = ; i < ; i++)
      {
         if (isHighPriorityNote(i))
            return i;
      }
      if (size > 0)
         return 0;
      else
         return -1;
   }

   public String getMostImportantNote()
   {
      int index = indexOfMostImportantNote();
      if (index > -1)
         return notes[index].getNote();
      return null;
   }

   public void removeNote(int index)
   {
      for (int i = index; i < size - 1; i++)
      {
         notes[i] = notes[i + 1];
      }
      notes[size - 1] = null; // clean up
      size--;
   }

   public String toString()
   {
      String s = "";
      for (int i = 0; i < size; i++)
      {
         s += "Note #" + (i + 1) + ": " + notes[i];
         if (i < size - 1)
         {
            s += "\n";
         }
      }
      return s;
   }
}