
//CS141
//Project 4 – Exceptions
//March 17th 2015


public class Payroll
{
	private String EmployeeName;
	private int IDNumber;
	private double HourlyPayRate;
	private double HourWorked;


public Payroll(String e, int id)  throws InvalidNameException, 
					 InvalidIDException
{
	setEmployeeName(e);
	setID(id);

}

public void setEmployeeName(String e) throws InvalidNameException
{
	if (e == null || e == "") 
	{
		throw new InvalidNameException(e);
	}
	else
	{
		EmployeeName = e;
	}
}

public void setID(int id) throws InvalidIDException
{
	if (id < 0) 
		throw new InvalidIDException(id);
	IDNumber = id;
}

public void setPayRate(double pr) throws InvalidHourlyRateException
{
	if (pr < 0 || pr > 25)
		throw new InvalidHourlyRateException(pr);
	HourlyPayRate = pr;
}
public void setHoursWorked(double h) throws InvalidHoursException
{
	if (h < 0 || h > 84)
		throw new InvalidHoursException(h);
	HourWorked = h;
}

public String getName()
{
	return EmployeeName;
}

public int getID()
{
	return IDNumber;
}

public double getPayRate()
{
	return HourlyPayRate;
}
  
public double getHoursWorked()
{
	return HourWorked;
}


}
