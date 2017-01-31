
//CS141
//Project 4 – Exceptions
//March 17th 2015

public class InvalidNameException extends Exception
{
   public InvalidNameException()
   {
      super("Invalid name: ");
   }
   public InvalidNameException(String e)
   {
      super("Invalid name: " + e);
   }
}
