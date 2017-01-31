
//CS141
//Project 1 - Savings Account
//1/23/2015



public class SavingsAccount
	{
	private double balance;
	private double interestRate;
	

	public SavingsAccount(double bal, double intRate)
	{
	balance =  bal;
	interestRate =  intRate;
	}

	public void withdrawl(double amount)

	{


		balance = balance - amount;
		
	}	


	public void deposit(double amount2)

        {
                balance = balance + amount2;


        }



	public void addInterest()
	{
		balance = balance+ (interestRate/12 * balance);
	}


	public double getBalance()
	{
		return balance;
	}

	public double getInterestRate()
	{
		return (balance*interestRate/12);

	}


}
