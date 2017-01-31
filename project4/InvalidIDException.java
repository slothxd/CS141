
//CS141
//Project 4 – Exceptions
//March 17th 2015

public class InvalidIDException extends Exception
{
   public InvalidIDException()
   {
      super("Invalid ID number: ");
   }
   public InvalidIDException(int id)
   {
      super("Invalid ID number: " + id);
   }
}
