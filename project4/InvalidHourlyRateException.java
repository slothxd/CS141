
//CS141
//Project 4 – Exceptions
//March 17th 2015

public class InvalidHourlyRateException extends Exception
{
   public InvalidHourlyRateException()
   {
      super("Invalid hourly pay rate: ");
   }
   public InvalidHourlyRateException(double pr)
   {
      super("Invalid hourly pay rate: " + pr);
   }
}
