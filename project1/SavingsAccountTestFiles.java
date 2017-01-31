
//CS141
//Project 1 - Savings Account Test File
//1/23/2015


import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class SavingsAccountTestFiles
{
//read file


	public static void main(String[] args)throws IOException
	{

	double withdrawlSum= 0;
	double depositSum = 0;
	double totalBalance;

	double interestRate;
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter the savings account's annual interest rate: ");
	interestRate = kb.nextDouble();

	SavingsAccount	derp = new SavingsAccount(500.0, interestRate);




//read withdrawl
                File myFile = new File("Withdrawals.txt");
                Scanner withdrawl = new Scanner(myFile);


                while (withdrawl.hasNext())
                {
                double m = withdrawl.nextDouble();
                withdrawlSum = withdrawlSum + m;
                }
	
		derp.withdrawl(withdrawlSum);
		
//read deposit

	
                File myFile2 = new File("Deposits.txt");
                Scanner deposit = new Scanner(myFile2);


                while (deposit.hasNext())
                {
                double n = deposit.nextDouble();
                depositSum = depositSum + n;
                }
		
		derp.deposit(depositSum);
		derp.addInterest();

		
                System.out.printf("Interest earned: $" + "%5.2f\n", derp.getInterestRate());

		System.out.printf("Ending balance: $" + "%5.2f\n", derp.getBalance());
	}
}
