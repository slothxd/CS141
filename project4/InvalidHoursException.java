
//CS141
//Project 4 – Exceptions
//March 17th 2015

public class InvalidHoursException extends Exception
{
   public InvalidHoursException() 
   {
      super("Invalid number of hours: ");
   }
   public InvalidHoursException(double h) 
   {
      super("Invalid number of hours: " + h);
   }
}
